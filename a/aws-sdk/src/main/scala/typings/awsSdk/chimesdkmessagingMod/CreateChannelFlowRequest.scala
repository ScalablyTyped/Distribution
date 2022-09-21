package typings.awsSdk.chimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChannelFlowRequest extends StObject {
  
  /**
    * The ARN of the channel flow request.
    */
  var AppInstanceArn: ChimeArn
  
  /**
    * The client token for the request. An Idempotency token.
    */
  var ClientRequestToken: typings.awsSdk.chimesdkmessagingMod.ClientRequestToken
  
  /**
    * The name of the channel flow.
    */
  var Name: NonEmptyResourceName
  
  /**
    * Information about the processor Lambda functions.
    */
  var Processors: ProcessorList
  
  /**
    * The tags for the creation request.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateChannelFlowRequest {
  
  inline def apply(
    AppInstanceArn: ChimeArn,
    ClientRequestToken: ClientRequestToken,
    Name: NonEmptyResourceName,
    Processors: ProcessorList
  ): CreateChannelFlowRequest = {
    val __obj = js.Dynamic.literal(AppInstanceArn = AppInstanceArn.asInstanceOf[js.Any], ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Processors = Processors.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateChannelFlowRequest]
  }
  
  extension [Self <: CreateChannelFlowRequest](x: Self) {
    
    inline def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setName(value: NonEmptyResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setProcessors(value: ProcessorList): Self = StObject.set(x, "Processors", value.asInstanceOf[js.Any])
    
    inline def setProcessorsVarargs(value: Processor*): Self = StObject.set(x, "Processors", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
