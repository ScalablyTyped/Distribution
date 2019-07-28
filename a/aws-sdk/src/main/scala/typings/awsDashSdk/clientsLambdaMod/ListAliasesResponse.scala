package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAliasesResponse extends js.Object {
  /**
    * A list of aliases.
    */
  var Aliases: js.UndefOr[AliasList] = js.undefined
  /**
    * The pagination token that's included if more results are available.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
}

object ListAliasesResponse {
  @scala.inline
  def apply(Aliases: AliasList = null, NextMarker: String = null): ListAliasesResponse = {
    val __obj = js.Dynamic.literal()
    if (Aliases != null) __obj.updateDynamic("Aliases")(Aliases)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[ListAliasesResponse]
  }
}

