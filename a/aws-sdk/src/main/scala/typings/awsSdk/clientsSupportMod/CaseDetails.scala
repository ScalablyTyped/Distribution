package typings.awsSdk.clientsSupportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaseDetails extends StObject {
  
  /**
    * The support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-12345678910-2013-c4c1d2bf33c5cf47 
    */
  var caseId: js.UndefOr[CaseId] = js.undefined
  
  /**
    * The category of problem for the support case.
    */
  var categoryCode: js.UndefOr[CategoryCode] = js.undefined
  
  /**
    * The email addresses that receive copies of communication about the case.
    */
  var ccEmailAddresses: js.UndefOr[CcEmailAddressList] = js.undefined
  
  /**
    * The ID displayed for the case in the Amazon Web Services Support Center. This is a numeric string.
    */
  var displayId: js.UndefOr[DisplayId] = js.undefined
  
  /**
    * The ISO 639-1 code for the language in which Amazon Web Services provides support. Amazon Web Services Support currently supports English ("en") and Japanese ("ja"). Language parameters must be passed explicitly for operations that take them.
    */
  var language: js.UndefOr[Language] = js.undefined
  
  /**
    * The five most recent communications between you and Amazon Web Services Support Center, including the IDs of any attachments to the communications. Also includes a nextToken that you can use to retrieve earlier communications.
    */
  var recentCommunications: js.UndefOr[RecentCaseCommunications] = js.undefined
  
  /**
    * The code for the Amazon Web Services service. You can get a list of codes and the corresponding service names by calling DescribeServices.
    */
  var serviceCode: js.UndefOr[ServiceCode] = js.undefined
  
  /**
    * The code for the severity level returned by the call to DescribeSeverityLevels.
    */
  var severityCode: js.UndefOr[SeverityCode] = js.undefined
  
  /**
    * The status of the case. Valid values:    opened     pending-customer-action     reopened     resolved     unassigned     work-in-progress   
    */
  var status: js.UndefOr[Status] = js.undefined
  
  /**
    * The subject line for the case in the Amazon Web Services Support Center.
    */
  var subject: js.UndefOr[Subject] = js.undefined
  
  /**
    * The email address of the account that submitted the case.
    */
  var submittedBy: js.UndefOr[SubmittedBy] = js.undefined
  
  /**
    * The time that the case was created in the Amazon Web Services Support Center.
    */
  var timeCreated: js.UndefOr[TimeCreated] = js.undefined
}
object CaseDetails {
  
  inline def apply(): CaseDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaseDetails]
  }
  
  extension [Self <: CaseDetails](x: Self) {
    
    inline def setCaseId(value: CaseId): Self = StObject.set(x, "caseId", value.asInstanceOf[js.Any])
    
    inline def setCaseIdUndefined: Self = StObject.set(x, "caseId", js.undefined)
    
    inline def setCategoryCode(value: CategoryCode): Self = StObject.set(x, "categoryCode", value.asInstanceOf[js.Any])
    
    inline def setCategoryCodeUndefined: Self = StObject.set(x, "categoryCode", js.undefined)
    
    inline def setCcEmailAddresses(value: CcEmailAddressList): Self = StObject.set(x, "ccEmailAddresses", value.asInstanceOf[js.Any])
    
    inline def setCcEmailAddressesUndefined: Self = StObject.set(x, "ccEmailAddresses", js.undefined)
    
    inline def setCcEmailAddressesVarargs(value: CcEmailAddress*): Self = StObject.set(x, "ccEmailAddresses", js.Array(value*))
    
    inline def setDisplayId(value: DisplayId): Self = StObject.set(x, "displayId", value.asInstanceOf[js.Any])
    
    inline def setDisplayIdUndefined: Self = StObject.set(x, "displayId", js.undefined)
    
    inline def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setRecentCommunications(value: RecentCaseCommunications): Self = StObject.set(x, "recentCommunications", value.asInstanceOf[js.Any])
    
    inline def setRecentCommunicationsUndefined: Self = StObject.set(x, "recentCommunications", js.undefined)
    
    inline def setServiceCode(value: ServiceCode): Self = StObject.set(x, "serviceCode", value.asInstanceOf[js.Any])
    
    inline def setServiceCodeUndefined: Self = StObject.set(x, "serviceCode", js.undefined)
    
    inline def setSeverityCode(value: SeverityCode): Self = StObject.set(x, "severityCode", value.asInstanceOf[js.Any])
    
    inline def setSeverityCodeUndefined: Self = StObject.set(x, "severityCode", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubject(value: Subject): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSubmittedBy(value: SubmittedBy): Self = StObject.set(x, "submittedBy", value.asInstanceOf[js.Any])
    
    inline def setSubmittedByUndefined: Self = StObject.set(x, "submittedBy", js.undefined)
    
    inline def setTimeCreated(value: TimeCreated): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
    
    inline def setTimeCreatedUndefined: Self = StObject.set(x, "timeCreated", js.undefined)
  }
}
