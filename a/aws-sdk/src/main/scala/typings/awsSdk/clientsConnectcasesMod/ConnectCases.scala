package typings.awsSdk.clientsConnectcasesMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectCases extends Service {
  
  /**
    * Returns the description for the list of fields in the request parameters. 
    */
  def batchGetField(): Request[BatchGetFieldResponse, AWSError] = js.native
  def batchGetField(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetFieldResponse, Unit]): Request[BatchGetFieldResponse, AWSError] = js.native
  /**
    * Returns the description for the list of fields in the request parameters. 
    */
  def batchGetField(params: BatchGetFieldRequest): Request[BatchGetFieldResponse, AWSError] = js.native
  def batchGetField(
    params: BatchGetFieldRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetFieldResponse, Unit]
  ): Request[BatchGetFieldResponse, AWSError] = js.native
  
  /**
    * Creates and updates a set of field options for a single select field in a Cases domain.
    */
  def batchPutFieldOptions(): Request[BatchPutFieldOptionsResponse, AWSError] = js.native
  def batchPutFieldOptions(callback: js.Function2[/* err */ AWSError, /* data */ BatchPutFieldOptionsResponse, Unit]): Request[BatchPutFieldOptionsResponse, AWSError] = js.native
  /**
    * Creates and updates a set of field options for a single select field in a Cases domain.
    */
  def batchPutFieldOptions(params: BatchPutFieldOptionsRequest): Request[BatchPutFieldOptionsResponse, AWSError] = js.native
  def batchPutFieldOptions(
    params: BatchPutFieldOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchPutFieldOptionsResponse, Unit]
  ): Request[BatchPutFieldOptionsResponse, AWSError] = js.native
  
  @JSName("config")
  var config_ConnectCases: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a case in the specified Cases domain. Case system and custom fields are taken as an array id/value pairs with a declared data types.   customer_id is a required field when creating a case. 
    */
  def createCase(): Request[CreateCaseResponse, AWSError] = js.native
  def createCase(callback: js.Function2[/* err */ AWSError, /* data */ CreateCaseResponse, Unit]): Request[CreateCaseResponse, AWSError] = js.native
  /**
    * Creates a case in the specified Cases domain. Case system and custom fields are taken as an array id/value pairs with a declared data types.   customer_id is a required field when creating a case. 
    */
  def createCase(params: CreateCaseRequest): Request[CreateCaseResponse, AWSError] = js.native
  def createCase(
    params: CreateCaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCaseResponse, Unit]
  ): Request[CreateCaseResponse, AWSError] = js.native
  
  /**
    * Creates a domain, which is a container for all case data, such as cases, fields, templates and layouts. Each Amazon Connect instance can be associated with only one Cases domain.  This will not associate your connect instance to Cases domain. Instead, use the Amazon Connect CreateIntegrationAssociation API. 
    */
  def createDomain(): Request[CreateDomainResponse, AWSError] = js.native
  def createDomain(callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainResponse, Unit]): Request[CreateDomainResponse, AWSError] = js.native
  /**
    * Creates a domain, which is a container for all case data, such as cases, fields, templates and layouts. Each Amazon Connect instance can be associated with only one Cases domain.  This will not associate your connect instance to Cases domain. Instead, use the Amazon Connect CreateIntegrationAssociation API. 
    */
  def createDomain(params: CreateDomainRequest): Request[CreateDomainResponse, AWSError] = js.native
  def createDomain(
    params: CreateDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainResponse, Unit]
  ): Request[CreateDomainResponse, AWSError] = js.native
  
  /**
    * Creates a field in the Cases domain. This field is used to define the case object model (that is, defines what data can be captured on cases) in a Cases domain. 
    */
  def createField(): Request[CreateFieldResponse, AWSError] = js.native
  def createField(callback: js.Function2[/* err */ AWSError, /* data */ CreateFieldResponse, Unit]): Request[CreateFieldResponse, AWSError] = js.native
  /**
    * Creates a field in the Cases domain. This field is used to define the case object model (that is, defines what data can be captured on cases) in a Cases domain. 
    */
  def createField(params: CreateFieldRequest): Request[CreateFieldResponse, AWSError] = js.native
  def createField(
    params: CreateFieldRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateFieldResponse, Unit]
  ): Request[CreateFieldResponse, AWSError] = js.native
  
  /**
    * Creates a layout in the Cases domain. Layouts define the following configuration in the top section and More Info tab of the Cases user interface:   Fields to display to the users   Field ordering    Title and Status fields cannot be part of layouts since they are not configurable. 
    */
  def createLayout(): Request[CreateLayoutResponse, AWSError] = js.native
  def createLayout(callback: js.Function2[/* err */ AWSError, /* data */ CreateLayoutResponse, Unit]): Request[CreateLayoutResponse, AWSError] = js.native
  /**
    * Creates a layout in the Cases domain. Layouts define the following configuration in the top section and More Info tab of the Cases user interface:   Fields to display to the users   Field ordering    Title and Status fields cannot be part of layouts since they are not configurable. 
    */
  def createLayout(params: CreateLayoutRequest): Request[CreateLayoutResponse, AWSError] = js.native
  def createLayout(
    params: CreateLayoutRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLayoutResponse, Unit]
  ): Request[CreateLayoutResponse, AWSError] = js.native
  
  /**
    * Creates a related item (comments, tasks, and contacts) and associates it with a case.  A Related Item is a resource that is associated with a case. It may or may not have an external identifier linking it to an external resource (for example, a contactArn). All Related Items have their own internal identifier, the relatedItemArn. Examples of related items include comments and contacts. 
    */
  def createRelatedItem(): Request[CreateRelatedItemResponse, AWSError] = js.native
  def createRelatedItem(callback: js.Function2[/* err */ AWSError, /* data */ CreateRelatedItemResponse, Unit]): Request[CreateRelatedItemResponse, AWSError] = js.native
  /**
    * Creates a related item (comments, tasks, and contacts) and associates it with a case.  A Related Item is a resource that is associated with a case. It may or may not have an external identifier linking it to an external resource (for example, a contactArn). All Related Items have their own internal identifier, the relatedItemArn. Examples of related items include comments and contacts. 
    */
  def createRelatedItem(params: CreateRelatedItemRequest): Request[CreateRelatedItemResponse, AWSError] = js.native
  def createRelatedItem(
    params: CreateRelatedItemRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRelatedItemResponse, Unit]
  ): Request[CreateRelatedItemResponse, AWSError] = js.native
  
  /**
    * Creates a template in the Cases domain. This template is used to define the case object model (that is, define what data can be captured on cases) in a Cases domain. A template must have a unique name within a domain, and it must reference existing field IDs and layout IDs. Additionally, multiple fields with same IDs are not allowed within the same Template.
    */
  def createTemplate(): Request[CreateTemplateResponse, AWSError] = js.native
  def createTemplate(callback: js.Function2[/* err */ AWSError, /* data */ CreateTemplateResponse, Unit]): Request[CreateTemplateResponse, AWSError] = js.native
  /**
    * Creates a template in the Cases domain. This template is used to define the case object model (that is, define what data can be captured on cases) in a Cases domain. A template must have a unique name within a domain, and it must reference existing field IDs and layout IDs. Additionally, multiple fields with same IDs are not allowed within the same Template.
    */
  def createTemplate(params: CreateTemplateRequest): Request[CreateTemplateResponse, AWSError] = js.native
  def createTemplate(
    params: CreateTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTemplateResponse, Unit]
  ): Request[CreateTemplateResponse, AWSError] = js.native
  
  /**
    * Returns information about a specific case if it exists. 
    */
  def getCase(): Request[GetCaseResponse, AWSError] = js.native
  def getCase(callback: js.Function2[/* err */ AWSError, /* data */ GetCaseResponse, Unit]): Request[GetCaseResponse, AWSError] = js.native
  /**
    * Returns information about a specific case if it exists. 
    */
  def getCase(params: GetCaseRequest): Request[GetCaseResponse, AWSError] = js.native
  def getCase(
    params: GetCaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCaseResponse, Unit]
  ): Request[GetCaseResponse, AWSError] = js.native
  
  /**
    * Returns the case event publishing configuration.
    */
  def getCaseEventConfiguration(): Request[GetCaseEventConfigurationResponse, AWSError] = js.native
  def getCaseEventConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetCaseEventConfigurationResponse, Unit]): Request[GetCaseEventConfigurationResponse, AWSError] = js.native
  /**
    * Returns the case event publishing configuration.
    */
  def getCaseEventConfiguration(params: GetCaseEventConfigurationRequest): Request[GetCaseEventConfigurationResponse, AWSError] = js.native
  def getCaseEventConfiguration(
    params: GetCaseEventConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCaseEventConfigurationResponse, Unit]
  ): Request[GetCaseEventConfigurationResponse, AWSError] = js.native
  
  /**
    * Returns information about a specific domain if it exists. 
    */
  def getDomain(): Request[GetDomainResponse, AWSError] = js.native
  def getDomain(callback: js.Function2[/* err */ AWSError, /* data */ GetDomainResponse, Unit]): Request[GetDomainResponse, AWSError] = js.native
  /**
    * Returns information about a specific domain if it exists. 
    */
  def getDomain(params: GetDomainRequest): Request[GetDomainResponse, AWSError] = js.native
  def getDomain(
    params: GetDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDomainResponse, Unit]
  ): Request[GetDomainResponse, AWSError] = js.native
  
  /**
    * Returns the details for the requested layout.
    */
  def getLayout(): Request[GetLayoutResponse, AWSError] = js.native
  def getLayout(callback: js.Function2[/* err */ AWSError, /* data */ GetLayoutResponse, Unit]): Request[GetLayoutResponse, AWSError] = js.native
  /**
    * Returns the details for the requested layout.
    */
  def getLayout(params: GetLayoutRequest): Request[GetLayoutResponse, AWSError] = js.native
  def getLayout(
    params: GetLayoutRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLayoutResponse, Unit]
  ): Request[GetLayoutResponse, AWSError] = js.native
  
  /**
    * Returns the details for the requested template. 
    */
  def getTemplate(): Request[GetTemplateResponse, AWSError] = js.native
  def getTemplate(callback: js.Function2[/* err */ AWSError, /* data */ GetTemplateResponse, Unit]): Request[GetTemplateResponse, AWSError] = js.native
  /**
    * Returns the details for the requested template. 
    */
  def getTemplate(params: GetTemplateRequest): Request[GetTemplateResponse, AWSError] = js.native
  def getTemplate(
    params: GetTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTemplateResponse, Unit]
  ): Request[GetTemplateResponse, AWSError] = js.native
  
  /**
    * Lists cases for a given contact.
    */
  def listCasesForContact(): Request[ListCasesForContactResponse, AWSError] = js.native
  def listCasesForContact(callback: js.Function2[/* err */ AWSError, /* data */ ListCasesForContactResponse, Unit]): Request[ListCasesForContactResponse, AWSError] = js.native
  /**
    * Lists cases for a given contact.
    */
  def listCasesForContact(params: ListCasesForContactRequest): Request[ListCasesForContactResponse, AWSError] = js.native
  def listCasesForContact(
    params: ListCasesForContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCasesForContactResponse, Unit]
  ): Request[ListCasesForContactResponse, AWSError] = js.native
  
  /**
    * Lists all cases domains in the Amazon Web Services account. Each list item is a condensed summary object of the domain.
    */
  def listDomains(): Request[ListDomainsResponse, AWSError] = js.native
  def listDomains(callback: js.Function2[/* err */ AWSError, /* data */ ListDomainsResponse, Unit]): Request[ListDomainsResponse, AWSError] = js.native
  /**
    * Lists all cases domains in the Amazon Web Services account. Each list item is a condensed summary object of the domain.
    */
  def listDomains(params: ListDomainsRequest): Request[ListDomainsResponse, AWSError] = js.native
  def listDomains(
    params: ListDomainsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDomainsResponse, Unit]
  ): Request[ListDomainsResponse, AWSError] = js.native
  
  /**
    * Lists all of the field options for a field identifier in the domain. 
    */
  def listFieldOptions(): Request[ListFieldOptionsResponse, AWSError] = js.native
  def listFieldOptions(callback: js.Function2[/* err */ AWSError, /* data */ ListFieldOptionsResponse, Unit]): Request[ListFieldOptionsResponse, AWSError] = js.native
  /**
    * Lists all of the field options for a field identifier in the domain. 
    */
  def listFieldOptions(params: ListFieldOptionsRequest): Request[ListFieldOptionsResponse, AWSError] = js.native
  def listFieldOptions(
    params: ListFieldOptionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFieldOptionsResponse, Unit]
  ): Request[ListFieldOptionsResponse, AWSError] = js.native
  
  /**
    * Lists all fields in a Cases domain.
    */
  def listFields(): Request[ListFieldsResponse, AWSError] = js.native
  def listFields(callback: js.Function2[/* err */ AWSError, /* data */ ListFieldsResponse, Unit]): Request[ListFieldsResponse, AWSError] = js.native
  /**
    * Lists all fields in a Cases domain.
    */
  def listFields(params: ListFieldsRequest): Request[ListFieldsResponse, AWSError] = js.native
  def listFields(
    params: ListFieldsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFieldsResponse, Unit]
  ): Request[ListFieldsResponse, AWSError] = js.native
  
  /**
    * Lists all layouts in the given cases domain. Each list item is a condensed summary object of the layout.
    */
  def listLayouts(): Request[ListLayoutsResponse, AWSError] = js.native
  def listLayouts(callback: js.Function2[/* err */ AWSError, /* data */ ListLayoutsResponse, Unit]): Request[ListLayoutsResponse, AWSError] = js.native
  /**
    * Lists all layouts in the given cases domain. Each list item is a condensed summary object of the layout.
    */
  def listLayouts(params: ListLayoutsRequest): Request[ListLayoutsResponse, AWSError] = js.native
  def listLayouts(
    params: ListLayoutsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLayoutsResponse, Unit]
  ): Request[ListLayoutsResponse, AWSError] = js.native
  
  /**
    * Lists tags for a resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists tags for a resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Lists all of the templates in a Cases domain. Each list item is a condensed summary object of the template. 
    */
  def listTemplates(): Request[ListTemplatesResponse, AWSError] = js.native
  def listTemplates(callback: js.Function2[/* err */ AWSError, /* data */ ListTemplatesResponse, Unit]): Request[ListTemplatesResponse, AWSError] = js.native
  /**
    * Lists all of the templates in a Cases domain. Each list item is a condensed summary object of the template. 
    */
  def listTemplates(params: ListTemplatesRequest): Request[ListTemplatesResponse, AWSError] = js.native
  def listTemplates(
    params: ListTemplatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTemplatesResponse, Unit]
  ): Request[ListTemplatesResponse, AWSError] = js.native
  
  /**
    * API for adding case event publishing configuration
    */
  def putCaseEventConfiguration(): Request[PutCaseEventConfigurationResponse, AWSError] = js.native
  def putCaseEventConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ PutCaseEventConfigurationResponse, Unit]): Request[PutCaseEventConfigurationResponse, AWSError] = js.native
  /**
    * API for adding case event publishing configuration
    */
  def putCaseEventConfiguration(params: PutCaseEventConfigurationRequest): Request[PutCaseEventConfigurationResponse, AWSError] = js.native
  def putCaseEventConfiguration(
    params: PutCaseEventConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutCaseEventConfigurationResponse, Unit]
  ): Request[PutCaseEventConfigurationResponse, AWSError] = js.native
  
  /**
    * Searches for cases within their associated Cases domain. Search results are returned as a paginated list of abridged case documents.
    */
  def searchCases(): Request[SearchCasesResponse, AWSError] = js.native
  def searchCases(callback: js.Function2[/* err */ AWSError, /* data */ SearchCasesResponse, Unit]): Request[SearchCasesResponse, AWSError] = js.native
  /**
    * Searches for cases within their associated Cases domain. Search results are returned as a paginated list of abridged case documents.
    */
  def searchCases(params: SearchCasesRequest): Request[SearchCasesResponse, AWSError] = js.native
  def searchCases(
    params: SearchCasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchCasesResponse, Unit]
  ): Request[SearchCasesResponse, AWSError] = js.native
  
  /**
    * Searches for related items that are associated with a case.  If no filters are provided, this returns all related items associated with a case. 
    */
  def searchRelatedItems(): Request[SearchRelatedItemsResponse, AWSError] = js.native
  def searchRelatedItems(callback: js.Function2[/* err */ AWSError, /* data */ SearchRelatedItemsResponse, Unit]): Request[SearchRelatedItemsResponse, AWSError] = js.native
  /**
    * Searches for related items that are associated with a case.  If no filters are provided, this returns all related items associated with a case. 
    */
  def searchRelatedItems(params: SearchRelatedItemsRequest): Request[SearchRelatedItemsResponse, AWSError] = js.native
  def searchRelatedItems(
    params: SearchRelatedItemsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchRelatedItemsResponse, Unit]
  ): Request[SearchRelatedItemsResponse, AWSError] = js.native
  
  /**
    * Adds tags to a resource.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds tags to a resource.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Untags a resource.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Untags a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates the values of fields on a case. Fields to be updated are received as an array of id/value pairs identical to the CreateCase input . If the action is successful, the service sends back an HTTP 200 response with an empty HTTP body.
    */
  def updateCase(): Request[UpdateCaseResponse, AWSError] = js.native
  def updateCase(callback: js.Function2[/* err */ AWSError, /* data */ UpdateCaseResponse, Unit]): Request[UpdateCaseResponse, AWSError] = js.native
  /**
    * Updates the values of fields on a case. Fields to be updated are received as an array of id/value pairs identical to the CreateCase input . If the action is successful, the service sends back an HTTP 200 response with an empty HTTP body.
    */
  def updateCase(params: UpdateCaseRequest): Request[UpdateCaseResponse, AWSError] = js.native
  def updateCase(
    params: UpdateCaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCaseResponse, Unit]
  ): Request[UpdateCaseResponse, AWSError] = js.native
  
  /**
    * Updates the properties of an existing field. 
    */
  def updateField(): Request[UpdateFieldResponse, AWSError] = js.native
  def updateField(callback: js.Function2[/* err */ AWSError, /* data */ UpdateFieldResponse, Unit]): Request[UpdateFieldResponse, AWSError] = js.native
  /**
    * Updates the properties of an existing field. 
    */
  def updateField(params: UpdateFieldRequest): Request[UpdateFieldResponse, AWSError] = js.native
  def updateField(
    params: UpdateFieldRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateFieldResponse, Unit]
  ): Request[UpdateFieldResponse, AWSError] = js.native
  
  /**
    * Updates the attributes of an existing layout. If the action is successful, the service sends back an HTTP 200 response with an empty HTTP body. A ValidationException is returned when you add non-existent fieldIds to a layout.  Title and Status fields cannot be part of layouts because they are not configurable. 
    */
  def updateLayout(): Request[UpdateLayoutResponse, AWSError] = js.native
  def updateLayout(callback: js.Function2[/* err */ AWSError, /* data */ UpdateLayoutResponse, Unit]): Request[UpdateLayoutResponse, AWSError] = js.native
  /**
    * Updates the attributes of an existing layout. If the action is successful, the service sends back an HTTP 200 response with an empty HTTP body. A ValidationException is returned when you add non-existent fieldIds to a layout.  Title and Status fields cannot be part of layouts because they are not configurable. 
    */
  def updateLayout(params: UpdateLayoutRequest): Request[UpdateLayoutResponse, AWSError] = js.native
  def updateLayout(
    params: UpdateLayoutRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateLayoutResponse, Unit]
  ): Request[UpdateLayoutResponse, AWSError] = js.native
  
  /**
    * Updates the attributes of an existing template. The template attributes that can be modified include name, description, layouts, and requiredFields. At least one of these attributes must not be null. If a null value is provided for a given attribute, that attribute is ignored and its current value is preserved.
    */
  def updateTemplate(): Request[UpdateTemplateResponse, AWSError] = js.native
  def updateTemplate(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTemplateResponse, Unit]): Request[UpdateTemplateResponse, AWSError] = js.native
  /**
    * Updates the attributes of an existing template. The template attributes that can be modified include name, description, layouts, and requiredFields. At least one of these attributes must not be null. If a null value is provided for a given attribute, that attribute is ignored and its current value is preserved.
    */
  def updateTemplate(params: UpdateTemplateRequest): Request[UpdateTemplateResponse, AWSError] = js.native
  def updateTemplate(
    params: UpdateTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTemplateResponse, Unit]
  ): Request[UpdateTemplateResponse, AWSError] = js.native
}
