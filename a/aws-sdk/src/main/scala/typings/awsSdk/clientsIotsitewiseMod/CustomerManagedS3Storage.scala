package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerManagedS3Storage extends StObject {
  
  /**
    * The ARN of the Identity and Access Management role that allows IoT SiteWise to send data to Amazon S3.
    */
  var roleArn: ARN
  
  /**
    * The ARN of the Amazon S3 object. For more information about how to find the ARN for an Amazon S3 object, see Amazon S3 resources in the Amazon Simple Storage Service User Guide.
    */
  var s3ResourceArn: ARN
}
object CustomerManagedS3Storage {
  
  inline def apply(roleArn: ARN, s3ResourceArn: ARN): CustomerManagedS3Storage = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], s3ResourceArn = s3ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerManagedS3Storage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomerManagedS3Storage] (val x: Self) extends AnyVal {
    
    inline def setRoleArn(value: ARN): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setS3ResourceArn(value: ARN): Self = StObject.set(x, "s3ResourceArn", value.asInstanceOf[js.Any])
  }
}
