package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListApplicationRevisionsInput extends js.Object {
  /**
    *  The name of an AWS CodeDeploy application associated with the IAM user or AWS account. 
    */
  var applicationName: ApplicationName
  /**
    *  Whether to list revisions based on whether the revision is the target revision of an deployment group:    include: List revisions that are target revisions of a deployment group.   exclude: Do not list revisions that are target revisions of a deployment group.   ignore: List all revisions.  
    */
  var deployed: js.UndefOr[ListStateFilterAction] = js.undefined
  /**
    * An identifier returned from the previous ListApplicationRevisions call. It can be used to return the next set of applications in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    *  An Amazon S3 bucket name to limit the search for revisions.   If set to null, all of the user's buckets are searched. 
    */
  var s3Bucket: js.UndefOr[S3Bucket] = js.undefined
  /**
    *  A key prefix for the set of Amazon S3 objects to limit the search for revisions. 
    */
  var s3KeyPrefix: js.UndefOr[S3Key] = js.undefined
  /**
    * The column name to use to sort the list results:   registerTime: Sort by the time the revisions were registered with AWS CodeDeploy.   firstUsedTime: Sort by the time the revisions were first used in a deployment.   lastUsedTime: Sort by the time the revisions were last used in a deployment.    If not specified or set to null, the results are returned in an arbitrary order. 
    */
  var sortBy: js.UndefOr[ApplicationRevisionSortBy] = js.undefined
  /**
    *  The order in which to sort the list results:    ascending: ascending order.   descending: descending order.   If not specified, the results are sorted in ascending order. If set to null, the results are sorted in an arbitrary order.
    */
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
}

object ListApplicationRevisionsInput {
  @scala.inline
  def apply(
    applicationName: ApplicationName,
    deployed: ListStateFilterAction = null,
    nextToken: NextToken = null,
    s3Bucket: S3Bucket = null,
    s3KeyPrefix: S3Key = null,
    sortBy: ApplicationRevisionSortBy = null,
    sortOrder: SortOrder = null
  ): ListApplicationRevisionsInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName)
    if (deployed != null) __obj.updateDynamic("deployed")(deployed.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (s3Bucket != null) __obj.updateDynamic("s3Bucket")(s3Bucket)
    if (s3KeyPrefix != null) __obj.updateDynamic("s3KeyPrefix")(s3KeyPrefix)
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationRevisionsInput]
  }
}

