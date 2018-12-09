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

