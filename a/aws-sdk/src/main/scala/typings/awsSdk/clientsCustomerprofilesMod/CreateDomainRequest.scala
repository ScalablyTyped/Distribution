package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDomainRequest extends StObject {
  
  /**
    * The URL of the SQS dead letter queue, which is used for reporting errors associated with ingesting data from third party applications. You must set up a policy on the DeadLetterQueue for the SendMessage operation to enable Amazon Connect Customer Profiles to send messages to the DeadLetterQueue.
    */
  var DeadLetterQueueUrl: js.UndefOr[sqsQueueUrl] = js.undefined
  
  /**
    * The default encryption key, which is an AWS managed key, is used when no specific type of encryption key is specified. It is used to encrypt all data before it is placed in permanent or semi-permanent storage.
    */
  var DefaultEncryptionKey: js.UndefOr[encryptionKey] = js.undefined
  
  /**
    * The default number of days until the data within the domain expires.
    */
  var DefaultExpirationDays: expirationDaysInteger
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
  
  /**
    * The process of matching duplicate profiles. If Matching = true, Amazon Connect Customer Profiles starts a weekly batch process called Identity Resolution Job. If you do not specify a date and time for Identity Resolution Job to run, by default it runs every Saturday at 12AM UTC to detect duplicate profiles in your domains.  After the Identity Resolution Job completes, use the GetMatches API to return and review the results. Or, if you have configured ExportingConfig in the MatchingRequest, you can download the results from S3.
    */
  var Matching: js.UndefOr[MatchingRequest] = js.undefined
  
  /**
    * The tags used to organize, track, or control access for this resource.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateDomainRequest {
  
  inline def apply(DefaultExpirationDays: expirationDaysInteger, DomainName: name): CreateDomainRequest = {
    val __obj = js.Dynamic.literal(DefaultExpirationDays = DefaultExpirationDays.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDomainRequest] (val x: Self) extends AnyVal {
    
    inline def setDeadLetterQueueUrl(value: sqsQueueUrl): Self = StObject.set(x, "DeadLetterQueueUrl", value.asInstanceOf[js.Any])
    
    inline def setDeadLetterQueueUrlUndefined: Self = StObject.set(x, "DeadLetterQueueUrl", js.undefined)
    
    inline def setDefaultEncryptionKey(value: encryptionKey): Self = StObject.set(x, "DefaultEncryptionKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultEncryptionKeyUndefined: Self = StObject.set(x, "DefaultEncryptionKey", js.undefined)
    
    inline def setDefaultExpirationDays(value: expirationDaysInteger): Self = StObject.set(x, "DefaultExpirationDays", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setMatching(value: MatchingRequest): Self = StObject.set(x, "Matching", value.asInstanceOf[js.Any])
    
    inline def setMatchingUndefined: Self = StObject.set(x, "Matching", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
