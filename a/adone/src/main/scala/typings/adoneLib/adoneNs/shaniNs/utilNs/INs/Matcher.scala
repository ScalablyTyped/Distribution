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

object Matcher {
  @scala.inline
  def apply(and: js.Function1[Matcher, Matcher], or: js.Function1[Matcher, Matcher]): Matcher = {
    val __obj = js.Dynamic.literal(and = and, or = or)
  
    __obj.asInstanceOf[Matcher]
  }
}

