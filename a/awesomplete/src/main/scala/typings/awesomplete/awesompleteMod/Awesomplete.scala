package typings.awesomplete.awesompleteMod

import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Awesomplete extends js.Object {
  var container: HTMLElement = js.native
  var index: Double = js.native
  var input: HTMLElement | String = js.native
  var list: String | Element | js.Array[Suggestion] = js.native
  var opened: Double = js.native
  var selected: Boolean = js.native
  var status: HTMLElement = js.native
  var ul: HTMLElement = js.native
  def close(): Unit = js.native
  def destroy(): Unit = js.native
  def evaluate(): Unit = js.native
  def goto(i: Double): Unit = js.native
  def next(): Unit = js.native
  def open(): Unit = js.native
  def previous(): Unit = js.native
  def select(): Unit = js.native
  def select(selected: HTMLElement): Unit = js.native
  def select(selected: HTMLElement, originalTarget: HTMLElement): Unit = js.native
}

