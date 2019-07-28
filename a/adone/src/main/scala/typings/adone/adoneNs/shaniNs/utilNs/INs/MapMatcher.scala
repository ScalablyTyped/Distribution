package typings.adone.adoneNs.shaniNs.utilNs.INs

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapMatcher extends Matcher {
  /**
    * Requires a Map to contain each one of the items the given map has.
    */
  def contains(expected: Map[_, _]): Matcher
  /**
    * Requires a Map to be deep equal another one.
    */
  def deepEquals(expected: Map[_, _]): Matcher
}

object MapMatcher {
  @scala.inline
  def apply(
    and: Matcher => Matcher,
    contains: Map[_, _] => Matcher,
    deepEquals: Map[_, _] => Matcher,
    or: Matcher => Matcher
  ): MapMatcher = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), contains = js.Any.fromFunction1(contains), deepEquals = js.Any.fromFunction1(deepEquals), or = js.Any.fromFunction1(or))
  
    __obj.asInstanceOf[MapMatcher]
  }
}

