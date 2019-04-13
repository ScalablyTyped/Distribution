package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDirectoryConfigsResult extends js.Object {
  /**
    * Information about the directory configurations. Note that although the response syntax in this topic includes the account password, this password is not returned in the actual response. 
    */
  var DirectoryConfigs: js.UndefOr[DirectoryConfigList] = js.undefined
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeDirectoryConfigsResult {
  @scala.inline
  def apply(DirectoryConfigs: DirectoryConfigList = null, NextToken: String = null): DescribeDirectoryConfigsResult = {
    val __obj = js.Dynamic.literal()
    if (DirectoryConfigs != null) __obj.updateDynamic("DirectoryConfigs")(DirectoryConfigs)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeDirectoryConfigsResult]
  }
}

