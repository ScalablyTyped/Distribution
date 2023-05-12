package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppInstanceBotSummary extends StObject {
  
  /**
    * The ARN of the AppInstanceBot.
    */
  var AppInstanceBotArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The metadata of the AppInstanceBot.
    */
  var Metadata: js.UndefOr[typings.awsSdk.clientsChimesdkidentityMod.Metadata] = js.undefined
  
  /**
    * The name of the AppInstanceBox.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
}
object AppInstanceBotSummary {
  
  inline def apply(): AppInstanceBotSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInstanceBotSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppInstanceBotSummary] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceBotArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceBotArn", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceBotArnUndefined: Self = StObject.set(x, "AppInstanceBotArn", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
