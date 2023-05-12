package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppInstanceBot extends StObject {
  
  /**
    * The ARN of the AppInstanceBot.
    */
  var AppInstanceBotArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The data processing instructions for an AppInstanceBot.
    */
  var Configuration: js.UndefOr[typings.awsSdk.clientsChimesdkidentityMod.Configuration] = js.undefined
  
  /**
    * The time at which the AppInstanceBot was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which the AppInstanceBot was last updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The metadata for an AppInstanceBot.
    */
  var Metadata: js.UndefOr[typings.awsSdk.clientsChimesdkidentityMod.Metadata] = js.undefined
  
  /**
    * The name of the AppInstanceBot.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
}
object AppInstanceBot {
  
  inline def apply(): AppInstanceBot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInstanceBot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppInstanceBot] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceBotArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceBotArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceBotArnUndefined: Self = StObject.set(x, "AppInstanceBotArn", js.undefined)
    
    inline def setConfiguration(value: Configuration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
