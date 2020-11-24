package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectOffsetTangent
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The origin of the tangent offset for the line. The beginning and end of the lines are defined by how the line was digitized.
    */
  var method: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectOffsetTangentMethod * / any */ String
  ] = js.native
  
  /**
    * The distance the geometry is moved tangent.
    */
  var offset: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectOffsetTangent: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffsetTangent = js.native
}
object CIMGeometricEffectOffsetTangent {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffsetTangent): CIMGeometricEffectOffsetTangent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectOffsetTangent]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectOffsetTangentOps[Self <: CIMGeometricEffectOffsetTangent] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffsetTangent): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectOffsetTangentMethod * / any */ String
    ): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
}
