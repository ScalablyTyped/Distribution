package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMSymbolBase extends StObject {
  
  var `type`: String
}
object CIMSymbolBase {
  
  @scala.inline
  def apply(`type`: String): CIMSymbolBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMSymbolBase]
  }
  
  @scala.inline
  implicit class CIMSymbolBaseMutableBuilder[Self <: CIMSymbolBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
