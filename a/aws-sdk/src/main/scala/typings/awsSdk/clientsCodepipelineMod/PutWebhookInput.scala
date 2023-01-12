package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutWebhookInput extends StObject {
  
  /**
    * The tags for the webhook.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The detail provided in an input file to create the webhook, such as the webhook name, the pipeline name, and the action name. Give the webhook a unique name that helps you identify it. You might name the webhook after the pipeline and action it targets so that you can easily recognize what it's used for later.
    */
  var webhook: WebhookDefinition
}
object PutWebhookInput {
  
  inline def apply(webhook: WebhookDefinition): PutWebhookInput = {
    val __obj = js.Dynamic.literal(webhook = webhook.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutWebhookInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutWebhookInput] (val x: Self) extends AnyVal {
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setWebhook(value: WebhookDefinition): Self = StObject.set(x, "webhook", value.asInstanceOf[js.Any])
  }
}
