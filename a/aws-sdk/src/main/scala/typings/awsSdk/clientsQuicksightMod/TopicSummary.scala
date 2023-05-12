package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the topic.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Arn] = js.undefined
  
  /**
    * The name of the topic.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The ID for the topic. This ID is unique per Amazon Web Services Region for each Amazon Web Services account.
    */
  var TopicId: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TopicId] = js.undefined
}
object TopicSummary {
  
  inline def apply(): TopicSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTopicId(value: TopicId): Self = StObject.set(x, "TopicId", value.asInstanceOf[js.Any])
    
    inline def setTopicIdUndefined: Self = StObject.set(x, "TopicId", js.undefined)
  }
}
