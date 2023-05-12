package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisteredUserConsoleFeatureConfigurations extends StObject {
  
  /**
    * The state persistence configurations of an embedded Amazon QuickSight console.
    */
  var StatePersistence: js.UndefOr[StatePersistenceConfigurations] = js.undefined
}
object RegisteredUserConsoleFeatureConfigurations {
  
  inline def apply(): RegisteredUserConsoleFeatureConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisteredUserConsoleFeatureConfigurations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisteredUserConsoleFeatureConfigurations] (val x: Self) extends AnyVal {
    
    inline def setStatePersistence(value: StatePersistenceConfigurations): Self = StObject.set(x, "StatePersistence", value.asInstanceOf[js.Any])
    
    inline def setStatePersistenceUndefined: Self = StObject.set(x, "StatePersistence", js.undefined)
  }
}
