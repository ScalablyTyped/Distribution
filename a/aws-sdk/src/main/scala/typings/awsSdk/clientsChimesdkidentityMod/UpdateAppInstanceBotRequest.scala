package typings.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAppInstanceBotRequest extends StObject {
  
  /**
    * The ARN of the AppInstanceBot.
    */
  var AppInstanceBotArn: ChimeArn
  
  /**
    * The metadata of the AppInstanceBot.
    */
  var Metadata: typings.awsSdk.clientsChimesdkidentityMod.Metadata
  
  /**
    * The name of the AppInstanceBot.
    */
  var Name: ResourceName
}
object UpdateAppInstanceBotRequest {
  
  inline def apply(AppInstanceBotArn: ChimeArn, Metadata: Metadata, Name: ResourceName): UpdateAppInstanceBotRequest = {
    val __obj = js.Dynamic.literal(AppInstanceBotArn = AppInstanceBotArn.asInstanceOf[js.Any], Metadata = Metadata.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAppInstanceBotRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAppInstanceBotRequest] (val x: Self) extends AnyVal {
    
    inline def setAppInstanceBotArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceBotArn", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
