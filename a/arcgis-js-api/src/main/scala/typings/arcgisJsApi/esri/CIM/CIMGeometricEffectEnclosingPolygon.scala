package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectEnclosingPolygon
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The method which specifies the way in which the polygon geometry is generated around the feature geometry.
    */
  var method: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectEnclosingPolygonMethod * / any */ String
  ] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectEnclosingPolygon: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectEnclosingPolygon = js.native
}
object CIMGeometricEffectEnclosingPolygon {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectEnclosingPolygon): CIMGeometricEffectEnclosingPolygon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectEnclosingPolygon]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectEnclosingPolygonOps[Self <: CIMGeometricEffectEnclosingPolygon] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectEnclosingPolygon): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectEnclosingPolygonMethod * / any */ String
    ): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
}
