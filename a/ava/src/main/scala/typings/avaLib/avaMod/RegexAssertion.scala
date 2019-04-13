package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegexAssertion extends js.Object {
  /** Assert that `string` matches the regular expression. */
  def apply(string: java.lang.String, regex: stdLib.RegExp): scala.Unit = js.native
  def apply(string: java.lang.String, regex: stdLib.RegExp, message: java.lang.String): scala.Unit = js.native
  /** Skip this assertion. */
  def skip(string: java.lang.String, regex: stdLib.RegExp): scala.Unit = js.native
  def skip(string: java.lang.String, regex: stdLib.RegExp, message: java.lang.String): scala.Unit = js.native
}

