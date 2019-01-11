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

