package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofinflection extends js.Object {
  def pluralizeWord(str: String): String = js.native
  def pluralizeWord(str: String, plural: String): String = js.native
  def singularizeWord(str: String): String = js.native
  def singularizeWord(str: String, singular: String): String = js.native
  def underscore(str: String): String = js.native
  def underscore(str: String, allUpperCase: Boolean): String = js.native
}

