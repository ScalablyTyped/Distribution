package typings.antd

import typings.std.Document
import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/_util/getScroll", JSImport.Namespace)
@js.native
object getScrollMod extends js.Object {
  def default(target: Null, top: Boolean): Double = js.native
  def default(target: Document, top: Boolean): Double = js.native
  def default(target: HTMLElement, top: Boolean): Double = js.native
  def default(target: Window, top: Boolean): Double = js.native
  def isWindow(obj: js.Any): Boolean = js.native
}

