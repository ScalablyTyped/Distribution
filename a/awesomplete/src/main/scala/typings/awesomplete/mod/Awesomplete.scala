package typings.awesomplete.mod

import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Awesomplete extends js.Object {
  
  def close(): Unit = js.native
  
  var container: HTMLElement = js.native
  
  def destroy(): Unit = js.native
  
  def evaluate(): Unit = js.native
  
  def goto(i: Double): Unit = js.native
  
  var index: Double = js.native
  
  var input: HTMLElement | String = js.native
  
  var list: String | Element | js.Array[Suggestion] = js.native
  
  def next(): Unit = js.native
  
  def open(): Unit = js.native
  
  var opened: Double = js.native
  
  def previous(): Unit = js.native
  
  def select(): Unit = js.native
  def select(selected: js.UndefOr[scala.Nothing], originalTarget: HTMLElement): Unit = js.native
  def select(selected: HTMLElement): Unit = js.native
  def select(selected: HTMLElement, originalTarget: HTMLElement): Unit = js.native
  
  var selected: Boolean = js.native
  
  var status: HTMLElement = js.native
  
  var ul: HTMLElement = js.native
}
