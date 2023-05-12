package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConfiguredTableInput extends StObject {
  
  /**
    * The identifier for the configured table to update. Currently accepts the configured table ID.
    */
  var configuredTableIdentifier: ConfiguredTableIdentifier
  
  /**
    * A new description for the configured table.
    */
  var description: js.UndefOr[TableDescription] = js.undefined
  
  /**
    * A new name for the configured table.
    */
  var name: js.UndefOr[DisplayName] = js.undefined
}
object UpdateConfiguredTableInput {
  
  inline def apply(configuredTableIdentifier: ConfiguredTableIdentifier): UpdateConfiguredTableInput = {
    val __obj = js.Dynamic.literal(configuredTableIdentifier = configuredTableIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfiguredTableInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateConfiguredTableInput] (val x: Self) extends AnyVal {
    
    inline def setConfiguredTableIdentifier(value: ConfiguredTableIdentifier): Self = StObject.set(x, "configuredTableIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: TableDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: DisplayName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
