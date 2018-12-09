package typings
package adoneLib.adoneNs.shaniNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Matcher extends js.Object {
  /**
                       * Logical and
                       */
  def and(expr: Matcher): Matcher
  /**
                       * Logical or
                       */
  def or(expr: Matcher): Matcher
}

