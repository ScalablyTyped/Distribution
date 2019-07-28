package typings.ace.AceAjaxNs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ace extends js.Object {
  /**
    * Creates a new [[EditSession]], and returns the associated [[Document]].
    * @param text {:textParam}
    * @param mode {:modeParam}
    **/
  def createEditSession(text: String, mode: TextMode): IEditSession = js.native
  /**
    * Creates a new [[EditSession]], and returns the associated [[Document]].
    * @param text {:textParam}
    * @param mode {:modeParam}
    **/
  def createEditSession(text: Document, mode: TextMode): IEditSession = js.native
  /**
    * Embeds the Ace editor into the DOM, at the element provided by `el`.
    * @param el Either the id of an element, or the element itself
    **/
  def edit(el: String): Editor = js.native
  /**
    * Embeds the Ace editor into the DOM, at the element provided by `el`.
    * @param el Either the id of an element, or the element itself
    **/
  def edit(el: HTMLElement): Editor = js.native
  /**
    * Provides access to require in packed noconflict mode
    * @param moduleName
    **/
  def require(moduleName: String): js.Any = js.native
}

