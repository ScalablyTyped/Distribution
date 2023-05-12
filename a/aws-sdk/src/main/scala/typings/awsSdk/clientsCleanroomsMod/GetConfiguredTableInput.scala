package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConfiguredTableInput extends StObject {
  
  /**
    * The unique ID for the configured table to retrieve.
    */
  var configuredTableIdentifier: ConfiguredTableIdentifier
}
object GetConfiguredTableInput {
  
  inline def apply(configuredTableIdentifier: ConfiguredTableIdentifier): GetConfiguredTableInput = {
    val __obj = js.Dynamic.literal(configuredTableIdentifier = configuredTableIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfiguredTableInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetConfiguredTableInput] (val x: Self) extends AnyVal {
    
    inline def setConfiguredTableIdentifier(value: ConfiguredTableIdentifier): Self = StObject.set(x, "configuredTableIdentifier", value.asInstanceOf[js.Any])
  }
}
