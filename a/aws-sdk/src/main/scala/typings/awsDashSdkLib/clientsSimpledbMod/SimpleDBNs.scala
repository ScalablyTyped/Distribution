package typings
package awsDashSdkLib.clientsSimpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/simpledb", "SimpleDB")
@js.native
object SimpleDBNs extends js.Object {
  trait Attribute extends js.Object {
    /**
      * 
      */
    var AlternateNameEncoding: js.UndefOr[String] = js.undefined
    /**
      * 
      */
    var AlternateValueEncoding: js.UndefOr[String] = js.undefined
    /**
      * The name of the attribute.
      */
    var Name: String
    /**
      * The value of the attribute.
      */
    var Value: String
  }
  
  trait BatchDeleteAttributesRequest extends js.Object {
    /**
      * The name of the domain in which the attributes are being deleted.
      */
    var DomainName: String
    /**
      * A list of items on which to perform the operation.
      */
    var Items: DeletableItemList
  }
  
  trait BatchPutAttributesRequest extends js.Object {
    /**
      * The name of the domain in which the attributes are being stored.
      */
    var DomainName: String
    /**
      * A list of items on which to perform the operation.
      */
    var Items: ReplaceableItemList
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateDomainRequest extends js.Object {
    /**
      * The name of the domain to create. The name can range between 3 and 255 characters and can contain the following characters: a-z, A-Z, 0-9, '_', '-', and '.'.
      */
    var DomainName: String
  }
  
  trait DeletableAttribute extends js.Object {
    /**
      * The name of the attribute.
      */
    var Name: String
    /**
      * The value of the attribute.
      */
    var Value: js.UndefOr[String] = js.undefined
  }
  
  trait DeletableItem extends js.Object {
    var Attributes: js.UndefOr[DeletableAttributeList] = js.undefined
    var Name: String
  }
  
  trait DeleteAttributesRequest extends js.Object {
    /**
      * A list of Attributes. Similar to columns on a spreadsheet, attributes represent categories of data that can be assigned to items.
      */
    var Attributes: js.UndefOr[DeletableAttributeList] = js.undefined
    /**
      * The name of the domain in which to perform the operation.
      */
    var DomainName: String
    /**
      * The update condition which, if specified, determines whether the specified attributes will be deleted or not. The update condition must be satisfied in order for this request to be processed and the attributes to be deleted.
      */
    var Expected: js.UndefOr[UpdateCondition] = js.undefined
    /**
      * The name of the item. Similar to rows on a spreadsheet, items represent individual objects that contain one or more value-attribute pairs.
      */
    var ItemName: String
  }
  
  trait DeleteDomainRequest extends js.Object {
    /**
      * The name of the domain to delete.
      */
    var DomainName: String
  }
  
  trait DomainMetadataRequest extends js.Object {
    /**
      * The name of the domain for which to display the metadata of.
      */
    var DomainName: String
  }
  
  trait DomainMetadataResult extends js.Object {
    /**
      * The number of unique attribute names in the domain.
      */
    var AttributeNameCount: js.UndefOr[Integer] = js.undefined
    /**
      * The total size of all unique attribute names in the domain, in bytes.
      */
    var AttributeNamesSizeBytes: js.UndefOr[Long] = js.undefined
    /**
      * The number of all attribute name/value pairs in the domain.
      */
    var AttributeValueCount: js.UndefOr[Integer] = js.undefined
    /**
      * The total size of all attribute values in the domain, in bytes.
      */
    var AttributeValuesSizeBytes: js.UndefOr[Long] = js.undefined
    /**
      * The number of all items in the domain.
      */
    var ItemCount: js.UndefOr[Integer] = js.undefined
    /**
      * The total size of all item names in the domain, in bytes.
      */
    var ItemNamesSizeBytes: js.UndefOr[Long] = js.undefined
    /**
      * The data and time when metadata was calculated, in Epoch (UNIX) seconds.
      */
    var Timestamp: js.UndefOr[Integer] = js.undefined
  }
  
