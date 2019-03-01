package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Control extends js.Object {
  def control(str: java.lang.String): java.lang.String
  def format(str: java.lang.String): java.lang.String
  def htmlSpecialChars(str: java.lang.String): java.lang.String
  def regExpPattern(str: java.lang.String): java.lang.String
  def regExpReplacement(str: java.lang.String): java.lang.String
  def shellArg(str: java.lang.String): java.lang.String
}

object Anon_Control {
  @scala.inline
  def apply(
    control: js.Function1[java.lang.String, java.lang.String],
    format: js.Function1[java.lang.String, java.lang.String],
    htmlSpecialChars: js.Function1[java.lang.String, java.lang.String],
    regExpPattern: js.Function1[java.lang.String, java.lang.String],
    regExpReplacement: js.Function1[java.lang.String, java.lang.String],
    shellArg: js.Function1[java.lang.String, java.lang.String]
  ): Anon_Control = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("control")(control)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("htmlSpecialChars")(htmlSpecialChars)
    __obj.updateDynamic("regExpPattern")(regExpPattern)
    __obj.updateDynamic("regExpReplacement")(regExpReplacement)
    __obj.updateDynamic("shellArg")(shellArg)
    __obj.asInstanceOf[Anon_Control]
  }
}

