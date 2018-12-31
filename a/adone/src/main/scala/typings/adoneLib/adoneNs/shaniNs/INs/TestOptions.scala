package typings
package adoneLib.adoneNs.shaniNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOptions extends js.Object {
  /**
    * Add after hook for this test
    */
  var after: js.UndefOr[HookCallback | (js.Tuple2[java.lang.String, HookCallback])] = js.undefined
  /**
    * Add before hook for this test
    */
  var before: js.UndefOr[HookCallback | (js.Tuple2[java.lang.String, HookCallback])] = js.undefined
  /**
    * Specify that this test must be skipped
    */
  var skip: js.UndefOr[scala.Boolean | js.Function0[scala.Unit]] = js.undefined
  /**
    * Specify timeout for this test
    */
  var timeout: js.UndefOr[scala.Double | js.Function0[scala.Unit]] = js.undefined
}

