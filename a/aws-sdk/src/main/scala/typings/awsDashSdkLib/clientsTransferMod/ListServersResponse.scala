package typings
package awsDashSdkLib.clientsTransferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListServersResponse extends js.Object {
  /**
    * When you can get additional results from the ListServers operation, a NextToken parameter is returned in the output. In a following command, you can pass in the NextToken parameter to continue listing additional servers.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * An array of servers that were listed.
    */
  var Servers: ListedServers
}

object ListServersResponse {
  @scala.inline
  def apply(Servers: ListedServers, NextToken: NextToken = null): ListServersResponse = {
    val __obj = js.Dynamic.literal(Servers = Servers)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListServersResponse]
  }
}

