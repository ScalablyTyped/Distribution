package typings.adone.adoneNs.shaniNs.utilNs.INs

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetMatcher extends Matcher {
  /**
    * Requires a Set to contain each one of the items the given set has.
    */
  def contains(expected: Set[_]): Matcher
  /**
    *  Requires a Set to be deep equal another one.
    */
  def deepEquals(expected: Set[_]): Matcher
}

object SetMatcher {
  @scala.inline
  def apply(
    and: Matcher => Matcher,
    contains: Set[_] => Matcher,
    deepEquals: Set[_] => Matcher,
    or: Matcher => Matcher
  ): SetMatcher = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), contains = js.Any.fromFunction1(contains), deepEquals = js.Any.fromFunction1(deepEquals), or = js.Any.fromFunction1(or))
  
    __obj.asInstanceOf[SetMatcher]
  }
}

