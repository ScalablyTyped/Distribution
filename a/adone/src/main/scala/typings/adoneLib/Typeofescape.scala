package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofescape extends js.Object {
  def control(str: java.lang.String): java.lang.String
  def format(str: java.lang.String): java.lang.String
  def htmlSpecialChars(str: java.lang.String): java.lang.String
  def regExpPattern(str: java.lang.String): java.lang.String
  def regExpReplacement(str: java.lang.String): java.lang.String
  def shellArg(str: java.lang.String): java.lang.String
}

object Typeofescape {
  @scala.inline
  def apply(
    control: java.lang.String => java.lang.String,
    format: java.lang.String => java.lang.String,
    htmlSpecialChars: java.lang.String => java.lang.String,
    regExpPattern: java.lang.String => java.lang.String,
    regExpReplacement: java.lang.String => java.lang.String,
    shellArg: java.lang.String => java.lang.String
  ): Typeofescape = {
    val __obj = js.Dynamic.literal(control = js.Any.fromFunction1(control), format = js.Any.fromFunction1(format), htmlSpecialChars = js.Any.fromFunction1(htmlSpecialChars), regExpPattern = js.Any.fromFunction1(regExpPattern), regExpReplacement = js.Any.fromFunction1(regExpReplacement), shellArg = js.Any.fromFunction1(shellArg))
  
    __obj.asInstanceOf[Typeofescape]
  }
}

