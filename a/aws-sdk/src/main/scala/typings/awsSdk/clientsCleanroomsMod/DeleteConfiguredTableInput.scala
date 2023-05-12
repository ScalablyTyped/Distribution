package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConfiguredTableInput extends StObject {
  
  /**
    * The unique ID for the configured table to delete.
    */
  var configuredTableIdentifier: ConfiguredTableIdentifier
}
object DeleteConfiguredTableInput {
  
  inline def apply(configuredTableIdentifier: ConfiguredTableIdentifier): DeleteConfiguredTableInput = {
    val __obj = js.Dynamic.literal(configuredTableIdentifier = configuredTableIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfiguredTableInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteConfiguredTableInput] (val x: Self) extends AnyVal {
    
    inline def setConfiguredTableIdentifier(value: ConfiguredTableIdentifier): Self = StObject.set(x, "configuredTableIdentifier", value.asInstanceOf[js.Any])
  }
}
