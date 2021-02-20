package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
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
  implicit class CIMGeometricEffectExtensionMutableBuilder[Self <: CIMGeometricEffectExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeflection(value: Double): Self = StObject.set(x, "deflection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeflectionUndefined: Self = StObject.set(x, "deflection", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setOrigin(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectExtensionOrigin * / any */ String
    ): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectExtension): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
