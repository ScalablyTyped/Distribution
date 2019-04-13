package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetKeyPairsResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the key pairs.
    */
  var keyPairs: js.UndefOr[KeyPairList] = js.undefined
  /**
    * A token used for advancing to the next page of results from your get key pairs request.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object GetKeyPairsResult {
  @scala.inline
  def apply(keyPairs: KeyPairList = null, nextPageToken: java.lang.String = null): GetKeyPairsResult = {
    val __obj = js.Dynamic.literal()
    if (keyPairs != null) __obj.updateDynamic("keyPairs")(keyPairs)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[GetKeyPairsResult]
  }
}

