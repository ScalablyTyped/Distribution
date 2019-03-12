package typings
package adoneLib.adoneNs.shaniNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetMatcher extends Matcher {
  /**
    * Requires a Set to contain each one of the items the given set has.
    */
  def contains(expected: stdLib.Set[_]): Matcher
  /**
    *  Requires a Set to be deep equal another one.
    */
  def deepEquals(expected: stdLib.Set[_]): Matcher
}

object SetMatcher {
  @scala.inline
  def apply(
    and: Matcher => Matcher,
    contains: stdLib.Set[_] => Matcher,
    deepEquals: stdLib.Set[_] => Matcher,
    or: Matcher => Matcher
  ): SetMatcher = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), contains = js.Any.fromFunction1(contains), deepEquals = js.Any.fromFunction1(deepEquals), or = js.Any.fromFunction1(or))
  
    __obj.asInstanceOf[SetMatcher]
  }
}

