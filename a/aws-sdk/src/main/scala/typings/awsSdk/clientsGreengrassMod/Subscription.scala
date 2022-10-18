package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscription extends StObject {
  
  /**
    * A descriptive or arbitrary ID for the subscription. This value must be unique within the subscription definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
    */
  var Id: string
  
  /**
    * The source of the subscription. Can be a thing ARN, a Lambda function ARN, a connector ARN, 'cloud' (which represents the AWS IoT cloud), or 'GGShadowService'.
    */
  var Source: string
  
  /**
    * The MQTT topic used to route the message.
    */
  var Subject: string
  
  /**
    * Where the message is sent to. Can be a thing ARN, a Lambda function ARN, a connector ARN, 'cloud' (which represents the AWS IoT cloud), or 'GGShadowService'.
    */
  var Target: string
}
object Subscription {
  
  inline def apply(Id: string, Source: string, Subject: string, Target: string): Subscription = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
  
  extension [Self <: Subscription](x: Self) {
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setSource(value: string): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: string): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: string): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
