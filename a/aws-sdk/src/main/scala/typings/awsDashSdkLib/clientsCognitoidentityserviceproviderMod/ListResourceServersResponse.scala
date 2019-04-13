package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResourceServersResponse extends js.Object {
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKeyType] = js.undefined
  /**
    * The resource servers.
    */
  var ResourceServers: ResourceServersListType
}

object ListResourceServersResponse {
  @scala.inline
  def apply(ResourceServers: ResourceServersListType, NextToken: PaginationKeyType = null): ListResourceServersResponse = {
    val __obj = js.Dynamic.literal(ResourceServers = ResourceServers)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListResourceServersResponse]
  }
}

