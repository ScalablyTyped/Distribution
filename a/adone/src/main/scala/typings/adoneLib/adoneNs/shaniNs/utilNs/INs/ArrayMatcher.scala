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
    and: Matcher => Matcher,
    contains: js.Array[_] => Matcher,
    deepEquals: js.Array[_] => Matcher,
    endsWith: js.Array[_] => Matcher,
    or: Matcher => Matcher,
    startsWith: js.Array[_] => Matcher
  ): ArrayMatcher = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), contains = js.Any.fromFunction1(contains), deepEquals = js.Any.fromFunction1(deepEquals), endsWith = js.Any.fromFunction1(endsWith), or = js.Any.fromFunction1(or), startsWith = js.Any.fromFunction1(startsWith))
  
    __obj.asInstanceOf[ArrayMatcher]
  }
}