  trait GetAttributesRequest extends js.Object {
    /**
      * The names of the attributes.
      */
    var AttributeNames: js.UndefOr[AttributeNameList] = js.undefined
    /**
      * Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If true, any data previously written to SimpleDB will be returned. Otherwise, results will be consistent eventually, and the client may not see data that was written immediately before your read.
      */
    var ConsistentRead: js.UndefOr[Boolean] = js.undefined
    /**
      * The name of the domain in which to perform the operation.
      */
    var DomainName: String
    /**
      * The name of the item.
      */
    var ItemName: String
  }
  
  trait GetAttributesResult extends js.Object {
    /**
      * The list of attributes returned by the operation.
      */
    var Attributes: js.UndefOr[AttributeList] = js.undefined
  }
  
  trait Item extends js.Object {
    /**
      * 
      */
    var AlternateNameEncoding: js.UndefOr[String] = js.undefined
    /**
      * A list of attributes.
      */
    var Attributes: AttributeList
    /**
      * The name of the item.
      */
    var Name: String
  }
  
  trait ListDomainsRequest extends js.Object {
    /**
      * The maximum number of domain names you want returned. The range is 1 to 100. The default setting is 100.
      */
    var MaxNumberOfDomains: js.UndefOr[Integer] = js.undefined
    /**
      * A string informing Amazon SimpleDB where to start the next list of domain names.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait ListDomainsResult extends js.Object {
    /**
      * A list of domain names that match the expression.
      */
    var DomainNames: js.UndefOr[DomainNameList] = js.undefined
    /**
      * An opaque token indicating that there are more domains than the specified MaxNumberOfDomains still available.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait PutAttributesRequest extends js.Object {
    /**
      * The list of attributes.
      */
    var Attributes: ReplaceableAttributeList
    /**
      * The name of the domain in which to perform the operation.
      */
    var DomainName: String
    /**
      * The update condition which, if specified, determines whether the specified attributes will be updated or not. The update condition must be satisfied in order for this request to be processed and the attributes to be updated.
      */
    var Expected: js.UndefOr[UpdateCondition] = js.undefined
    /**
      * The name of the item.
      */
    var ItemName: String
  }
  
  trait ReplaceableAttribute extends js.Object {
    /**
      * The name of the replaceable attribute.
      */
    var Name: String
    /**
      * A flag specifying whether or not to replace the attribute/value pair or to add a new attribute/value pair. The default setting is false.
      */
    var Replace: js.UndefOr[Boolean] = js.undefined
    /**
      * The value of the replaceable attribute.
      */
    var Value: String
  }
  
  trait ReplaceableItem extends js.Object {
    /**
      * The list of attributes for a replaceable item.
      */
    var Attributes: ReplaceableAttributeList
    /**
      * The name of the replaceable item.
      */
    var Name: String
  }
  
  trait SelectRequest extends js.Object {
    /**
      * Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If true, any data previously written to SimpleDB will be returned. Otherwise, results will be consistent eventually, and the client may not see data that was written immediately before your read.
      */
    var ConsistentRead: js.UndefOr[Boolean] = js.undefined
    /**
      * A string informing Amazon SimpleDB where to start the next list of ItemNames.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * The expression used to query the domain.
      */
    var SelectExpression: String
  }
  
