package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListObjectParentsResponse extends js.Object {
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  /**
    * Returns a list of parent reference and LinkName Tuples.
    */
  var ParentLinks: js.UndefOr[ObjectIdentifierAndLinkNameList] = js.undefined
  /**
    * The parent structure, which is a map with key as the ObjectIdentifier and LinkName as the value.
    */
  var Parents: js.UndefOr[ObjectIdentifierToLinkNameMap] = js.undefined
}

object ListObjectParentsResponse {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    ParentLinks: ObjectIdentifierAndLinkNameList = null,
    Parents: ObjectIdentifierToLinkNameMap = null
  ): ListObjectParentsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ParentLinks != null) __obj.updateDynamic("ParentLinks")(ParentLinks)
    if (Parents != null) __obj.updateDynamic("Parents")(Parents)
    __obj.asInstanceOf[ListObjectParentsResponse]
  }
}

