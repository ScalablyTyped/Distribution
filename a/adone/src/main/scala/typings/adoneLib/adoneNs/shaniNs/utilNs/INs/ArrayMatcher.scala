package typings
package adoneLib.adoneNs.shaniNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayMatcher extends Matcher {
  /**
    * Requires an Array to contain each one of the values the given array has.
    */
  def contains(expected: js.Array[_]): Matcher
  /**
    * Requires an Array to be deep equal another one.
    */
  def deepEquals(expected: js.Array[_]): Matcher
  /**
    * Requires an Array to end with the same values as another one.
    */
  def endsWith(expected: js.Array[_]): Matcher
  /**
    * Requires an Array to start with the same values as another one.
    */
  def startsWith(expected: js.Array[_]): Matcher
}

object ArrayMatcher {
  @scala.inline
  def apply(
    and: js.Function1[Matcher, Matcher],
    contains: js.Function1[js.Array[_], Matcher],
    deepEquals: js.Function1[js.Array[_], Matcher],
    endsWith: js.Function1[js.Array[_], Matcher],
    or: js.Function1[Matcher, Matcher],
    startsWith: js.Function1[js.Array[_], Matcher]
  ): ArrayMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("and")(and)
    __obj.updateDynamic("contains")(contains)
    __obj.updateDynamic("deepEquals")(deepEquals)
    __obj.updateDynamic("endsWith")(endsWith)
    __obj.updateDynamic("or")(or)
    __obj.updateDynamic("startsWith")(startsWith)
    __obj.asInstanceOf[ArrayMatcher]
  }
}

