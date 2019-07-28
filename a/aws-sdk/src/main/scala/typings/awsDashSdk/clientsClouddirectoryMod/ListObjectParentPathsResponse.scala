package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListObjectParentPathsResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  /**
    * Returns the path to the ObjectIdentifiers that are associated with the directory.
    */
  var PathToObjectIdentifiersList: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.PathToObjectIdentifiersList] = js.undefined
}

object ListObjectParentPathsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, PathToObjectIdentifiersList: PathToObjectIdentifiersList = null): ListObjectParentPathsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PathToObjectIdentifiersList != null) __obj.updateDynamic("PathToObjectIdentifiersList")(PathToObjectIdentifiersList)
    __obj.asInstanceOf[ListObjectParentPathsResponse]
  }
}

