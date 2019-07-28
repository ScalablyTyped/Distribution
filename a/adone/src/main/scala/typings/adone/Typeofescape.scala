package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofescape extends js.Object {
  def control(str: String): String
  def format(str: String): String
  def htmlSpecialChars(str: String): String
  def regExpPattern(str: String): String
  def regExpReplacement(str: String): String
  def shellArg(str: String): String
}

object Typeofescape {
  @scala.inline
  def apply(
    control: String => String,
    format: String => String,
    htmlSpecialChars: String => String,
    regExpPattern: String => String,
    regExpReplacement: String => String,
    shellArg: String => String
  ): Typeofescape = {
    val __obj = js.Dynamic.literal(control = js.Any.fromFunction1(control), format = js.Any.fromFunction1(format), htmlSpecialChars = js.Any.fromFunction1(htmlSpecialChars), regExpPattern = js.Any.fromFunction1(regExpPattern), regExpReplacement = js.Any.fromFunction1(regExpReplacement), shellArg = js.Any.fromFunction1(shellArg))
  
    __obj.asInstanceOf[Typeofescape]
  }
}

