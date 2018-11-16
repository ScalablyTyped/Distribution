package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _Dom[TElement]
  extends stdLib.Iterable[TElement]
     with /* key */ ScalablyTyped.runtime.NumberDictionary[TElement] {
  var length: scala.Double = js.native
  def addClass(classes: java.lang.String): _Dom[TElement] = js.native
  def appendTo(selector: _Dom[TElement]): _Dom[TElement] = js.native
  def appendTo(selector: java.lang.String): _Dom[TElement] = js.native
  def appendTo(selector: stdLib.HTMLElement): _Dom[TElement] = js.native
  def attr(att: JSObject): _Dom[TElement] = js.native
  def attr(att: java.lang.String, `val`: java.lang.String): _Dom[TElement] = js.native
  def css(prop: JSObject): _Dom[TElement] = js.native
  def css(prop: java.lang.String): java.lang.String | scala.Null = js.native
  def css(prop: java.lang.String, `val`: java.lang.String): _Dom[TElement] = js.native
  def find(selector: java.lang.String): _Dom[TElement] = js.native
  def hide(): _Dom[TElement] = js.native
  def html(str: java.lang.String): _Dom[TElement] = js.native
  def removeClass(classes: java.lang.String): _Dom[TElement] = js.native
  def show(): _Dom[TElement] = js.native
}

