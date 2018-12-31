package typings
package asynciteratorLib.asynciteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleTransformIteratorOptions[S, T] extends TransformIteratorOptions[S] {
  var append: js.UndefOr[js.Array[T]] = js.undefined
  var filter: js.UndefOr[js.Function1[/* item */ S, scala.Boolean]] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var map: js.UndefOr[js.Function1[/* item */ S, T]] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var prepend: js.UndefOr[js.Array[T]] = js.undefined
  var transform: js.UndefOr[
    js.Function2[/* item */ S, /* callback */ js.Function1[/* result */ T, scala.Unit], scala.Unit]
  ] = js.undefined
}

