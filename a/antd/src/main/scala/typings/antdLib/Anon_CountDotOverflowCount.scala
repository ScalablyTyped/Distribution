package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CountDotOverflowCount extends js.Object {
  var count: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike]
  var dot: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
  var overflowCount: propDashTypesLib.propDashTypesMod.Requireable[scala.Double]
  var showZero: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
}

object Anon_CountDotOverflowCount {
  @scala.inline
  def apply(
    count: propDashTypesLib.propDashTypesMod.Requireable[propDashTypesLib.propDashTypesMod.ReactNodeLike],
    dot: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean],
    overflowCount: propDashTypesLib.propDashTypesMod.Requireable[scala.Double],
    showZero: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
  ): Anon_CountDotOverflowCount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("dot")(dot)
    __obj.updateDynamic("overflowCount")(overflowCount)
    __obj.updateDynamic("showZero")(showZero)
    __obj.asInstanceOf[Anon_CountDotOverflowCount]
  }
}

