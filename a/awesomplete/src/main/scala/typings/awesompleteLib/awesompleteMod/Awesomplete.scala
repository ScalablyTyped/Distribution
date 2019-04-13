package typings
package awesompleteLib.awesompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Awesomplete extends js.Object {
  var container: stdLib.HTMLElement = js.native
  var index: scala.Double = js.native
  var input: stdLib.HTMLElement | java.lang.String = js.native
  var list: java.lang.String | stdLib.Element | js.Array[Suggestion] = js.native
  var opened: scala.Double = js.native
  var selected: scala.Boolean = js.native
  var status: stdLib.HTMLElement = js.native
  var ul: stdLib.HTMLElement = js.native
  def close(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def evaluate(): scala.Unit = js.native
  def goto(i: scala.Double): scala.Unit = js.native
  def next(): scala.Unit = js.native
  def open(): scala.Unit = js.native
  def previous(): scala.Unit = js.native
  def select(): scala.Unit = js.native
  def select(selected: stdLib.HTMLElement): scala.Unit = js.native
  def select(selected: stdLib.HTMLElement, originalTarget: stdLib.HTMLElement): scala.Unit = js.native
}

