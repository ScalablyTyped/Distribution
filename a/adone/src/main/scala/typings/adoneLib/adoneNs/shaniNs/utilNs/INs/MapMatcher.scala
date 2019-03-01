package typings
package adoneLib.adoneNs.shaniNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapMatcher extends Matcher {
  /**
    * Requires a Map to contain each one of the items the given map has.
    */
  def contains(expected: lodashLib.lodashMod.Global.Map[_, _]): Matcher
  /**
    * Requires a Map to be deep equal another one.
    */
  def deepEquals(expected: lodashLib.lodashMod.Global.Map[_, _]): Matcher
}

object MapMatcher {
  @scala.inline
  def apply(
    and: js.Function1[Matcher, Matcher],
    contains: js.Function1[lodashLib.lodashMod.Global.Map[_, _], Matcher],
    deepEquals: js.Function1[lodashLib.lodashMod.Global.Map[_, _], Matcher],
    or: js.Function1[Matcher, Matcher]
  ): MapMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("and")(and)
    __obj.updateDynamic("contains")(contains)
    __obj.updateDynamic("deepEquals")(deepEquals)
    __obj.updateDynamic("or")(or)
    __obj.asInstanceOf[MapMatcher]
  }
}

