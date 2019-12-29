package typings.atAntvG2.atAntvG2Mod

import typings.atAntvG2.atAntvG2Strings.cat
import typings.atAntvG2.atAntvG2Strings.identity
import typings.atAntvG2.atAntvG2Strings.linear
import typings.atAntvG2.atAntvG2Strings.log
import typings.atAntvG2.atAntvG2Strings.pow
import typings.atAntvG2.atAntvG2Strings.time
import typings.atAntvG2.atAntvG2Strings.timeCat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * config interface
  */
@JSImport("@antv/g2", "Scale")
@js.native
class Scale[T] () extends js.Object {
  var alias: js.UndefOr[String | Double] = js.native
  var formatter: js.UndefOr[js.Function1[/* value */ T, String]] = js.native
  var getText: js.UndefOr[js.Function1[/* value */ js.Any, String]] = js.native
  var getTicks: js.UndefOr[js.Function0[js.Array[_]]] = js.native
  var invert: js.UndefOr[js.Function1[/* n */ Double, T]] = js.native
  var range: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var scale: js.UndefOr[js.Function1[/* value */ T, Double]] = js.native
  var tickCount: js.UndefOr[Double] = js.native
  var ticks: js.UndefOr[js.Array[_]] = js.native
  var `type`: js.UndefOr[identity | linear | cat | time | timeCat | log | pow] = js.native
}