  trait SelectResult extends js.Object {
    /**
      * A list of items that match the select expression.
      */
    var Items: js.UndefOr[ItemList] = js.undefined
    /**
      * An opaque token indicating that more items than MaxNumberOfItems were matched, the response size exceeded 1 megabyte, or the execution time exceeded 5 seconds.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      *  Performs multiple DeleteAttributes operations in a single call, which reduces round trips and latencies. This enables Amazon SimpleDB to optimize requests, which generally yields better throughput.    If you specify BatchDeleteAttributes without attributes or values, all the attributes for the item are deleted.   BatchDeleteAttributes is an idempotent operation; running it multiple times on the same item or attribute doesn't result in an error.   The BatchDeleteAttributes operation succeeds or fails in its entirety. There are no partial deletes. You can execute multiple BatchDeleteAttributes operations and other operations in parallel. However, large numbers of concurrent BatchDeleteAttributes calls can result in Service Unavailable (503) responses.   This operation is vulnerable to exceeding the maximum URL size when making a REST request using the HTTP GET method.   This operation does not support conditions using Expected.X.Name, Expected.X.Value, or Expected.X.Exists.    The following limitations are enforced for this operation:  1 MB request size 25 item limit per BatchDeleteAttributes operation  
      */
    def batchDeleteAttributes(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchDeleteAttributes(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Performs multiple DeleteAttributes operations in a single call, which reduces round trips and latencies. This enables Amazon SimpleDB to optimize requests, which generally yields better throughput.    If you specify BatchDeleteAttributes without attributes or values, all the attributes for the item are deleted.   BatchDeleteAttributes is an idempotent operation; running it multiple times on the same item or attribute doesn't result in an error.   The BatchDeleteAttributes operation succeeds or fails in its entirety. There are no partial deletes. You can execute multiple BatchDeleteAttributes operations and other operations in parallel. However, large numbers of concurrent BatchDeleteAttributes calls can result in Service Unavailable (503) responses.   This operation is vulnerable to exceeding the maximum URL size when making a REST request using the HTTP GET method.   This operation does not support conditions using Expected.X.Name, Expected.X.Value, or Expected.X.Exists.    The following limitations are enforced for this operation:  1 MB request size 25 item limit per BatchDeleteAttributes operation  
      */
    def batchDeleteAttributes(params: BatchDeleteAttributesRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchDeleteAttributes(
      params: BatchDeleteAttributesRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The BatchPutAttributes operation creates or replaces attributes within one or more items. By using this operation, the client can perform multiple PutAttribute operation with a single call. This helps yield savings in round trips and latencies, enabling Amazon SimpleDB to optimize requests and generally produce better throughput.   The client may specify the item name with the Item.X.ItemName parameter. The client may specify new attributes using a combination of the Item.X.Attribute.Y.Name and Item.X.Attribute.Y.Value parameters. The client may specify the first attribute for the first item using the parameters Item.0.Attribute.0.Name and Item.0.Attribute.0.Value, and for the second attribute for the first item by the parameters Item.0.Attribute.1.Name and Item.0.Attribute.1.Value, and so on.   Attributes are uniquely identified within an item by their name/value combination. For example, a single item can have the attributes { "first_name", "first_value" } and { "first_name", "second_value" }. However, it cannot have two attribute instances where both the Item.X.Attribute.Y.Name and Item.X.Attribute.Y.Value are the same.   Optionally, the requester can supply the Replace parameter for each individual value. Setting this value to true will cause the new attribute values to replace the existing attribute values. For example, if an item I has the attributes { 'a', '1' }, { 'b', '2'} and { 'b', '3' } and the requester does a BatchPutAttributes of {'I', 'b', '4' } with the Replace parameter set to true, the final attributes of the item will be { 'a', '1' } and { 'b', '4' }, replacing the previous values of the 'b' attribute with the new value.   You cannot specify an empty string as an item or as an attribute name. The BatchPutAttributes operation succeeds or fails in its entirety. There are no partial puts.   This operation is vulnerable to exceeding the maximum URL size when making a REST request using the HTTP GET method. This operation does not support conditions using Expected.X.Name, Expected.X.Value, or Expected.X.Exists.   You can execute multiple BatchPutAttributes operations and other operations in parallel. However, large numbers of concurrent BatchPutAttributes calls can result in Service Unavailable (503) responses.   The following limitations are enforced for this operation:  256 attribute name-value pairs per item 1 MB request size 1 billion attributes per domain 10 GB of total user data storage per domain 25 item limit per BatchPutAttributes operation  
      */
    def batchPutAttributes(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchPutAttributes(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The BatchPutAttributes operation creates or replaces attributes within one or more items. By using this operation, the client can perform multiple PutAttribute operation with a single call. This helps yield savings in round trips and latencies, enabling Amazon SimpleDB to optimize requests and generally produce better throughput.   The client may specify the item name with the Item.X.ItemName parameter. The client may specify new attributes using a combination of the Item.X.Attribute.Y.Name and Item.X.Attribute.Y.Value parameters. The client may specify the first attribute for the first item using the parameters Item.0.Attribute.0.Name and Item.0.Attribute.0.Value, and for the second attribute for the first item by the parameters Item.0.Attribute.1.Name and Item.0.Attribute.1.Value, and so on.   Attributes are uniquely identified within an item by their name/value combination. For example, a single item can have the attributes { "first_name", "first_value" } and { "first_name", "second_value" }. However, it cannot have two attribute instances where both the Item.X.Attribute.Y.Name and Item.X.Attribute.Y.Value are the same.   Optionally, the requester can supply the Replace parameter for each individual value. Setting this value to true will cause the new attribute values to replace the existing attribute values. For example, if an item I has the attributes { 'a', '1' }, { 'b', '2'} and { 'b', '3' } and the requester does a BatchPutAttributes of {'I', 'b', '4' } with the Replace parameter set to true, the final attributes of the item will be { 'a', '1' } and { 'b', '4' }, replacing the previous values of the 'b' attribute with the new value.   You cannot specify an empty string as an item or as an attribute name. The BatchPutAttributes operation succeeds or fails in its entirety. There are no partial puts.   This operation is vulnerable to exceeding the maximum URL size when making a REST request using the HTTP GET method. This operation does not support conditions using Expected.X.Name, Expected.X.Value, or Expected.X.Exists.   You can execute multiple BatchPutAttributes operations and other operations in parallel. However, large numbers of concurrent BatchPutAttributes calls can result in Service Unavailable (503) responses.   The following limitations are enforced for this operation:  256 attribute name-value pairs per item 1 MB request size 1 billion attributes per domain 10 GB of total user data storage per domain 25 item limit per BatchPutAttributes operation  
      */
    def batchPutAttributes(params: BatchPutAttributesRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchPutAttributes(
      params: BatchPutAttributesRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The CreateDomain operation creates a new domain. The domain name should be unique among the domains associated with the Access Key ID provided in the request. The CreateDomain operation may take 10 or more seconds to complete.   CreateDomain is an idempotent operation; running it multiple times using the same domain name will not result in an error response.   The client can create up to 100 domains per account.   If the client requires additional domains, go to  http://aws.amazon.com/contact-us/simpledb-limit-request/. 
      */
    def createDomain(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDomain(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The CreateDomain operation creates a new domain. The domain name should be unique among the domains associated with the Access Key ID provided in the request. The CreateDomain operation may take 10 or more seconds to complete.   CreateDomain is an idempotent operation; running it multiple times using the same domain name will not result in an error response.   The client can create up to 100 domains per account.   If the client requires additional domains, go to  http://aws.amazon.com/contact-us/simpledb-limit-request/. 
      */
    def createDomain(params: CreateDomainRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDomain(
      params: CreateDomainRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Deletes one or more attributes associated with an item. If all attributes of the item are deleted, the item is deleted.   If DeleteAttributes is called without being passed any attributes or values specified, all the attributes for the item are deleted.   DeleteAttributes is an idempotent operation; running it multiple times on the same item or attribute does not result in an error response.   Because Amazon SimpleDB makes multiple copies of item data and uses an eventual consistency update model, performing a GetAttributes or Select operation (read) immediately after a DeleteAttributes or PutAttributes operation (write) might not return updated item data. 
      */
    def deleteAttributes(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAttributes(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Deletes one or more attributes associated with an item. If all attributes of the item are deleted, the item is deleted.   If DeleteAttributes is called without being passed any attributes or values specified, all the attributes for the item are deleted.   DeleteAttributes is an idempotent operation; running it multiple times on the same item or attribute does not result in an error response.   Because Amazon SimpleDB makes multiple copies of item data and uses an eventual consistency update model, performing a GetAttributes or Select operation (read) immediately after a DeleteAttributes or PutAttributes operation (write) might not return updated item data. 
      */
    def deleteAttributes(params: DeleteAttributesRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAttributes(
      params: DeleteAttributesRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The DeleteDomain operation deletes a domain. Any items (and their attributes) in the domain are deleted as well. The DeleteDomain operation might take 10 or more seconds to complete.   Running DeleteDomain on a domain that does not exist or running the function multiple times using the same domain name will not result in an error response. 
      */
    def deleteDomain(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDomain(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The DeleteDomain operation deletes a domain. Any items (and their attributes) in the domain are deleted as well. The DeleteDomain operation might take 10 or more seconds to complete.   Running DeleteDomain on a domain that does not exist or running the function multiple times using the same domain name will not result in an error response. 
      */
    def deleteDomain(params: DeleteDomainRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDomain(
      params: DeleteDomainRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Returns information about the domain, including when the domain was created, the number of items and attributes in the domain, and the size of the attribute names and values. 
      */
    def domainMetadata(): awsDashSdkLib.libRequestMod.Request[DomainMetadataResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def domainMetadata(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DomainMetadataResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DomainMetadataResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Returns information about the domain, including when the domain was created, the number of items and attributes in the domain, and the size of the attribute names and values. 
      */
    def domainMetadata(params: DomainMetadataRequest): awsDashSdkLib.libRequestMod.Request[DomainMetadataResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def domainMetadata(
      params: DomainMetadataRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DomainMetadataResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DomainMetadataResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Returns all of the attributes associated with the specified item. Optionally, the attributes returned can be limited to one or more attributes by specifying an attribute name parameter.   If the item does not exist on the replica that was accessed for this operation, an empty set is returned. The system does not return an error as it cannot guarantee the item does not exist on other replicas.   If GetAttributes is called without being passed any attribute names, all the attributes for the item are returned. 
      */
    def getAttributes(): awsDashSdkLib.libRequestMod.Request[GetAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAttributesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Returns all of the attributes associated with the specified item. Optionally, the attributes returned can be limited to one or more attributes by specifying an attribute name parameter.   If the item does not exist on the replica that was accessed for this operation, an empty set is returned. The system does not return an error as it cannot guarantee the item does not exist on other replicas.   If GetAttributes is called without being passed any attribute names, all the attributes for the item are returned. 
      */
    def getAttributes(params: GetAttributesRequest): awsDashSdkLib.libRequestMod.Request[GetAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAttributes(
      params: GetAttributesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAttributesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAttributesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The ListDomains operation lists all domains associated with the Access Key ID. It returns domain names up to the limit set by MaxNumberOfDomains. A NextToken is returned if there are more than MaxNumberOfDomains domains. Calling ListDomains successive times with the NextToken provided by the operation returns up to MaxNumberOfDomains more domain names with each successive operation call. 
      */
    def listDomains(): awsDashSdkLib.libRequestMod.Request[ListDomainsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDomains(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDomainsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDomainsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The ListDomains operation lists all domains associated with the Access Key ID. It returns domain names up to the limit set by MaxNumberOfDomains. A NextToken is returned if there are more than MaxNumberOfDomains domains. Calling ListDomains successive times with the NextToken provided by the operation returns up to MaxNumberOfDomains more domain names with each successive operation call. 
      */
    def listDomains(params: ListDomainsRequest): awsDashSdkLib.libRequestMod.Request[ListDomainsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDomains(
      params: ListDomainsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDomainsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDomainsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The PutAttributes operation creates or replaces attributes in an item. The client may specify new attributes using a combination of the Attribute.X.Name and Attribute.X.Value parameters. The client specifies the first attribute by the parameters Attribute.0.Name and Attribute.0.Value, the second attribute by the parameters Attribute.1.Name and Attribute.1.Value, and so on.   Attributes are uniquely identified in an item by their name/value combination. For example, a single item can have the attributes { "first_name", "first_value" } and { "first_name", second_value" }. However, it cannot have two attribute instances where both the Attribute.X.Name and Attribute.X.Value are the same.   Optionally, the requestor can supply the Replace parameter for each individual attribute. Setting this value to true causes the new attribute value to replace the existing attribute value(s). For example, if an item has the attributes { 'a', '1' }, { 'b', '2'} and { 'b', '3' } and the requestor calls PutAttributes using the attributes { 'b', '4' } with the Replace parameter set to true, the final attributes of the item are changed to { 'a', '1' } and { 'b', '4' }, which replaces the previous values of the 'b' attribute with the new value.   Using PutAttributes to replace attribute values that do not exist will not result in an error response.   You cannot specify an empty string as an attribute name.   Because Amazon SimpleDB makes multiple copies of client data and uses an eventual consistency update model, an immediate GetAttributes or Select operation (read) immediately after a PutAttributes or DeleteAttributes operation (write) might not return the updated data.   The following limitations are enforced for this operation:  256 total attribute name-value pairs per item One billion attributes per domain 10 GB of total user data storage per domain  
      */
    def putAttributes(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putAttributes(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The PutAttributes operation creates or replaces attributes in an item. The client may specify new attributes using a combination of the Attribute.X.Name and Attribute.X.Value parameters. The client specifies the first attribute by the parameters Attribute.0.Name and Attribute.0.Value, the second attribute by the parameters Attribute.1.Name and Attribute.1.Value, and so on.   Attributes are uniquely identified in an item by their name/value combination. For example, a single item can have the attributes { "first_name", "first_value" } and { "first_name", second_value" }. However, it cannot have two attribute instances where both the Attribute.X.Name and Attribute.X.Value are the same.   Optionally, the requestor can supply the Replace parameter for each individual attribute. Setting this value to true causes the new attribute value to replace the existing attribute value(s). For example, if an item has the attributes { 'a', '1' }, { 'b', '2'} and { 'b', '3' } and the requestor calls PutAttributes using the attributes { 'b', '4' } with the Replace parameter set to true, the final attributes of the item are changed to { 'a', '1' } and { 'b', '4' }, which replaces the previous values of the 'b' attribute with the new value.   Using PutAttributes to replace attribute values that do not exist will not result in an error response.   You cannot specify an empty string as an attribute name.   Because Amazon SimpleDB makes multiple copies of client data and uses an eventual consistency update model, an immediate GetAttributes or Select operation (read) immediately after a PutAttributes or DeleteAttributes operation (write) might not return the updated data.   The following limitations are enforced for this operation:  256 total attribute name-value pairs per item One billion attributes per domain 10 GB of total user data storage per domain  
      */
    def putAttributes(params: PutAttributesRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putAttributes(
      params: PutAttributesRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The Select operation returns a set of attributes for ItemNames that match the select expression. Select is similar to the standard SQL SELECT statement.   The total size of the response cannot exceed 1 MB in total size. Amazon SimpleDB automatically adjusts the number of items returned per page to enforce this limit. For example, if the client asks to retrieve 2500 items, but each individual item is 10 kB in size, the system returns 100 items and an appropriate NextToken so the client can access the next page of results.   For information on how to construct select expressions, see Using Select to Create Amazon SimpleDB Queries in the Developer Guide. 
      */
    def select(): awsDashSdkLib.libRequestMod.Request[SelectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def select(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ SelectResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[SelectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  The Select operation returns a set of attributes for ItemNames that match the select expression. Select is similar to the standard SQL SELECT statement.   The total size of the response cannot exceed 1 MB in total size. Amazon SimpleDB automatically adjusts the number of items returned per page to enforce this limit. For example, if the client asks to retrieve 2500 items, but each individual item is 10 kB in size, the system returns 100 items and an appropriate NextToken so the client can access the next page of results.   For information on how to construct select expressions, see Using Select to Create Amazon SimpleDB Queries in the Developer Guide. 
      */
    def select(params: SelectRequest): awsDashSdkLib.libRequestMod.Request[SelectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def select(
      params: SelectRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ SelectResult, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[SelectResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateCondition extends js.Object {
    /**
      * A value specifying whether or not the specified attribute must exist with the specified value in order for the update condition to be satisfied. Specify true if the attribute must exist for the update condition to be satisfied. Specify false if the attribute should not exist in order for the update condition to be satisfied.
      */
    var Exists: js.UndefOr[Boolean] = js.undefined
    /**
      * The name of the attribute involved in the condition.
      */
    var Name: js.UndefOr[String] = js.undefined
    /**
      * The value of an attribute. This value can only be specified when the Exists parameter is equal to true.
      */
    var Value: js.UndefOr[String] = js.undefined
  }
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AttributeList = js.Array[Attribute]
  type AttributeNameList = js.Array[String]
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DeletableAttributeList = js.Array[DeletableAttribute]
  type DeletableItemList = js.Array[DeletableItem]
  type DomainNameList = js.Array[String]
  type Integer = scala.Double
  type ItemList = js.Array[Item]
  type Long = scala.Double
  type ReplaceableAttributeList = js.Array[ReplaceableAttribute]
  type ReplaceableItemList = js.Array[ReplaceableItem]
  type String = java.lang.String
  type apiVersion = _apiVersion | java.lang.String
}

