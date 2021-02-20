package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectArrow
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The type of arrow to be displayed.
    */
  var geometricEffectArrowType: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectArrowType * / any */ String
  ] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectArrow: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectArrow = js.native
  
  /**
    * The distance between the lines that construct the body of the arrow.
    */
  var width: js.UndefOr[Double] = js.native
}
object CIMGeometricEffectArrow {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectArrow): CIMGeometricEffectArrow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectArrow]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectArrowMutableBuilder[Self <: CIMGeometricEffectArrow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeometricEffectArrowType(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectArrowType * / any */ String
    ): Self = StObject.set(x, "geometricEffectArrowType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometricEffectArrowTypeUndefined: Self = StObject.set(x, "geometricEffectArrowType", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectArrow): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
