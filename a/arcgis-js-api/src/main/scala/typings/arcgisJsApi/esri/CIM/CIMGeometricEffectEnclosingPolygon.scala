package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
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
  implicit class CIMGeometricEffectEnclosingPolygonMutableBuilder[Self <: CIMGeometricEffectEnclosingPolygon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectEnclosingPolygonMethod * / any */ String
    ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectEnclosingPolygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
