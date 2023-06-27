package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminalProperties extends StObject {
  
  /**
  		 * A unique numeric identifer for the terminal.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-Terminal.html#id)
  		 */
  var id: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The name of the terminal.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-Terminal.html#name)
  		 */
  var name: js.UndefOr[String] = js.undefined
}
object TerminalProperties {
  
  inline def apply(): TerminalProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminalProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TerminalProperties] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
