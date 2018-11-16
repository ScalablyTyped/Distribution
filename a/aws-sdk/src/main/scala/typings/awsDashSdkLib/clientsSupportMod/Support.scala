package typings
package awsDashSdkLib.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Support
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Support: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsSupportMod.SupportNs.ClientConfiguration = js.native
  /**
     * Adds one or more attachments to an attachment set. If an attachmentSetId is not specified, a new attachment set is created, and the ID of the set is returned in the response. If an attachmentSetId is specified, the attachments are added to the specified set, if it exists. An attachment set is a temporary container for attachments that are to be added to a case or case communication. The set is available for one hour after it is created; the expiryTime returned in the response indicates when the set expires. The maximum number of attachments in a set is 3, and the maximum size of any attachment in the set is 5 MB.
     */
  def addAttachmentsToSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.AddAttachmentsToSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds one or more attachments to an attachment set. If an attachmentSetId is not specified, a new attachment set is created, and the ID of the set is returned in the response. If an attachmentSetId is specified, the attachments are added to the specified set, if it exists. An attachment set is a temporary container for attachments that are to be added to a case or case communication. The set is available for one hour after it is created; the expiryTime returned in the response indicates when the set expires. The maximum number of attachments in a set is 3, and the maximum size of any attachment in the set is 5 MB.
     */
  def addAttachmentsToSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.AddAttachmentsToSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.AddAttachmentsToSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds one or more attachments to an attachment set. If an attachmentSetId is not specified, a new attachment set is created, and the ID of the set is returned in the response. If an attachmentSetId is specified, the attachments are added to the specified set, if it exists. An attachment set is a temporary container for attachments that are to be added to a case or case communication. The set is available for one hour after it is created; the expiryTime returned in the response indicates when the set expires. The maximum number of attachments in a set is 3, and the maximum size of any attachment in the set is 5 MB.
     */
  def addAttachmentsToSet(params: awsDashSdkLib.clientsSupportMod.SupportNs.AddAttachmentsToSetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.AddAttachmentsToSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds one or more attachments to an attachment set. If an attachmentSetId is not specified, a new attachment set is created, and the ID of the set is returned in the response. If an attachmentSetId is specified, the attachments are added to the specified set, if it exists. An attachment set is a temporary container for attachments that are to be added to a case or case communication. The set is available for one hour after it is created; the expiryTime returned in the response indicates when the set expires. The maximum number of attachments in a set is 3, and the maximum size of any attachment in the set is 5 MB.
     */
  def addAttachmentsToSet(
    params: awsDashSdkLib.clientsSupportMod.SupportNs.AddAttachmentsToSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.AddAttachmentsToSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.AddAttachmentsToSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds additional customer communication to an AWS Support case. You use the caseId value to identify the case to add communication to. You can list a set of email addresses to copy on the communication using the ccEmailAddresses value. The communicationBody value contains the text of the communication. The response indicates the success or failure of the request. This operation implements a subset of the features of the AWS Support Center.
     */
  def addCommunicationToCase(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.AddCommunicationToCaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds additional customer communication to an AWS Support case. You use the caseId value to identify the case to add communication to. You can list a set of email addresses to copy on the communication using the ccEmailAddresses value. The communicationBody value contains the text of the communication. The response indicates the success or failure of the request. This operation implements a subset of the features of the AWS Support Center.
     */
  def addCommunicationToCase(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.AddCommunicationToCaseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.AddCommunicationToCaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds additional customer communication to an AWS Support case. You use the caseId value to identify the case to add communication to. You can list a set of email addresses to copy on the communication using the ccEmailAddresses value. The communicationBody value contains the text of the communication. The response indicates the success or failure of the request. This operation implements a subset of the features of the AWS Support Center.
     */
  def addCommunicationToCase(params: awsDashSdkLib.clientsSupportMod.SupportNs.AddCommunicationToCaseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.AddCommunicationToCaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds additional customer communication to an AWS Support case. You use the caseId value to identify the case to add communication to. You can list a set of email addresses to copy on the communication using the ccEmailAddresses value. The communicationBody value contains the text of the communication. The response indicates the success or failure of the request. This operation implements a subset of the features of the AWS Support Center.
     */
  def addCommunicationToCase(
    params: awsDashSdkLib.clientsSupportMod.SupportNs.AddCommunicationToCaseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.AddCommunicationToCaseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.AddCommunicationToCaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new case in the AWS Support Center. This operation is modeled on the behavior of the AWS Support Center Create Case page. Its parameters require you to specify the following information:     issueType. The type of issue for the case. You can specify either "customer-service" or "technical." If you do not indicate a value, the default is "technical."     serviceCode. The code for an AWS service. You obtain the serviceCode by calling DescribeServices.     categoryCode. The category for the service defined for the serviceCode value. You also obtain the category code for a service by calling DescribeServices. Each AWS service defines its own set of category codes.     severityCode. A value that indicates the urgency of the case, which in turn determines the response time according to your service level agreement with AWS Support. You obtain the SeverityCode by calling DescribeSeverityLevels.    subject. The Subject field on the AWS Support Center Create Case page.    communicationBody. The Description field on the AWS Support Center Create Case page.    attachmentSetId. The ID of a set of attachments that has been created by using AddAttachmentsToSet.    language. The human language in which AWS Support handles the case. English and Japanese are currently supported.    ccEmailAddresses. The AWS Support Center CC field on the Create Case page. You can list email addresses to be copied on any correspondence about the case. The account that opens the case is already identified by passing the AWS Credentials in the HTTP POST method or in a method or function call from one of the programming languages supported by an AWS SDK.     To add additional communication or attachments to an existing case, use AddCommunicationToCase.  A successful CreateCase request returns an AWS Support case number. Case numbers are used by the DescribeCases operation to retrieve existing AWS Support cases. 
     */
  def createCase(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.CreateCaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new case in the AWS Support Center. This operation is modeled on the behavior of the AWS Support Center Create Case page. Its parameters require you to specify the following information:     issueType. The type of issue for the case. You can specify either "customer-service" or "technical." If you do not indicate a value, the default is "technical."     serviceCode. The code for an AWS service. You obtain the serviceCode by calling DescribeServices.     categoryCode. The category for the service defined for the serviceCode value. You also obtain the category code for a service by calling DescribeServices. Each AWS service defines its own set of category codes.     severityCode. A value that indicates the urgency of the case, which in turn determines the response time according to your service level agreement with AWS Support. You obtain the SeverityCode by calling DescribeSeverityLevels.    subject. The Subject field on the AWS Support Center Create Case page.    communicationBody. The Description field on the AWS Support Center Create Case page.    attachmentSetId. The ID of a set of attachments that has been created by using AddAttachmentsToSet.    language. The human language in which AWS Support handles the case. English and Japanese are currently supported.    ccEmailAddresses. The AWS Support Center CC field on the Create Case page. You can list email addresses to be copied on any correspondence about the case. The account that opens the case is already identified by passing the AWS Credentials in the HTTP POST method or in a method or function call from one of the programming languages supported by an AWS SDK.     To add additional communication or attachments to an existing case, use AddCommunicationToCase.  A successful CreateCase request returns an AWS Support case number. Case numbers are used by the DescribeCases operation to retrieve existing AWS Support cases. 
     */
  def createCase(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.CreateCaseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.CreateCaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new case in the AWS Support Center. This operation is modeled on the behavior of the AWS Support Center Create Case page. Its parameters require you to specify the following information:     issueType. The type of issue for the case. You can specify either "customer-service" or "technical." If you do not indicate a value, the default is "technical."     serviceCode. The code for an AWS service. You obtain the serviceCode by calling DescribeServices.     categoryCode. The category for the service defined for the serviceCode value. You also obtain the category code for a service by calling DescribeServices. Each AWS service defines its own set of category codes.     severityCode. A value that indicates the urgency of the case, which in turn determines the response time according to your service level agreement with AWS Support. You obtain the SeverityCode by calling DescribeSeverityLevels.    subject. The Subject field on the AWS Support Center Create Case page.    communicationBody. The Description field on the AWS Support Center Create Case page.    attachmentSetId. The ID of a set of attachments that has been created by using AddAttachmentsToSet.    language. The human language in which AWS Support handles the case. English and Japanese are currently supported.    ccEmailAddresses. The AWS Support Center CC field on the Create Case page. You can list email addresses to be copied on any correspondence about the case. The account that opens the case is already identified by passing the AWS Credentials in the HTTP POST method or in a method or function call from one of the programming languages supported by an AWS SDK.     To add additional communication or attachments to an existing case, use AddCommunicationToCase.  A successful CreateCase request returns an AWS Support case number. Case numbers are used by the DescribeCases operation to retrieve existing AWS Support cases. 
     */
  def createCase(params: awsDashSdkLib.clientsSupportMod.SupportNs.CreateCaseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.CreateCaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new case in the AWS Support Center. This operation is modeled on the behavior of the AWS Support Center Create Case page. Its parameters require you to specify the following information:     issueType. The type of issue for the case. You can specify either "customer-service" or "technical." If you do not indicate a value, the default is "technical."     serviceCode. The code for an AWS service. You obtain the serviceCode by calling DescribeServices.     categoryCode. The category for the service defined for the serviceCode value. You also obtain the category code for a service by calling DescribeServices. Each AWS service defines its own set of category codes.     severityCode. A value that indicates the urgency of the case, which in turn determines the response time according to your service level agreement with AWS Support. You obtain the SeverityCode by calling DescribeSeverityLevels.    subject. The Subject field on the AWS Support Center Create Case page.    communicationBody. The Description field on the AWS Support Center Create Case page.    attachmentSetId. The ID of a set of attachments that has been created by using AddAttachmentsToSet.    language. The human language in which AWS Support handles the case. English and Japanese are currently supported.    ccEmailAddresses. The AWS Support Center CC field on the Create Case page. You can list email addresses to be copied on any correspondence about the case. The account that opens the case is already identified by passing the AWS Credentials in the HTTP POST method or in a method or function call from one of the programming languages supported by an AWS SDK.     To add additional communication or attachments to an existing case, use AddCommunicationToCase.  A successful CreateCase request returns an AWS Support case number. Case numbers are used by the DescribeCases operation to retrieve existing AWS Support cases. 
     */
  def createCase(
    params: awsDashSdkLib.clientsSupportMod.SupportNs.CreateCaseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.CreateCaseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.CreateCaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the attachment that has the specified ID. Attachment IDs are generated by the case management system when you add an attachment to a case or case communication. Attachment IDs are returned in the AttachmentDetails objects that are returned by the DescribeCommunications operation.
     */
  def describeAttachment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeAttachmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the attachment that has the specified ID. Attachment IDs are generated by the case management system when you add an attachment to a case or case communication. Attachment IDs are returned in the AttachmentDetails objects that are returned by the DescribeCommunications operation.
     */
  def describeAttachment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.DescribeAttachmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeAttachmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the attachment that has the specified ID. Attachment IDs are generated by the case management system when you add an attachment to a case or case communication. Attachment IDs are returned in the AttachmentDetails objects that are returned by the DescribeCommunications operation.
     */
  def describeAttachment(params: awsDashSdkLib.clientsSupportMod.SupportNs.DescribeAttachmentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeAttachmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the attachment that has the specified ID. Attachment IDs are generated by the case management system when you add an attachment to a case or case communication. Attachment IDs are returned in the AttachmentDetails objects that are returned by the DescribeCommunications operation.
     */
  def describeAttachment(
    params: awsDashSdkLib.clientsSupportMod.SupportNs.DescribeAttachmentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.DescribeAttachmentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeAttachmentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of cases that you specify by passing one or more case IDs. In addition, you can filter the cases by date by setting values for the afterTime and beforeTime request parameters. You can set values for the includeResolvedCases and includeCommunications request parameters to control how much information is returned.  Case data is available for 12 months after creation. If a case was created more than 12 months ago, a request for data might cause an error. The response returns the following in JSON format:   One or more CaseDetails data types.    One or more nextToken values, which specify where to paginate the returned records represented by the CaseDetails objects.  
     */
  def describeCases(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeCasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of cases that you specify by passing one or more case IDs. In addition, you can filter the cases by date by setting values for the afterTime and beforeTime request parameters. You can set values for the includeResolvedCases and includeCommunications request parameters to control how much information is returned.  Case data is available for 12 months after creation. If a case was created more than 12 months ago, a request for data might cause an error. The response returns the following in JSON format:   One or more CaseDetails data types.    One or more nextToken values, which specify where to paginate the returned records represented by the CaseDetails objects.  
     */
  def describeCases(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.DescribeCasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeCasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of cases that you specify by passing one or more case IDs. In addition, you can filter the cases by date by setting values for the afterTime and beforeTime request parameters. You can set values for the includeResolvedCases and includeCommunications request parameters to control how much information is returned.  Case data is available for 12 months after creation. If a case was created more than 12 months ago, a request for data might cause an error. The response returns the following in JSON format:   One or more CaseDetails data types.    One or more nextToken values, which specify where to paginate the returned records represented by the CaseDetails objects.  
     */
  def describeCases(params: awsDashSdkLib.clientsSupportMod.SupportNs.DescribeCasesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeCasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of cases that you specify by passing one or more case IDs. In addition, you can filter the cases by date by setting values for the afterTime and beforeTime request parameters. You can set values for the includeResolvedCases and includeCommunications request parameters to control how much information is returned.  Case data is available for 12 months after creation. If a case was created more than 12 months ago, a request for data might cause an error. The response returns the following in JSON format:   One or more CaseDetails data types.    One or more nextToken values, which specify where to paginate the returned records represented by the CaseDetails objects.  
     */
  def describeCases(
    params: awsDashSdkLib.clientsSupportMod.SupportNs.DescribeCasesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.DescribeCasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeCasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns communications (and attachments) for one or more support cases. You can use the afterTime and beforeTime parameters to filter by date. You can use the caseId parameter to restrict the results to a particular case. Case data is available for 12 months after creation. If a case was created more than 12 months ago, a request for data might cause an error. You can use the maxResults and nextToken parameters to control the pagination of the result set. Set maxResults to the number of cases you want displayed on each page, and use nextToken to specify the resumption of pagination.
     */
  def describeCommunications(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeCommunicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns communications (and attachments) for one or more support cases. You can use the afterTime and beforeTime parameters to filter by date. You can use the caseId parameter to restrict the results to a particular case. Case data is available for 12 months after creation. If a case was created more than 12 months ago, a request for data might cause an error. You can use the maxResults and nextToken parameters to control the pagination of the result set. Set maxResults to the number of cases you want displayed on each page, and use nextToken to specify the resumption of pagination.
     */
  def describeCommunications(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.DescribeCommunicationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeCommunicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns communications (and attachments) for one or more support cases. You can use the afterTime and beforeTime parameters to filter by date. You can use the caseId parameter to restrict the results to a particular case. Case data is available for 12 months after creation. If a case was created more than 12 months ago, a request for data might cause an error. You can use the maxResults and nextToken parameters to control the pagination of the result set. Set maxResults to the number of cases you want displayed on each page, and use nextToken to specify the resumption of pagination.
     */
  def describeCommunications(params: awsDashSdkLib.clientsSupportMod.SupportNs.DescribeCommunicationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeCommunicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns communications (and attachments) for one or more support cases. You can use the afterTime and beforeTime parameters to filter by date. You can use the caseId parameter to restrict the results to a particular case. Case data is available for 12 months after creation. If a case was created more than 12 months ago, a request for data might cause an error. You can use the maxResults and nextToken parameters to control the pagination of the result set. Set maxResults to the number of cases you want displayed on each page, and use nextToken to specify the resumption of pagination.
     */
  def describeCommunications(
    params: awsDashSdkLib.clientsSupportMod.SupportNs.DescribeCommunicationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.DescribeCommunicationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeCommunicationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the current list of AWS services and a list of service categories that applies to each one. You then use service names and categories in your CreateCase requests. Each AWS service has its own set of categories. The service codes and category codes correspond to the values that are displayed in the Service and Category drop-down lists on the AWS Support Center Create Case page. The values in those fields, however, do not necessarily match the service codes and categories returned by the DescribeServices request. Always use the service codes and categories obtained programmatically. This practice ensures that you always have the most recent set of service and category codes.
     */
  def describeServices(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the current list of AWS services and a list of service categories that applies to each one. You then use service names and categories in your CreateCase requests. Each AWS service has its own set of categories. The service codes and category codes correspond to the values that are displayed in the Service and Category drop-down lists on the AWS Support Center Create Case page. The values in those fields, however, do not necessarily match the service codes and categories returned by the DescribeServices request. Always use the service codes and categories obtained programmatically. This practice ensures that you always have the most recent set of service and category codes.
     */
  def describeServices(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.DescribeServicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the current list of AWS services and a list of service categories that applies to each one. You then use service names and categories in your CreateCase requests. Each AWS service has its own set of categories. The service codes and category codes correspond to the values that are displayed in the Service and Category drop-down lists on the AWS Support Center Create Case page. The values in those fields, however, do not necessarily match the service codes and categories returned by the DescribeServices request. Always use the service codes and categories obtained programmatically. This practice ensures that you always have the most recent set of service and category codes.
     */
  def describeServices(params: awsDashSdkLib.clientsSupportMod.SupportNs.DescribeServicesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the current list of AWS services and a list of service categories that applies to each one. You then use service names and categories in your CreateCase requests. Each AWS service has its own set of categories. The service codes and category codes correspond to the values that are displayed in the Service and Category drop-down lists on the AWS Support Center Create Case page. The values in those fields, however, do not necessarily match the service codes and categories returned by the DescribeServices request. Always use the service codes and categories obtained programmatically. This practice ensures that you always have the most recent set of service and category codes.
     */
  def describeServices(
    params: awsDashSdkLib.clientsSupportMod.SupportNs.DescribeServicesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.DescribeServicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the list of severity levels that you can assign to an AWS Support case. The severity level for a case is also a field in the CaseDetails data type included in any CreateCase request. 
     */
  def describeSeverityLevels(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeSeverityLevelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the list of severity levels that you can assign to an AWS Support case. The severity level for a case is also a field in the CaseDetails data type included in any CreateCase request. 
     */
  def describeSeverityLevels(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.DescribeSeverityLevelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeSeverityLevelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the list of severity levels that you can assign to an AWS Support case. The severity level for a case is also a field in the CaseDetails data type included in any CreateCase request. 
     */
  def describeSeverityLevels(params: awsDashSdkLib.clientsSupportMod.SupportNs.DescribeSeverityLevelsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeSeverityLevelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the list of severity levels that you can assign to an AWS Support case. The severity level for a case is also a field in the CaseDetails data type included in any CreateCase request. 
     */
  def describeSeverityLevels(
    params: awsDashSdkLib.clientsSupportMod.SupportNs.DescribeSeverityLevelsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.DescribeSeverityLevelsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeSeverityLevelsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the refresh status of the Trusted Advisor checks that have the specified check IDs. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks.  Some checks are refreshed automatically, and their refresh statuses cannot be retrieved by using this operation. Use of the DescribeTrustedAdvisorCheckRefreshStatuses operation for these checks causes an InvalidParameterValue error. 
     */
  def describeTrustedAdvisorCheckRefreshStatuses(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorCheckRefreshStatusesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the refresh status of the Trusted Advisor checks that have the specified check IDs. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks.  Some checks are refreshed automatically, and their refresh statuses cannot be retrieved by using this operation. Use of the DescribeTrustedAdvisorCheckRefreshStatuses operation for these checks causes an InvalidParameterValue error. 
     */
  def describeTrustedAdvisorCheckRefreshStatuses(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorCheckRefreshStatusesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorCheckRefreshStatusesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the refresh status of the Trusted Advisor checks that have the specified check IDs. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks.  Some checks are refreshed automatically, and their refresh statuses cannot be retrieved by using this operation. Use of the DescribeTrustedAdvisorCheckRefreshStatuses operation for these checks causes an InvalidParameterValue error. 
     */
  def describeTrustedAdvisorCheckRefreshStatuses(
    params: awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorCheckRefreshStatusesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorCheckRefreshStatusesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the refresh status of the Trusted Advisor checks that have the specified check IDs. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks.  Some checks are refreshed automatically, and their refresh statuses cannot be retrieved by using this operation. Use of the DescribeTrustedAdvisorCheckRefreshStatuses operation for these checks causes an InvalidParameterValue error. 
     */
  def describeTrustedAdvisorCheckRefreshStatuses(
    params: awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorCheckRefreshStatusesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorCheckRefreshStatusesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorCheckRefreshStatusesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the results of the Trusted Advisor check that has the specified check ID. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks. The response contains a TrustedAdvisorCheckResult object, which contains these three objects:    TrustedAdvisorCategorySpecificSummary     TrustedAdvisorResourceDetail     TrustedAdvisorResourcesSummary    In addition, the response contains these fields:    status. The alert status of the check: "ok" (green), "warning" (yellow), "error" (red), or "not_available".    timestamp. The time of the last refresh of the check.    checkId. The unique identifier for the check.  
     */
  def describeTrustedAdvisorCheckResult(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorCheckResultResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the results of the Trusted Advisor check that has the specified check ID. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks. The response contains a TrustedAdvisorCheckResult object, which contains these three objects:    TrustedAdvisorCategorySpecificSummary     TrustedAdvisorResourceDetail     TrustedAdvisorResourcesSummary    In addition, the response contains these fields:    status. The alert status of the check: "ok" (green), "warning" (yellow), "error" (red), or "not_available".    timestamp. The time of the last refresh of the check.    checkId. The unique identifier for the check.  
     */
  def describeTrustedAdvisorCheckResult(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorCheckResultResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorCheckResultResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the results of the Trusted Advisor check that has the specified check ID. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks. The response contains a TrustedAdvisorCheckResult object, which contains these three objects:    TrustedAdvisorCategorySpecificSummary     TrustedAdvisorResourceDetail     TrustedAdvisorResourcesSummary    In addition, the response contains these fields:    status. The alert status of the check: "ok" (green), "warning" (yellow), "error" (red), or "not_available".    timestamp. The time of the last refresh of the check.    checkId. The unique identifier for the check.  
     */
  def describeTrustedAdvisorCheckResult(params: awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorCheckResultRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorCheckResultResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the results of the Trusted Advisor check that has the specified check ID. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks. The response contains a TrustedAdvisorCheckResult object, which contains these three objects:    TrustedAdvisorCategorySpecificSummary     TrustedAdvisorResourceDetail     TrustedAdvisorResourcesSummary    In addition, the response contains these fields:    status. The alert status of the check: "ok" (green), "warning" (yellow), "error" (red), or "not_available".    timestamp. The time of the last refresh of the check.    checkId. The unique identifier for the check.  
     */
  def describeTrustedAdvisorCheckResult(
    params: awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorCheckResultRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorCheckResultResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorCheckResultResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the summaries of the results of the Trusted Advisor checks that have the specified check IDs. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks. The response contains an array of TrustedAdvisorCheckSummary objects.
     */
  def describeTrustedAdvisorCheckSummaries(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorCheckSummariesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the summaries of the results of the Trusted Advisor checks that have the specified check IDs. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks. The response contains an array of TrustedAdvisorCheckSummary objects.
     */
  def describeTrustedAdvisorCheckSummaries(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorCheckSummariesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorCheckSummariesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the summaries of the results of the Trusted Advisor checks that have the specified check IDs. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks. The response contains an array of TrustedAdvisorCheckSummary objects.
     */
  def describeTrustedAdvisorCheckSummaries(params: awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorCheckSummariesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorCheckSummariesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the summaries of the results of the Trusted Advisor checks that have the specified check IDs. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks. The response contains an array of TrustedAdvisorCheckSummary objects.
     */
  def describeTrustedAdvisorCheckSummaries(
    params: awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorCheckSummariesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorCheckSummariesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorCheckSummariesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about all available Trusted Advisor checks, including name, ID, category, description, and metadata. You must specify a language code; English ("en") and Japanese ("ja") are currently supported. The response contains a TrustedAdvisorCheckDescription for each check.
     */
  def describeTrustedAdvisorChecks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorChecksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about all available Trusted Advisor checks, including name, ID, category, description, and metadata. You must specify a language code; English ("en") and Japanese ("ja") are currently supported. The response contains a TrustedAdvisorCheckDescription for each check.
     */
  def describeTrustedAdvisorChecks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorChecksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorChecksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about all available Trusted Advisor checks, including name, ID, category, description, and metadata. You must specify a language code; English ("en") and Japanese ("ja") are currently supported. The response contains a TrustedAdvisorCheckDescription for each check.
     */
  def describeTrustedAdvisorChecks(params: awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorChecksRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorChecksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about all available Trusted Advisor checks, including name, ID, category, description, and metadata. You must specify a language code; English ("en") and Japanese ("ja") are currently supported. The response contains a TrustedAdvisorCheckDescription for each check.
     */
  def describeTrustedAdvisorChecks(
    params: awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorChecksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorChecksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.DescribeTrustedAdvisorChecksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a refresh of the Trusted Advisor check that has the specified check ID. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks.  Some checks are refreshed automatically, and they cannot be refreshed by using this operation. Use of the RefreshTrustedAdvisorCheck operation for these checks causes an InvalidParameterValue error.  The response contains a TrustedAdvisorCheckRefreshStatus object, which contains these fields:    status. The refresh status of the check: "none", "enqueued", "processing", "success", or "abandoned".    millisUntilNextRefreshable. The amount of time, in milliseconds, until the check is eligible for refresh.    checkId. The unique identifier for the check.  
     */
  def refreshTrustedAdvisorCheck(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.RefreshTrustedAdvisorCheckResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a refresh of the Trusted Advisor check that has the specified check ID. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks.  Some checks are refreshed automatically, and they cannot be refreshed by using this operation. Use of the RefreshTrustedAdvisorCheck operation for these checks causes an InvalidParameterValue error.  The response contains a TrustedAdvisorCheckRefreshStatus object, which contains these fields:    status. The refresh status of the check: "none", "enqueued", "processing", "success", or "abandoned".    millisUntilNextRefreshable. The amount of time, in milliseconds, until the check is eligible for refresh.    checkId. The unique identifier for the check.  
     */
  def refreshTrustedAdvisorCheck(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.RefreshTrustedAdvisorCheckResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.RefreshTrustedAdvisorCheckResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a refresh of the Trusted Advisor check that has the specified check ID. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks.  Some checks are refreshed automatically, and they cannot be refreshed by using this operation. Use of the RefreshTrustedAdvisorCheck operation for these checks causes an InvalidParameterValue error.  The response contains a TrustedAdvisorCheckRefreshStatus object, which contains these fields:    status. The refresh status of the check: "none", "enqueued", "processing", "success", or "abandoned".    millisUntilNextRefreshable. The amount of time, in milliseconds, until the check is eligible for refresh.    checkId. The unique identifier for the check.  
     */
  def refreshTrustedAdvisorCheck(params: awsDashSdkLib.clientsSupportMod.SupportNs.RefreshTrustedAdvisorCheckRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.RefreshTrustedAdvisorCheckResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a refresh of the Trusted Advisor check that has the specified check ID. Check IDs can be obtained by calling DescribeTrustedAdvisorChecks.  Some checks are refreshed automatically, and they cannot be refreshed by using this operation. Use of the RefreshTrustedAdvisorCheck operation for these checks causes an InvalidParameterValue error.  The response contains a TrustedAdvisorCheckRefreshStatus object, which contains these fields:    status. The refresh status of the check: "none", "enqueued", "processing", "success", or "abandoned".    millisUntilNextRefreshable. The amount of time, in milliseconds, until the check is eligible for refresh.    checkId. The unique identifier for the check.  
     */
  def refreshTrustedAdvisorCheck(
    params: awsDashSdkLib.clientsSupportMod.SupportNs.RefreshTrustedAdvisorCheckRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.RefreshTrustedAdvisorCheckResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.RefreshTrustedAdvisorCheckResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Takes a caseId and returns the initial state of the case along with the state of the case after the call to ResolveCase completed.
     */
  def resolveCase(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.ResolveCaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Takes a caseId and returns the initial state of the case along with the state of the case after the call to ResolveCase completed.
     */
  def resolveCase(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.ResolveCaseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.ResolveCaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Takes a caseId and returns the initial state of the case along with the state of the case after the call to ResolveCase completed.
     */
  def resolveCase(params: awsDashSdkLib.clientsSupportMod.SupportNs.ResolveCaseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.ResolveCaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Takes a caseId and returns the initial state of the case along with the state of the case after the call to ResolveCase completed.
     */
  def resolveCase(
    params: awsDashSdkLib.clientsSupportMod.SupportNs.ResolveCaseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsSupportMod.SupportNs.ResolveCaseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsSupportMod.SupportNs.ResolveCaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

