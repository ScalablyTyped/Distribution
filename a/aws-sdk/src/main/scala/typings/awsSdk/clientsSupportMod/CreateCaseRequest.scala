package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCaseRequest extends StObject {
  
  /**
    * The ID of a set of one or more attachments for the case. Create the set by using the AddAttachmentsToSet operation.
    */
  var attachmentSetId: js.UndefOr[AttachmentSetId] = js.undefined
  
  /**
    * The category of problem for the support case. You also use the DescribeServices operation to get the category code for a service. Each Amazon Web Services service defines its own set of category codes.
    */
  var categoryCode: js.UndefOr[CategoryCode] = js.undefined
  
  /**
    * A list of email addresses that Amazon Web Services Support copies on case correspondence. Amazon Web Services Support identifies the account that creates the case when you specify your Amazon Web Services credentials in an HTTP POST method or use the Amazon Web Services SDKs. 
    */
  var ccEmailAddresses: js.UndefOr[CcEmailAddressList] = js.undefined
  
  /**
    * The communication body text that describes the issue. This text appears in the Description field on the Amazon Web Services Support Center Create Case page.
    */
  var communicationBody: CommunicationBody
  
  /**
    * The type of issue for the case. You can specify customer-service or technical. If you don't specify a value, the default is technical.
    */
  var issueType: js.UndefOr[IssueType] = js.undefined
  
  /**
    * The language in which Amazon Web Services Support handles the case. You must specify the ISO 639-1 code for the language parameter if you want support in that language. Currently, English ("en") and Japanese ("ja") are supported.
    */
  var language: js.UndefOr[Language] = js.undefined
  
  /**
    * The code for the Amazon Web Services service. You can use the DescribeServices operation to get the possible serviceCode values.
    */
  var serviceCode: js.UndefOr[ServiceCode] = js.undefined
  
  /**
    * A value that indicates the urgency of the case. This value determines the response time according to your service level agreement with Amazon Web Services Support. You can use the DescribeSeverityLevels operation to get the possible values for severityCode.  For more information, see SeverityLevel and Choosing a Severity in the Amazon Web Services Support User Guide.  The availability of severity levels depends on the support plan for the Amazon Web Services account. 
    */
  var severityCode: js.UndefOr[SeverityCode] = js.undefined
  
  /**
    * The title of the support case. The title appears in the Subject field on the Amazon Web Services Support Center Create Case page.
    */
  var subject: Subject
}
object CreateCaseRequest {
  
  inline def apply(communicationBody: CommunicationBody, subject: Subject): CreateCaseRequest = {
    val __obj = js.Dynamic.literal(communicationBody = communicationBody.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCaseRequest]
  }
  
  extension [Self <: CreateCaseRequest](x: Self) {
    
    inline def setAttachmentSetId(value: AttachmentSetId): Self = StObject.set(x, "attachmentSetId", value.asInstanceOf[js.Any])
    
    inline def setAttachmentSetIdUndefined: Self = StObject.set(x, "attachmentSetId", js.undefined)
    
    inline def setCategoryCode(value: CategoryCode): Self = StObject.set(x, "categoryCode", value.asInstanceOf[js.Any])
    
    inline def setCategoryCodeUndefined: Self = StObject.set(x, "categoryCode", js.undefined)
    
    inline def setCcEmailAddresses(value: CcEmailAddressList): Self = StObject.set(x, "ccEmailAddresses", value.asInstanceOf[js.Any])
    
    inline def setCcEmailAddressesUndefined: Self = StObject.set(x, "ccEmailAddresses", js.undefined)
    
    inline def setCcEmailAddressesVarargs(value: CcEmailAddress*): Self = StObject.set(x, "ccEmailAddresses", js.Array(value*))
    
    inline def setCommunicationBody(value: CommunicationBody): Self = StObject.set(x, "communicationBody", value.asInstanceOf[js.Any])
    
    inline def setIssueType(value: IssueType): Self = StObject.set(x, "issueType", value.asInstanceOf[js.Any])
    
    inline def setIssueTypeUndefined: Self = StObject.set(x, "issueType", js.undefined)
    
    inline def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setServiceCode(value: ServiceCode): Self = StObject.set(x, "serviceCode", value.asInstanceOf[js.Any])
    
    inline def setServiceCodeUndefined: Self = StObject.set(x, "serviceCode", js.undefined)
    
    inline def setSeverityCode(value: SeverityCode): Self = StObject.set(x, "severityCode", value.asInstanceOf[js.Any])
    
    inline def setSeverityCodeUndefined: Self = StObject.set(x, "severityCode", js.undefined)
    
    inline def setSubject(value: Subject): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
  }
}
