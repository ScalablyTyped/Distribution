package typings.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestRoleRequest extends StObject {
  
  /**
    * The Amazon S3 bucket that contains media files to be transcoded. The action attempts to read from this bucket.
    */
  var InputBucket: BucketName
  
  /**
    * The Amazon S3 bucket that Elastic Transcoder writes transcoded media files to. The action attempts to read from this bucket.
    */
  var OutputBucket: BucketName
  
  /**
    * The IAM Amazon Resource Name (ARN) for the role that you want Elastic Transcoder to test.
    */
  var Role: typings.awsSdk.clientsElastictranscoderMod.Role
  
  /**
    * The ARNs of one or more Amazon Simple Notification Service (Amazon SNS) topics that you want the action to send a test notification to.
    */
  var Topics: SnsTopics
}
object TestRoleRequest {
  
  inline def apply(InputBucket: BucketName, OutputBucket: BucketName, Role: Role, Topics: SnsTopics): TestRoleRequest = {
    val __obj = js.Dynamic.literal(InputBucket = InputBucket.asInstanceOf[js.Any], OutputBucket = OutputBucket.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], Topics = Topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRoleRequest]
  }
  
  extension [Self <: TestRoleRequest](x: Self) {
    
    inline def setInputBucket(value: BucketName): Self = StObject.set(x, "InputBucket", value.asInstanceOf[js.Any])
    
    inline def setOutputBucket(value: BucketName): Self = StObject.set(x, "OutputBucket", value.asInstanceOf[js.Any])
    
    inline def setRole(value: Role): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setTopics(value: SnsTopics): Self = StObject.set(x, "Topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsVarargs(value: SnsTopic*): Self = StObject.set(x, "Topics", js.Array(value*))
  }
}
