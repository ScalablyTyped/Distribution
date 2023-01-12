package typings.awsSdk.clientsCognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CognitoStreams extends StObject {
  
  /**
    * The ARN of the role Amazon Cognito can assume in order to publish to the stream. This role must grant access to Amazon Cognito (cognito-sync) to invoke PutRecord on your Cognito stream.
    */
  var RoleArn: js.UndefOr[AssumeRoleArn] = js.undefined
  
  /**
    * The name of the Cognito stream to receive updates. This stream must be in the developers account and in the same region as the identity pool.
    */
  var StreamName: js.UndefOr[typings.awsSdk.clientsCognitosyncMod.StreamName] = js.undefined
  
  /**
    * Status of the Cognito streams. Valid values are: ENABLED - Streaming of updates to identity pool is enabled. DISABLED - Streaming of updates to identity pool is disabled. Bulk publish will also fail if StreamingStatus is DISABLED.
    */
  var StreamingStatus: js.UndefOr[typings.awsSdk.clientsCognitosyncMod.StreamingStatus] = js.undefined
}
object CognitoStreams {
  
  inline def apply(): CognitoStreams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CognitoStreams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CognitoStreams] (val x: Self) extends AnyVal {
    
    inline def setRoleArn(value: AssumeRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
    
    inline def setStreamingStatus(value: StreamingStatus): Self = StObject.set(x, "StreamingStatus", value.asInstanceOf[js.Any])
    
    inline def setStreamingStatusUndefined: Self = StObject.set(x, "StreamingStatus", js.undefined)
  }
}
