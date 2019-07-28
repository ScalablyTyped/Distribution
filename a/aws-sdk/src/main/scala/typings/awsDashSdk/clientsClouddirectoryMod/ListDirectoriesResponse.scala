package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDirectoriesResponse extends js.Object {
  /**
    * Lists all directories that are associated with your account in pagination fashion.
    */
  var Directories: DirectoryList
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
}

object ListDirectoriesResponse {
  @scala.inline
  def apply(Directories: DirectoryList, NextToken: NextToken = null): ListDirectoriesResponse = {
    val __obj = js.Dynamic.literal(Directories = Directories)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDirectoriesResponse]
  }
}

