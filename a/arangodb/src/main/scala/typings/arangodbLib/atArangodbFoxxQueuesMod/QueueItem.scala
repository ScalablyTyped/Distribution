package typings
package arangodbLib.atArangodbFoxxQueuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueItem extends js.Object {
  var backOff: js.UndefOr[(js.Function1[/* failureCount */ scala.Double, scala.Double]) | scala.Double] = js.undefined
  var maxFailures: js.UndefOr[scala.Double] = js.undefined
  var mount: java.lang.String
  var name: java.lang.String
  var preprocess: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  var schema: js.UndefOr[arangodbLib.FoxxNs.Schema] = js.undefined
}

object QueueItem {
  @scala.inline
  def apply(
    mount: java.lang.String,
    name: java.lang.String,
    backOff: (js.Function1[/* failureCount */ scala.Double, scala.Double]) | scala.Double = null,
    maxFailures: scala.Int | scala.Double = null,
    preprocess: js.Function1[/* data */ js.Any, _] = null,
    schema: arangodbLib.FoxxNs.Schema = null
  ): QueueItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mount")(mount)
    __obj.updateDynamic("name")(name)
    if (backOff != null) __obj.updateDynamic("backOff")(backOff.asInstanceOf[js.Any])
    if (maxFailures != null) __obj.updateDynamic("maxFailures")(maxFailures.asInstanceOf[js.Any])
    if (preprocess != null) __obj.updateDynamic("preprocess")(preprocess)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[QueueItem]
  }
}

