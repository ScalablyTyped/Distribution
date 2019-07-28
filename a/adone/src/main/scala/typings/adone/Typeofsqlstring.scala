package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofsqlstring extends js.Object {
  def dateToString(date: js.Any): String = js.native
  def dateToString(date: js.Any, timeZone: String): String = js.native
  def escape(value: js.Any): String = js.native
  def escape(value: js.Any, stringifyObjects: Boolean): String = js.native
  def escape(value: js.Any, stringifyObjects: Boolean, timeZone: String): String = js.native
  def escapeId(`val`: String): String = js.native
  def escapeId(`val`: String, forbidQualified: Boolean): String = js.native
  def escapeId(`val`: js.Array[String]): String = js.native
  def escapeId(`val`: js.Array[String], forbidQualified: Boolean): String = js.native
  def format(sql: String): String = js.native
  def format(sql: String, values: js.Any): String = js.native
  def format(sql: String, values: js.Any, stringifyObjects: Boolean): String = js.native
  def format(sql: String, values: js.Any, stringifyObjects: Boolean, timeZone: String): String = js.native
}

