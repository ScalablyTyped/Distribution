package typings.adone.adoneNs.shaniNs.utilNs.INs

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
  def apply(and: Matcher => Matcher, or: Matcher => Matcher): Matcher = {
    val __obj = js.Dynamic.literal(and = js.Any.fromFunction1(and), or = js.Any.fromFunction1(or))
  
    __obj.asInstanceOf[Matcher]
  }
}

