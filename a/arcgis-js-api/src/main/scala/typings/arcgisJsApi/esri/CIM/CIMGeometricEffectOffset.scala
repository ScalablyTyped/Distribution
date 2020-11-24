package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectOffset
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The way the strokes or fills are displayed at corners.
    */
  var method: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectOffsetMethod * / any */ String
  ] = js.native
  
  /**
    * The distance of the symbol perpendicular to the feature geometry.
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * The way the symbol handles complex geometries.
    */
  var option: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectOffsetOption * / any */ String
  ] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectOffset: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffset = js.native
}
object CIMGeometricEffectOffset {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffset): CIMGeometricEffectOffset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectOffset]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectOffsetOps[Self <: CIMGeometricEffectOffset] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffset): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectOffsetMethod * / any */ String
    ): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOption(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectOffsetOption * / any */ String
    ): Self = this.set("option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOption: Self = this.set("option", js.undefined)
  }
}
