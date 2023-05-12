package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceQuery extends StObject {
  
  /**
    * The query that defines a group or a search. The contents depends on the value of the Type element.    ResourceTypeFilters – Applies to all ResourceQuery objects of either Type. This element contains one of the following two items:   The value AWS::AllSupported. This causes the ResourceQuery to match resources of any resource type that also match the query.   A list (a JSON array) of resource type identifiers that limit the query to only resources of the specified types. For the complete list of resource types that you can use in the array value for ResourceTypeFilters, see Resources you can use with Resource Groups and Tag Editor in the Resource Groups User Guide.   Example: "ResourceTypeFilters": ["AWS::AllSupported"] or "ResourceTypeFilters": ["AWS::EC2::Instance", "AWS::S3::Bucket"]     TagFilters – applicable only if Type = TAG_FILTERS_1_0. The Query contains a JSON string that represents a collection of simple tag filters. The JSON string uses a syntax similar to the  GetResources  operation, but uses only the   ResourceTypeFilters  and  TagFilters  fields. If you specify more than one tag key, only resources that match all tag keys, and at least one value of each specified tag key, are returned in your query. If you specify more than one value for a tag key, a resource matches the filter if it has a tag key value that matches any of the specified values. For example, consider the following sample query for resources that have two tags, Stage and Version, with two values each:  [{"Stage":["Test","Deploy"]},{"Version":["1","2"]}]  The results of this resource query could include the following.   An Amazon EC2 instance that has the following two tags: {"Stage":"Deploy"}, and {"Version":"2"}    An S3 bucket that has the following two tags: {"Stage":"Test"}, and {"Version":"1"}    The resource query results would not include the following items in the results, however.    An Amazon EC2 instance that has only the following tag: {"Stage":"Deploy"}. The instance does not have all of the tag keys specified in the filter, so it is excluded from the results.   An RDS database that has the following two tags: {"Stage":"Archived"} and {"Version":"4"}  The database has all of the tag keys, but none of those keys has an associated value that matches at least one of the specified values in the filter.   Example: "TagFilters": [ { "Key": "Stage", "Values": [ "Gamma", "Beta" ] }     StackIdentifier – applicable only if Type = CLOUDFORMATION_STACK_1_0. The value of this parameter is the Amazon Resource Name (ARN) of the CloudFormation stack whose resources you want included in the group.  
    */
  var Query: typings.awsSdk.clientsResourcegroupsMod.Query
  
  /**
    * The type of the query to perform. This can have one of two values:     CLOUDFORMATION_STACK_1_0:  Specifies that you want the group to contain the members of an CloudFormation stack. The Query contains a StackIdentifier element with an ARN for a CloudFormation stack.     TAG_FILTERS_1_0:  Specifies that you want the group to include resource that have tags that match the query.   
    */
  var Type: QueryType
}
object ResourceQuery {
  
  inline def apply(Query: Query, Type: QueryType): ResourceQuery = {
    val __obj = js.Dynamic.literal(Query = Query.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceQuery] (val x: Self) extends AnyVal {
    
    inline def setQuery(value: Query): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
    
    inline def setType(value: QueryType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
