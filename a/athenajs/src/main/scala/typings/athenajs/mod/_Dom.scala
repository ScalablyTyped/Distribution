package typings.athenajs.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.std.HTMLElement
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _Dom[TElement]
  extends Iterable[TElement]
     with /* key */ NumberDictionary[TElement] {
  
  def addClass(classes: String): _Dom[TElement] = js.native
  
  def appendTo(selector: String): _Dom[TElement] = js.native
  def appendTo(selector: _Dom[TElement]): _Dom[TElement] = js.native
  def appendTo(selector: HTMLElement): _Dom[TElement] = js.native
  
  def attr(att: String, `val`: String): _Dom[TElement] = js.native
  def attr(att: JSObject): _Dom[TElement] = js.native
  
  def css(prop: String): String | Null = js.native
  def css(prop: String, `val`: String): _Dom[TElement] = js.native
  def css(prop: JSObject): _Dom[TElement] = js.native
  
  def find(selector: String): _Dom[TElement] = js.native
  
  def hide(): _Dom[TElement] = js.native
  
  def html(str: String): _Dom[TElement] = js.native
  
  var length: Double = js.native
  
  def removeClass(classes: String): _Dom[TElement] = js.native
  
  def show(): _Dom[TElement] = js.native
}
