package typings.awsDashSdk.clientsCloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEnvironmentMembershipsRequest extends js.Object {
  /**
    * The ID of the environment to get environment member information about.
    */
  var environmentId: js.UndefOr[EnvironmentId] = js.undefined
  /**
    * The maximum number of environment members to get information about.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * During a previous call, if there are more than 25 items in the list, only the first 25 items are returned, along with a unique string called a next token. To get the next batch of items in the list, call this operation again, adding the next token to the call. To get all of the items in the list, keep calling this operation with each subsequent next token that is returned, until no more next tokens are returned.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * The type of environment member permissions to get information about. Available values include:    owner: Owns the environment.    read-only: Has read-only access to the environment.    read-write: Has read-write access to the environment.   If no value is specified, information about all environment members are returned.
    */
  var permissions: js.UndefOr[PermissionsList] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of an individual environment member to get information about. If no value is specified, information about all environment members are returned.
    */
  var userArn: js.UndefOr[UserArn] = js.undefined
}

object DescribeEnvironmentMembershipsRequest {
  @scala.inline
  def apply(
    environmentId: EnvironmentId = null,
    maxResults: Int | Double = null,
    nextToken: String = null,
    permissions: PermissionsList = null,
    userArn: UserArn = null
  ): DescribeEnvironmentMembershipsRequest = {
    val __obj = js.Dynamic.literal()
    if (environmentId != null) __obj.updateDynamic("environmentId")(environmentId)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    if (userArn != null) __obj.updateDynamic("userArn")(userArn)
    __obj.asInstanceOf[DescribeEnvironmentMembershipsRequest]
  }
}

