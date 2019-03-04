package typings
package adoneLib.adoneNs.shaniNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetMatcher extends Matcher {
  /**
    * Requires a Set to contain each one of the items the given set has.
    */
  def contains(expected: nodeLib.Set[_]): Matcher
  /**
    *  Requires a Set to be deep equal another one.
    */
  def deepEquals(expected: nodeLib.Set[_]): Matcher
}

object SetMatcher {
  @scala.inline
  def apply(
    and: js.Function1[Matcher, Matcher],
    contains: js.Function1[nodeLib.Set[_], Matcher],
    deepEquals: js.Function1[nodeLib.Set[_], Matcher],
    or: js.Function1[Matcher, Matcher]
  ): SetMatcher = {
    val __obj = js.Dynamic.literal(and = and, contains = contains, deepEquals = deepEquals, or = or)
  
    __obj.asInstanceOf[SetMatcher]
  }
}

