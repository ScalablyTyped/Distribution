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

