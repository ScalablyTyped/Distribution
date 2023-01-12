package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMSolidStroke
  extends StObject
     with CIMStroke
     with CIMSymbolLayerType {
  
  /**
    * The color that is applied to the stroke.
    */
  var color: js.UndefOr[js.Array[Double]] = js.undefined
  
  @JSName("type")
  var type_CIMSolidStroke: typings.arcgisJsApi.arcgisJsApiStrings.CIMSolidStroke
}
object CIMSolidStroke {
  
  inline def apply(): CIMSolidStroke = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMSolidStroke")
    __obj.asInstanceOf[CIMSolidStroke]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMSolidStroke] (val x: Self) extends AnyVal {
    
    inline def setColor(value: js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMSolidStroke): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
