package typings
package awsDashSdkLib.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAliasesResponse extends js.Object {
  /**
    * A list of aliases.
    */
  var Aliases: js.UndefOr[AliasList] = js.undefined
  /**
    * When Truncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent request.
    */
  var NextMarker: js.UndefOr[MarkerType] = js.undefined
  /**
    * A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the NextMarker element in thisresponse to the Marker parameter in a subsequent request.
    */
  var Truncated: js.UndefOr[BooleanType] = js.undefined
}

object ListAliasesResponse {
  @scala.inline
  def apply(
    Aliases: AliasList = null,
    NextMarker: MarkerType = null,
    Truncated: js.UndefOr[BooleanType] = js.undefined
  ): ListAliasesResponse = {
    val __obj = js.Dynamic.literal()
    if (Aliases != null) __obj.updateDynamic("Aliases")(Aliases)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    if (!js.isUndefined(Truncated)) __obj.updateDynamic("Truncated")(Truncated)
    __obj.asInstanceOf[ListAliasesResponse]
  }
}

