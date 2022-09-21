package typings.aframe.mod

import typings.aframe.mod.^
import typings.std.AddEventListenerOptions
import typings.std.Element
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ANode
  extends StObject
     with HTMLElement {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  def attachMixinListener(mixin: HTMLElement): Unit = js.native
  
  // Only public APIs added. Many methods intentionally left out.
  // createdCallback
  // attachedCallback
  // attributeChangedCallback
  def closestScene(): Scene = js.native
  
  def emit(name: String): Unit = js.native
  def emit(name: String, detail: Any): Unit = js.native
  def emit(name: String, detail: Any, bubbles: Boolean): Unit = js.native
  def emit(name: String, detail: Unit, bubbles: Boolean): Unit = js.native
  
  def emitter(name: String): js.Function0[Unit] = js.native
  def emitter(name: String, detail: Any): js.Function0[Unit] = js.native
  def emitter(name: String, detail: Any, bubbles: Boolean): js.Function0[Unit] = js.native
  def emitter(name: String, detail: Unit, bubbles: Boolean): js.Function0[Unit] = js.native
  
  // detachedCallback
  var hasLoaded: Boolean = js.native
  
  def load(): Unit = js.native
  def load(cb: js.Function0[Unit]): Unit = js.native
  def load(cb: js.Function0[Unit], childFilter: js.Function1[/* el */ Element, Boolean]): Unit = js.native
  def load(cb: Unit, childFilter: js.Function1[/* el */ Element, Boolean]): Unit = js.native
  
  // updateMixins
  def registerMixin(id: String): Unit = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  
  def removeMixinListener(id: String): Unit = js.native
  
  def setAttribute(`type`: String, newValue: Any): Unit = js.native
  
  def unregisterMixin(id: String): Unit = js.native
}
object ANode {
  
  inline def apply: ANode = ^.asInstanceOf[js.Dynamic].selectDynamic("ANode").asInstanceOf[ANode]
}
