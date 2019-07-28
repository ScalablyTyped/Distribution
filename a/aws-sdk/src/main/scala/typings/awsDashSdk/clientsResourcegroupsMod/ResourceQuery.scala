package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceQuery extends js.Object {
  /**
    * The query that defines a group or a search.
    */
  var Query: typings.awsDashSdk.clientsResourcegroupsMod.Query
  /**
    * The type of the query. The valid values in this release are TAG_FILTERS_1_0 and CLOUDFORMATION_STACK_1_0.   TAG_FILTERS_1_0:  A JSON syntax that lets you specify a collection of simple tag filters for resource types and tags, as supported by the AWS Tagging API GetResources operation. If you specify more than one tag key, only resources that match all tag keys, and at least one value of each specified tag key, are returned in your query. If you specify more than one value for a tag key, a resource matches the filter if it has a tag key value that matches any of the specified values. For example, consider the following sample query for resources that have two tags, Stage and Version, with two values each. ([{"Key":"Stage","Values":["Test","Deploy"]},{"Key":"Version","Values":["1","2"]}]) The results of this query might include the following.   An EC2 instance that has the following two tags: {"Key":"Stage","Value":"Deploy"}, and {"Key":"Version","Value":"2"}    An S3 bucket that has the following two tags: {"Key":"Stage","Value":"Test"}, and {"Key":"Version","Value":"1"}   The query would not return the following results, however. The following EC2 instance does not have all tag keys specified in the filter, so it is rejected. The RDS database has all of the tag keys, but no values that match at least one of the specified tag key values in the filter.   An EC2 instance that has only the following tag: {"Key":"Stage","Value":"Deploy"}.   An RDS database that has the following two tags: {"Key":"Stage","Value":"Archived"}, and {"Key":"Version","Value":"4"}      CLOUDFORMATION_STACK_1_0:  A JSON syntax that lets you specify a CloudFormation stack ARN.
    */
  var Type: QueryType
}

object ResourceQuery {
  @scala.inline
  def apply(Query: Query, Type: QueryType): ResourceQuery = {
    val __obj = js.Dynamic.literal(Query = Query, Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceQuery]
  }
}

