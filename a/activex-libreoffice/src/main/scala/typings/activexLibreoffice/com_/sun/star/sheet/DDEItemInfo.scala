package typings.activexLibreoffice.com_.sun.star.sheet

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes an item of a DDE connection.
  *
  * A DDE connection consists of the DDE service name, the DDE topic and a list of DDE items which may contain cached result sets.
  * @since OOo 3.1
  */
trait DDEItemInfo extends StObject {
  
  /** The name of the DDE item. */
  var Item: String
  
  /** The results of the item cached from the last update of the DDE link if available. This sequence may be empty. */
  var Results: SafeArray[SafeArray[js.Any]]
}
object DDEItemInfo {
  
  inline def apply(Item: String, Results: SafeArray[SafeArray[js.Any]]): DDEItemInfo = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], Results = Results.asInstanceOf[js.Any])
    __obj.asInstanceOf[DDEItemInfo]
  }
  
  extension [Self <: DDEItemInfo](x: Self) {
    
    inline def setItem(value: String): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setResults(value: SafeArray[SafeArray[js.Any]]): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
  }
}
