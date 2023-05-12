package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatePersistenceConfigurations extends StObject {
  
  /**
    * Determines if a Amazon QuickSight dashboard's state persistence settings are turned on or off.
    */
  var Enabled: Boolean
}
object StatePersistenceConfigurations {
  
  inline def apply(Enabled: Boolean): StatePersistenceConfigurations = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatePersistenceConfigurations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatePersistenceConfigurations] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
  }
}
