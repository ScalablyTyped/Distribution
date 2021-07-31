package typings.awsGreengrassCoreSdk

import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.AllOrError
import typings.awsGreengrassCoreSdk.awsGreengrassCoreSdkStrings.BestEffort
import typings.node.Buffer
import typings.std.ArrayLike
import typings.std.Blob
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aws-greengrass-core-sdk", "IotData")
  @js.native
  class IotData () extends StObject {
    
    def publish(params: PublishParams, callback: IotCallback): Unit = js.native
  }
  
  type IotCallback = js.Function2[/* error */ Error | Null, /* data */ IotCallbackData | Null, Unit]
  
  trait IotCallbackData extends StObject {
    
    var payload: Buffer | Blob | String | ArrayLike[js.Any]
  }
  object IotCallbackData {
    
    @scala.inline
    def apply(payload: Buffer | Blob | String | ArrayLike[js.Any]): IotCallbackData = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[IotCallbackData]
    }
    
    @scala.inline
    implicit class IotCallbackDataMutableBuilder[Self <: IotCallbackData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: Buffer | Blob | String | ArrayLike[js.Any]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  trait PublishParams extends StObject {
    
    var payload: Buffer | Blob | String | ArrayLike[js.Any]
    
    var queueFullPolicy: js.UndefOr[AllOrError | BestEffort] = js.undefined
    
    var topic: String
  }
  object PublishParams {
    
    @scala.inline
    def apply(payload: Buffer | Blob | String | ArrayLike[js.Any], topic: String): PublishParams = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublishParams]
    }
    
    @scala.inline
    implicit class PublishParamsMutableBuilder[Self <: PublishParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: Buffer | Blob | String | ArrayLike[js.Any]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueFullPolicy(value: AllOrError | BestEffort): Self = StObject.set(x, "queueFullPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueueFullPolicyUndefined: Self = StObject.set(x, "queueFullPolicy", js.undefined)
      
      @scala.inline
      def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
}
