package typings.androiduix.androidui

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidUIElement extends HTMLDivElement {
  
  var AndroidUI: typings.androiduix.androidui.AndroidUI = js.native
  
  def attachedCallback(): Unit = js.native
  
  def attributeChangedCallback(attributeName: String, oldVal: String, newVal: String): Unit = js.native
  
  def createdCallback(): Unit = js.native
  
  def detachedCallback(): Unit = js.native
}
