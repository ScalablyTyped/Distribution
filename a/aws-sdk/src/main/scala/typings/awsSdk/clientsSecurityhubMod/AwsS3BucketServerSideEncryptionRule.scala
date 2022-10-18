package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketServerSideEncryptionRule extends StObject {
  
  /**
    * Specifies the default server-side encryption to apply to new objects in the bucket. If a PUT object request doesn't specify any server-side encryption, this default encryption is applied.
    */
  var ApplyServerSideEncryptionByDefault: js.UndefOr[AwsS3BucketServerSideEncryptionByDefault] = js.undefined
}
object AwsS3BucketServerSideEncryptionRule {
  
  inline def apply(): AwsS3BucketServerSideEncryptionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketServerSideEncryptionRule]
  }
  
  extension [Self <: AwsS3BucketServerSideEncryptionRule](x: Self) {
    
    inline def setApplyServerSideEncryptionByDefault(value: AwsS3BucketServerSideEncryptionByDefault): Self = StObject.set(x, "ApplyServerSideEncryptionByDefault", value.asInstanceOf[js.Any])
    
    inline def setApplyServerSideEncryptionByDefaultUndefined: Self = StObject.set(x, "ApplyServerSideEncryptionByDefault", js.undefined)
  }
}
