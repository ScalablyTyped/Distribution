package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Distribution extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) for the distribution. For example: arn:aws:cloudfront::123456789012:distribution/EDFDVBD632BHDS5, where 123456789012 is your Amazon Web Services account ID.
    */
  var ARN: String
  
  /**
    * CloudFront automatically adds this field to the response if you’ve configured a cache behavior in this distribution to serve private content using key groups. This field contains a list of key groups and the public keys in each key group that CloudFront can use to verify the signatures of signed URLs or signed cookies.
    */
  var ActiveTrustedKeyGroups: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.ActiveTrustedKeyGroups] = js.undefined
  
  /**
    *  We recommend using TrustedKeyGroups instead of TrustedSigners.  CloudFront automatically adds this field to the response if you’ve configured a cache behavior in this distribution to serve private content using trusted signers. This field contains a list of Amazon Web Services account IDs and the active CloudFront key pairs in each account that CloudFront can use to verify the signatures of signed URLs or signed cookies.
    */
  var ActiveTrustedSigners: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.ActiveTrustedSigners] = js.undefined
  
  /**
    * Amazon Web Services services in China customers must file for an Internet Content Provider (ICP) recordal if they want to serve content publicly on an alternate domain name, also known as a CNAME, that they've added to CloudFront. AliasICPRecordal provides the ICP recordal status for CNAMEs associated with distributions. For more information about ICP recordals, see  Signup, Accounts, and Credentials in Getting Started with Amazon Web Services services in China.
    */
  var AliasICPRecordals: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.AliasICPRecordals] = js.undefined
  
  /**
    * The current configuration information for the distribution. Send a GET request to the /CloudFront API version/distribution ID/config resource.
    */
  var DistributionConfig: typings.awsSdk.clientsCloudfrontMod.DistributionConfig
  
  /**
    * The domain name corresponding to the distribution, for example, d111111abcdef8.cloudfront.net. 
    */
  var DomainName: String
  
  /**
    * The identifier for the distribution. For example: EDFDVBD632BHDS5. 
    */
  var Id: String
  
  /**
    * The number of invalidation batches currently in progress. 
    */
  var InProgressInvalidationBatches: integer
  
  /**
    * The date and time the distribution was last modified. 
    */
  var LastModifiedTime: js.Date
  
  /**
    * This response element indicates the current status of the distribution. When the status is Deployed, the distribution's information is fully propagated to all CloudFront edge locations. 
    */
  var Status: String
}
object Distribution {
  
  inline def apply(
    ARN: String,
    DistributionConfig: DistributionConfig,
    DomainName: String,
    Id: String,
    InProgressInvalidationBatches: integer,
    LastModifiedTime: js.Date,
    Status: String
  ): Distribution = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], DistributionConfig = DistributionConfig.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InProgressInvalidationBatches = InProgressInvalidationBatches.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Distribution] (val x: Self) extends AnyVal {
    
    inline def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setActiveTrustedKeyGroups(value: ActiveTrustedKeyGroups): Self = StObject.set(x, "ActiveTrustedKeyGroups", value.asInstanceOf[js.Any])
    
    inline def setActiveTrustedKeyGroupsUndefined: Self = StObject.set(x, "ActiveTrustedKeyGroups", js.undefined)
    
    inline def setActiveTrustedSigners(value: ActiveTrustedSigners): Self = StObject.set(x, "ActiveTrustedSigners", value.asInstanceOf[js.Any])
    
    inline def setActiveTrustedSignersUndefined: Self = StObject.set(x, "ActiveTrustedSigners", js.undefined)
    
    inline def setAliasICPRecordals(value: AliasICPRecordals): Self = StObject.set(x, "AliasICPRecordals", value.asInstanceOf[js.Any])
    
    inline def setAliasICPRecordalsUndefined: Self = StObject.set(x, "AliasICPRecordals", js.undefined)
    
    inline def setAliasICPRecordalsVarargs(value: AliasICPRecordal*): Self = StObject.set(x, "AliasICPRecordals", js.Array(value*))
    
    inline def setDistributionConfig(value: DistributionConfig): Self = StObject.set(x, "DistributionConfig", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setInProgressInvalidationBatches(value: integer): Self = StObject.set(x, "InProgressInvalidationBatches", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
