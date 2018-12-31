package typings
package atomLib.linterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackSolution extends js.Object {
  var position: atomLib.atomMod.Range
  var priority: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  // tslint:disable-next-line:no-any
  @JSName("apply")
  def apply(): js.Any
}

