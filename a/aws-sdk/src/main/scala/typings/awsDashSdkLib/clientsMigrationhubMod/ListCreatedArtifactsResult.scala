package typings
package awsDashSdkLib.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCreatedArtifactsResult extends js.Object {
  /**
    * List of created artifacts up to the maximum number of results specified in the request.
    */
  var CreatedArtifactList: js.UndefOr[CreatedArtifactList] = js.undefined
  /**
    * If there are more created artifacts than the max result, return the next token to be passed to the next call as a bookmark of where to start from.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}

object ListCreatedArtifactsResult {
  @scala.inline
  def apply(CreatedArtifactList: CreatedArtifactList = null, NextToken: Token = null): ListCreatedArtifactsResult = {
    val __obj = js.Dynamic.literal()
    if (CreatedArtifactList != null) __obj.updateDynamic("CreatedArtifactList")(CreatedArtifactList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListCreatedArtifactsResult]
  }
}

