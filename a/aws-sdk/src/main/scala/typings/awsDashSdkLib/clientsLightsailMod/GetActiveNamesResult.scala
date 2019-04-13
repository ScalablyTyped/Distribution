package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetActiveNamesResult extends js.Object {
  /**
    * The list of active names returned by the get active names request.
    */
  var activeNames: js.UndefOr[StringList] = js.undefined
  /**
    * A token used for advancing to the next page of results from your get active names request.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object GetActiveNamesResult {
  @scala.inline
  def apply(activeNames: StringList = null, nextPageToken: java.lang.String = null): GetActiveNamesResult = {
    val __obj = js.Dynamic.literal()
    if (activeNames != null) __obj.updateDynamic("activeNames")(activeNames)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[GetActiveNamesResult]
  }
}

