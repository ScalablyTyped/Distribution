package typings.awsSdk.clientsResourceexplorer2Mod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceExplorer2 extends Service {
  
  /**
    * Sets the specified view as the default for the Amazon Web Services Region in which you call this operation. When a user performs a Search that doesn't explicitly specify which view to use, then Amazon Web Services Resource Explorer automatically chooses this default view for searches performed in this Amazon Web Services Region. If an Amazon Web Services Region doesn't have a default view configured, then users must explicitly specify a view with every Search operation performed in that Region.
    */
  def associateDefaultView(): Request[AssociateDefaultViewOutput, AWSError] = js.native
  def associateDefaultView(callback: js.Function2[/* err */ AWSError, /* data */ AssociateDefaultViewOutput, Unit]): Request[AssociateDefaultViewOutput, AWSError] = js.native
  /**
    * Sets the specified view as the default for the Amazon Web Services Region in which you call this operation. When a user performs a Search that doesn't explicitly specify which view to use, then Amazon Web Services Resource Explorer automatically chooses this default view for searches performed in this Amazon Web Services Region. If an Amazon Web Services Region doesn't have a default view configured, then users must explicitly specify a view with every Search operation performed in that Region.
    */
  def associateDefaultView(params: AssociateDefaultViewInput): Request[AssociateDefaultViewOutput, AWSError] = js.native
  def associateDefaultView(
    params: AssociateDefaultViewInput,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateDefaultViewOutput, Unit]
  ): Request[AssociateDefaultViewOutput, AWSError] = js.native
  
  /**
    * Retrieves details about a list of views.
    */
  def batchGetView(): Request[BatchGetViewOutput, AWSError] = js.native
  def batchGetView(callback: js.Function2[/* err */ AWSError, /* data */ BatchGetViewOutput, Unit]): Request[BatchGetViewOutput, AWSError] = js.native
  /**
    * Retrieves details about a list of views.
    */
  def batchGetView(params: BatchGetViewInput): Request[BatchGetViewOutput, AWSError] = js.native
  def batchGetView(
    params: BatchGetViewInput,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGetViewOutput, Unit]
  ): Request[BatchGetViewOutput, AWSError] = js.native
  
  @JSName("config")
  var config_ResourceExplorer2: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Turns on Amazon Web Services Resource Explorer in the Amazon Web Services Region in which you called this operation by creating an index. Resource Explorer begins discovering the resources in this Region and stores the details about the resources in the index so that they can be queried by using the Search operation. You can create only one index in a Region.  This operation creates only a local index. To promote the local index in one Amazon Web Services Region into the aggregator index for the Amazon Web Services account, use the UpdateIndexType operation. For more information, see Turning on cross-Region search by creating an aggregator index in the Amazon Web Services Resource Explorer User Guide.  For more details about what happens when you turn on Resource Explorer in an Amazon Web Services Region, see Turn on Resource Explorer to index your resources in an Amazon Web Services Region in the Amazon Web Services Resource Explorer User Guide. If this is the first Amazon Web Services Region in which you've created an index for Resource Explorer, then this operation also creates a service-linked role in your Amazon Web Services account that allows Resource Explorer to enumerate your resources to populate the index.    Action: resource-explorer-2:CreateIndex   Resource: The ARN of the index (as it will exist after the operation completes) in the Amazon Web Services Region and account in which you're trying to create the index. Use the wildcard character (*) at the end of the string to match the eventual UUID. For example, the following Resource element restricts the role or user to creating an index in only the us-east-2 Region of the specified account.  "Resource": "arn:aws:resource-explorer-2:us-west-2:&lt;account-id&gt;:index/ *"  Alternatively, you can use "Resource": "*" to allow the role or user to create an index in any Region.    Action: iam:CreateServiceLinkedRole   Resource: No specific resource (*).  This permission is required only the first time you create an index to turn on Resource Explorer in the account. Resource Explorer uses this to create the service-linked role needed to index the resources in your account. Resource Explorer uses the same service-linked role for all additional indexes you create afterwards.  
    */
  def createIndex(): Request[CreateIndexOutput, AWSError] = js.native
  def createIndex(callback: js.Function2[/* err */ AWSError, /* data */ CreateIndexOutput, Unit]): Request[CreateIndexOutput, AWSError] = js.native
  /**
    * Turns on Amazon Web Services Resource Explorer in the Amazon Web Services Region in which you called this operation by creating an index. Resource Explorer begins discovering the resources in this Region and stores the details about the resources in the index so that they can be queried by using the Search operation. You can create only one index in a Region.  This operation creates only a local index. To promote the local index in one Amazon Web Services Region into the aggregator index for the Amazon Web Services account, use the UpdateIndexType operation. For more information, see Turning on cross-Region search by creating an aggregator index in the Amazon Web Services Resource Explorer User Guide.  For more details about what happens when you turn on Resource Explorer in an Amazon Web Services Region, see Turn on Resource Explorer to index your resources in an Amazon Web Services Region in the Amazon Web Services Resource Explorer User Guide. If this is the first Amazon Web Services Region in which you've created an index for Resource Explorer, then this operation also creates a service-linked role in your Amazon Web Services account that allows Resource Explorer to enumerate your resources to populate the index.    Action: resource-explorer-2:CreateIndex   Resource: The ARN of the index (as it will exist after the operation completes) in the Amazon Web Services Region and account in which you're trying to create the index. Use the wildcard character (*) at the end of the string to match the eventual UUID. For example, the following Resource element restricts the role or user to creating an index in only the us-east-2 Region of the specified account.  "Resource": "arn:aws:resource-explorer-2:us-west-2:&lt;account-id&gt;:index/ *"  Alternatively, you can use "Resource": "*" to allow the role or user to create an index in any Region.    Action: iam:CreateServiceLinkedRole   Resource: No specific resource (*).  This permission is required only the first time you create an index to turn on Resource Explorer in the account. Resource Explorer uses this to create the service-linked role needed to index the resources in your account. Resource Explorer uses the same service-linked role for all additional indexes you create afterwards.  
    */
  def createIndex(params: CreateIndexInput): Request[CreateIndexOutput, AWSError] = js.native
  def createIndex(
    params: CreateIndexInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateIndexOutput, Unit]
  ): Request[CreateIndexOutput, AWSError] = js.native
  
  /**
    * Creates a view that users can query by using the Search operation. Results from queries that you make using this view include only resources that match the view's Filters. For more information about Amazon Web Services Resource Explorer views, see Managing views in the Amazon Web Services Resource Explorer User Guide. Only the principals with an IAM identity-based policy that grants Allow to the Search action on a Resource with the Amazon resource name (ARN) of this view can Search using views you create with this operation.
    */
  def createView(): Request[CreateViewOutput, AWSError] = js.native
  def createView(callback: js.Function2[/* err */ AWSError, /* data */ CreateViewOutput, Unit]): Request[CreateViewOutput, AWSError] = js.native
  /**
    * Creates a view that users can query by using the Search operation. Results from queries that you make using this view include only resources that match the view's Filters. For more information about Amazon Web Services Resource Explorer views, see Managing views in the Amazon Web Services Resource Explorer User Guide. Only the principals with an IAM identity-based policy that grants Allow to the Search action on a Resource with the Amazon resource name (ARN) of this view can Search using views you create with this operation.
    */
  def createView(params: CreateViewInput): Request[CreateViewOutput, AWSError] = js.native
  def createView(
    params: CreateViewInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateViewOutput, Unit]
  ): Request[CreateViewOutput, AWSError] = js.native
  
  /**
    * Deletes the specified index and turns off Amazon Web Services Resource Explorer in the specified Amazon Web Services Region. When you delete an index, Resource Explorer stops discovering and indexing resources in that Region. Resource Explorer also deletes all views in that Region. These actions occur as asynchronous background tasks. You can check to see when the actions are complete by using the GetIndex operation and checking the Status response value.
    */
  def deleteIndex(): Request[DeleteIndexOutput, AWSError] = js.native
  def deleteIndex(callback: js.Function2[/* err */ AWSError, /* data */ DeleteIndexOutput, Unit]): Request[DeleteIndexOutput, AWSError] = js.native
  /**
    * Deletes the specified index and turns off Amazon Web Services Resource Explorer in the specified Amazon Web Services Region. When you delete an index, Resource Explorer stops discovering and indexing resources in that Region. Resource Explorer also deletes all views in that Region. These actions occur as asynchronous background tasks. You can check to see when the actions are complete by using the GetIndex operation and checking the Status response value.
    */
  def deleteIndex(params: DeleteIndexInput): Request[DeleteIndexOutput, AWSError] = js.native
  def deleteIndex(
    params: DeleteIndexInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteIndexOutput, Unit]
  ): Request[DeleteIndexOutput, AWSError] = js.native
  
  /**
    * Deletes the specified view. If the specified view is the default view for its Amazon Web Services Region, then all Search operations in that Region must explicitly specify the view to use until you configure a new default by calling the AssociateDefaultView operation.
    */
  def deleteView(): Request[DeleteViewOutput, AWSError] = js.native
  def deleteView(callback: js.Function2[/* err */ AWSError, /* data */ DeleteViewOutput, Unit]): Request[DeleteViewOutput, AWSError] = js.native
  /**
    * Deletes the specified view. If the specified view is the default view for its Amazon Web Services Region, then all Search operations in that Region must explicitly specify the view to use until you configure a new default by calling the AssociateDefaultView operation.
    */
  def deleteView(params: DeleteViewInput): Request[DeleteViewOutput, AWSError] = js.native
  def deleteView(
    params: DeleteViewInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteViewOutput, Unit]
  ): Request[DeleteViewOutput, AWSError] = js.native
  
  /**
    * After you call this operation, the affected Amazon Web Services Region no longer has a default view. All Search operations in that Region must explicitly specify a view or the operation fails. You can configure a new default by calling the AssociateDefaultView operation. If an Amazon Web Services Region doesn't have a default view configured, then users must explicitly specify a view with every Search operation performed in that Region.
    */
  def disassociateDefaultView(): Request[js.Object, AWSError] = js.native
  def disassociateDefaultView(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Retrieves the Amazon Resource Name (ARN) of the view that is the default for the Amazon Web Services Region in which you call this operation. You can then call GetView to retrieve the details of that view.
    */
  def getDefaultView(): Request[GetDefaultViewOutput, AWSError] = js.native
  def getDefaultView(callback: js.Function2[/* err */ AWSError, /* data */ GetDefaultViewOutput, Unit]): Request[GetDefaultViewOutput, AWSError] = js.native
  
  /**
    * Retrieves details about the Amazon Web Services Resource Explorer index in the Amazon Web Services Region in which you invoked the operation.
    */
  def getIndex(): Request[GetIndexOutput, AWSError] = js.native
  def getIndex(callback: js.Function2[/* err */ AWSError, /* data */ GetIndexOutput, Unit]): Request[GetIndexOutput, AWSError] = js.native
  
  /**
    * Retrieves details of the specified view.
    */
  def getView(): Request[GetViewOutput, AWSError] = js.native
  def getView(callback: js.Function2[/* err */ AWSError, /* data */ GetViewOutput, Unit]): Request[GetViewOutput, AWSError] = js.native
  /**
    * Retrieves details of the specified view.
    */
  def getView(params: GetViewInput): Request[GetViewOutput, AWSError] = js.native
  def getView(params: GetViewInput, callback: js.Function2[/* err */ AWSError, /* data */ GetViewOutput, Unit]): Request[GetViewOutput, AWSError] = js.native
  
  /**
    * Retrieves a list of all of the indexes in Amazon Web Services Regions that are currently collecting resource information for Amazon Web Services Resource Explorer.
    */
  def listIndexes(): Request[ListIndexesOutput, AWSError] = js.native
  def listIndexes(callback: js.Function2[/* err */ AWSError, /* data */ ListIndexesOutput, Unit]): Request[ListIndexesOutput, AWSError] = js.native
  /**
    * Retrieves a list of all of the indexes in Amazon Web Services Regions that are currently collecting resource information for Amazon Web Services Resource Explorer.
    */
  def listIndexes(params: ListIndexesInput): Request[ListIndexesOutput, AWSError] = js.native
  def listIndexes(
    params: ListIndexesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIndexesOutput, Unit]
  ): Request[ListIndexesOutput, AWSError] = js.native
  
  /**
    * Retrieves a list of all resource types currently supported by Amazon Web Services Resource Explorer.
    */
  def listSupportedResourceTypes(): Request[ListSupportedResourceTypesOutput, AWSError] = js.native
  def listSupportedResourceTypes(callback: js.Function2[/* err */ AWSError, /* data */ ListSupportedResourceTypesOutput, Unit]): Request[ListSupportedResourceTypesOutput, AWSError] = js.native
  /**
    * Retrieves a list of all resource types currently supported by Amazon Web Services Resource Explorer.
    */
  def listSupportedResourceTypes(params: ListSupportedResourceTypesInput): Request[ListSupportedResourceTypesOutput, AWSError] = js.native
  def listSupportedResourceTypes(
    params: ListSupportedResourceTypesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSupportedResourceTypesOutput, Unit]
  ): Request[ListSupportedResourceTypesOutput, AWSError] = js.native
  
  /**
    * Lists the tags that are attached to the specified resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]): Request[ListTagsForResourceOutput, AWSError] = js.native
  /**
    * Lists the tags that are attached to the specified resource.
    */
  def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceOutput, Unit]
  ): Request[ListTagsForResourceOutput, AWSError] = js.native
  
  /**
    * Lists the Amazon resource names (ARNs) of the views available in the Amazon Web Services Region in which you call this operation.  Always check the NextToken response parameter for a null value when calling a paginated operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display. 
    */
  def listViews(): Request[ListViewsOutput, AWSError] = js.native
  def listViews(callback: js.Function2[/* err */ AWSError, /* data */ ListViewsOutput, Unit]): Request[ListViewsOutput, AWSError] = js.native
  /**
    * Lists the Amazon resource names (ARNs) of the views available in the Amazon Web Services Region in which you call this operation.  Always check the NextToken response parameter for a null value when calling a paginated operation. These operations can occasionally return an empty set of results even when there are more results available. The NextToken response parameter value is null only when there are no more results to display. 
    */
  def listViews(params: ListViewsInput): Request[ListViewsOutput, AWSError] = js.native
  def listViews(
    params: ListViewsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListViewsOutput, Unit]
  ): Request[ListViewsOutput, AWSError] = js.native
  
  /**
    * Searches for resources and displays details about all resources that match the specified criteria. You must specify a query string. All search queries must use a view. If you don't explicitly specify a view, then Amazon Web Services Resource Explorer uses the default view for the Amazon Web Services Region in which you call this operation. The results are the logical intersection of the results that match both the QueryString parameter supplied to this operation and the SearchFilter parameter attached to the view. For the complete syntax supported by the QueryString parameter, see Search query syntax reference for Resource Explorer. If your search results are empty, or are missing results that you think should be there, see Troubleshooting Resource Explorer search.
    */
  def search(): Request[SearchOutput, AWSError] = js.native
  def search(callback: js.Function2[/* err */ AWSError, /* data */ SearchOutput, Unit]): Request[SearchOutput, AWSError] = js.native
  /**
    * Searches for resources and displays details about all resources that match the specified criteria. You must specify a query string. All search queries must use a view. If you don't explicitly specify a view, then Amazon Web Services Resource Explorer uses the default view for the Amazon Web Services Region in which you call this operation. The results are the logical intersection of the results that match both the QueryString parameter supplied to this operation and the SearchFilter parameter attached to the view. For the complete syntax supported by the QueryString parameter, see Search query syntax reference for Resource Explorer. If your search results are empty, or are missing results that you think should be there, see Troubleshooting Resource Explorer search.
    */
  def search(params: SearchInput): Request[SearchOutput, AWSError] = js.native
  def search(params: SearchInput, callback: js.Function2[/* err */ AWSError, /* data */ SearchOutput, Unit]): Request[SearchOutput, AWSError] = js.native
  
  /**
    * Adds one or more tag key and value pairs to an Amazon Web Services Resource Explorer view or index.
    */
  def tagResource(): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]): Request[TagResourceOutput, AWSError] = js.native
  /**
    * Adds one or more tag key and value pairs to an Amazon Web Services Resource Explorer view or index.
    */
  def tagResource(params: TagResourceInput): Request[TagResourceOutput, AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceOutput, Unit]
  ): Request[TagResourceOutput, AWSError] = js.native
  
  /**
    * Removes one or more tag key and value pairs from an Amazon Web Services Resource Explorer view or index.
    */
  def untagResource(): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]): Request[UntagResourceOutput, AWSError] = js.native
  /**
    * Removes one or more tag key and value pairs from an Amazon Web Services Resource Explorer view or index.
    */
  def untagResource(params: UntagResourceInput): Request[UntagResourceOutput, AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceOutput, Unit]
  ): Request[UntagResourceOutput, AWSError] = js.native
  
  /**
    * Changes the type of the index from one of the following types to the other. For more information about indexes and the role they perform in Amazon Web Services Resource Explorer, see Turning on cross-Region search by creating an aggregator index in the Amazon Web Services Resource Explorer User Guide.     AGGREGATOR index type  The index contains information about resources from all Amazon Web Services Regions in the Amazon Web Services account in which you've created a Resource Explorer index. Resource information from all other Regions is replicated to this Region's index. When you change the index type to AGGREGATOR, Resource Explorer turns on replication of all discovered resource information from the other Amazon Web Services Regions in your account to this index. You can then, from this Region only, perform resource search queries that span all Amazon Web Services Regions in the Amazon Web Services account. Turning on replication from all other Regions is performed by asynchronous background tasks. You can check the status of the asynchronous tasks by using the GetIndex operation. When the asynchronous tasks complete, the Status response of that operation changes from UPDATING to ACTIVE. After that, you can start to see results from other Amazon Web Services Regions in query results. However, it can take several hours for replication from all other Regions to complete.  You can have only one aggregator index per Amazon Web Services account. Before you can promote a different index to be the aggregator index for the account, you must first demote the existing aggregator index to type LOCAL.      LOCAL index type  The index contains information about resources in only the Amazon Web Services Region in which the index exists. If an aggregator index in another Region exists, then information in this local index is replicated to the aggregator index. When you change the index type to LOCAL, Resource Explorer turns off the replication of resource information from all other Amazon Web Services Regions in the Amazon Web Services account to this Region. The aggregator index remains in the UPDATING state until all replication with other Regions successfully stops. You can check the status of the asynchronous task by using the GetIndex operation. When Resource Explorer successfully stops all replication with other Regions, the Status response of that operation changes from UPDATING to ACTIVE. Separately, the resource information from other Regions that was previously stored in the index is deleted within 30 days by another background task. Until that asynchronous task completes, some results from other Regions can continue to appear in search results.  After you demote an aggregator index to a local index, you must wait 24 hours before you can promote another index to be the new aggregator index for the account.   
    */
  def updateIndexType(): Request[UpdateIndexTypeOutput, AWSError] = js.native
  def updateIndexType(callback: js.Function2[/* err */ AWSError, /* data */ UpdateIndexTypeOutput, Unit]): Request[UpdateIndexTypeOutput, AWSError] = js.native
  /**
    * Changes the type of the index from one of the following types to the other. For more information about indexes and the role they perform in Amazon Web Services Resource Explorer, see Turning on cross-Region search by creating an aggregator index in the Amazon Web Services Resource Explorer User Guide.     AGGREGATOR index type  The index contains information about resources from all Amazon Web Services Regions in the Amazon Web Services account in which you've created a Resource Explorer index. Resource information from all other Regions is replicated to this Region's index. When you change the index type to AGGREGATOR, Resource Explorer turns on replication of all discovered resource information from the other Amazon Web Services Regions in your account to this index. You can then, from this Region only, perform resource search queries that span all Amazon Web Services Regions in the Amazon Web Services account. Turning on replication from all other Regions is performed by asynchronous background tasks. You can check the status of the asynchronous tasks by using the GetIndex operation. When the asynchronous tasks complete, the Status response of that operation changes from UPDATING to ACTIVE. After that, you can start to see results from other Amazon Web Services Regions in query results. However, it can take several hours for replication from all other Regions to complete.  You can have only one aggregator index per Amazon Web Services account. Before you can promote a different index to be the aggregator index for the account, you must first demote the existing aggregator index to type LOCAL.      LOCAL index type  The index contains information about resources in only the Amazon Web Services Region in which the index exists. If an aggregator index in another Region exists, then information in this local index is replicated to the aggregator index. When you change the index type to LOCAL, Resource Explorer turns off the replication of resource information from all other Amazon Web Services Regions in the Amazon Web Services account to this Region. The aggregator index remains in the UPDATING state until all replication with other Regions successfully stops. You can check the status of the asynchronous task by using the GetIndex operation. When Resource Explorer successfully stops all replication with other Regions, the Status response of that operation changes from UPDATING to ACTIVE. Separately, the resource information from other Regions that was previously stored in the index is deleted within 30 days by another background task. Until that asynchronous task completes, some results from other Regions can continue to appear in search results.  After you demote an aggregator index to a local index, you must wait 24 hours before you can promote another index to be the new aggregator index for the account.   
    */
  def updateIndexType(params: UpdateIndexTypeInput): Request[UpdateIndexTypeOutput, AWSError] = js.native
  def updateIndexType(
    params: UpdateIndexTypeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateIndexTypeOutput, Unit]
  ): Request[UpdateIndexTypeOutput, AWSError] = js.native
  
  /**
    * Modifies some of the details of a view. You can change the filter string and the list of included properties. You can't change the name of the view.
    */
  def updateView(): Request[UpdateViewOutput, AWSError] = js.native
  def updateView(callback: js.Function2[/* err */ AWSError, /* data */ UpdateViewOutput, Unit]): Request[UpdateViewOutput, AWSError] = js.native
  /**
    * Modifies some of the details of a view. You can change the filter string and the list of included properties. You can't change the name of the view.
    */
  def updateView(params: UpdateViewInput): Request[UpdateViewOutput, AWSError] = js.native
  def updateView(
    params: UpdateViewInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateViewOutput, Unit]
  ): Request[UpdateViewOutput, AWSError] = js.native
}
