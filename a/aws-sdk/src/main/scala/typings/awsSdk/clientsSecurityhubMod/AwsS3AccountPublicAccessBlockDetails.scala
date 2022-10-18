package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3AccountPublicAccessBlockDetails extends StObject {
  
  /**
    * Indicates whether to reject calls to update an S3 bucket if the calls include a public access control list (ACL).
    */
  var BlockPublicAcls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to reject calls to update the access policy for an S3 bucket or access point if the policy allows public access.
    */
  var BlockPublicPolicy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether Amazon S3 ignores public ACLs that are associated with an S3 bucket.
    */
  var IgnorePublicAcls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to restrict access to an access point or S3 bucket that has a public policy to only Amazon Web Services service principals and authorized users within the S3 bucket owner's account.
    */
  var RestrictPublicBuckets: js.UndefOr[Boolean] = js.undefined
}
object AwsS3AccountPublicAccessBlockDetails {
  
  inline def apply(): AwsS3AccountPublicAccessBlockDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3AccountPublicAccessBlockDetails]
  }
  
  extension [Self <: AwsS3AccountPublicAccessBlockDetails](x: Self) {
    
    inline def setBlockPublicAcls(value: Boolean): Self = StObject.set(x, "BlockPublicAcls", value.asInstanceOf[js.Any])
    
    inline def setBlockPublicAclsUndefined: Self = StObject.set(x, "BlockPublicAcls", js.undefined)
    
    inline def setBlockPublicPolicy(value: Boolean): Self = StObject.set(x, "BlockPublicPolicy", value.asInstanceOf[js.Any])
    
    inline def setBlockPublicPolicyUndefined: Self = StObject.set(x, "BlockPublicPolicy", js.undefined)
    
    inline def setIgnorePublicAcls(value: Boolean): Self = StObject.set(x, "IgnorePublicAcls", value.asInstanceOf[js.Any])
    
    inline def setIgnorePublicAclsUndefined: Self = StObject.set(x, "IgnorePublicAcls", js.undefined)
    
    inline def setRestrictPublicBuckets(value: Boolean): Self = StObject.set(x, "RestrictPublicBuckets", value.asInstanceOf[js.Any])
    
    inline def setRestrictPublicBucketsUndefined: Self = StObject.set(x, "RestrictPublicBuckets", js.undefined)
  }
}
