package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMSolidStroke
  extends CIMStroke
     with CIMSymbolLayerType {
  
  /**
    * The color that is applied to the stroke.
    */
  var color: js.UndefOr[js.Array[Double]] = js.native
  
  @JSName("type")
  var type_CIMSolidStroke: typings.arcgisJsApi.arcgisJsApiStrings.CIMSolidStroke = js.native
}
object CIMSolidStroke {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMSolidStroke): CIMSolidStroke = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMSolidStroke]
  }
  
  @scala.inline
  implicit class CIMSolidStrokeMutableBuilder[Self <: CIMSolidStroke] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMSolidStroke): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
