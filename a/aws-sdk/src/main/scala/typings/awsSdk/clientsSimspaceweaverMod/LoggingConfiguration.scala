package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingConfiguration extends StObject {
  
  /**
    * A list of the locations where SimSpace Weaver sends simulation log data.
    */
  var Destinations: js.UndefOr[LogDestinations] = js.undefined
}
object LoggingConfiguration {
  
  inline def apply(): LoggingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoggingConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDestinations(value: LogDestinations): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: LogDestination*): Self = StObject.set(x, "Destinations", js.Array(value*))
  }
}
