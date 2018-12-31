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

