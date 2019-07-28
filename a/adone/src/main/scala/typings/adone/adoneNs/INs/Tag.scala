package typings.adone.adoneNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  def define(tag: String): Unit = js.native
  def define(tag: String, predicate: String): Unit = js.native
  def has(obj: js.Object, tag: String): Boolean = js.native
  def set(Class: js.Object, tag: String): Unit = js.native
}

