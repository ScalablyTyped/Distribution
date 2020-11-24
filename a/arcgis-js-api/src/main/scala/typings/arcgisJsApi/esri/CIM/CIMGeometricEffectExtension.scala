package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectExtension
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The deflection angle used for the extension. A value of 0 indicates no deflection.
    */
  var deflection: js.UndefOr[Double] = js.native
  
  /**
    * The length of the extension that is dynamically created.
    */
  var length: js.UndefOr[Double] = js.native
  
  /**
    * The origin of the extension to add to the line. The beginning and end of the line is defined by the direction the line was digitized.
    */
  var origin: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectExtensionOrigin * / any */ String
  ] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectExtension: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectExtension = js.native
}
object CIMGeometricEffectExtension {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectExtension): CIMGeometricEffectExtension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectExtension]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectExtensionOps[Self <: CIMGeometricEffectExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectExtension): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeflection(value: Double): Self = this.set("deflection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeflection: Self = this.set("deflection", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setOrigin(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectExtensionOrigin * / any */ String
    ): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
  }
}
