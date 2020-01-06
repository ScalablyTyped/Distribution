package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDirectoriesResponse extends js.Object {
  /**
    * Lists all directories that are associated with your account in pagination fashion.
    */
  var Directories: DirectoryList = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.native
}

object ListDirectoriesResponse {
  @scala.inline
  def apply(Directories: DirectoryList, NextToken: NextToken = null): ListDirectoriesResponse = {
    val __obj = js.Dynamic.literal(Directories = Directories.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDirectoriesResponse]
  }
}

