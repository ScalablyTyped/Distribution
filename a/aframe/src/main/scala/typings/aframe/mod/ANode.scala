package typings.aframe.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ANode extends HTMLElement {
  // detachedCallback
  var hasLoaded: Boolean = js.native
  def attachMixinListener(mixin: HTMLElement): Unit = js.native
  // Only public APIs added. Many methods intentionally left out.
  // createdCallback
  // attachedCallback
  // attributeChangedCallback
  def closestScene(): Scene = js.native
  def emit(name: String): Unit = js.native
  def emit(name: String, detail: js.UndefOr[scala.Nothing], bubbles: Boolean): Unit = js.native
  def emit(name: String, detail: js.Any): Unit = js.native
  def emit(name: String, detail: js.Any, bubbles: Boolean): Unit = js.native
  def emitter(name: String): js.Function0[Unit] = js.native
  def emitter(name: String, detail: js.UndefOr[scala.Nothing], bubbles: Boolean): js.Function0[Unit] = js.native
  def emitter(name: String, detail: js.Any): js.Function0[Unit] = js.native
  def emitter(name: String, detail: js.Any, bubbles: Boolean): js.Function0[Unit] = js.native
  def load(): Unit = js.native
  def load(cb: js.UndefOr[scala.Nothing], childFilter: js.Function1[/* el */ Element, Boolean]): Unit = js.native
  def load(cb: js.Function0[Unit]): Unit = js.native
  def load(cb: js.Function0[Unit], childFilter: js.Function1[/* el */ Element, Boolean]): Unit = js.native
  // updateMixins
  def registerMixin(id: String): Unit = js.native
  def removeMixinListener(id: String): Unit = js.native
  def setAttribute(`type`: String, newValue: js.Any): Unit = js.native
  def unregisterMixin(id: String): Unit = js.native
}

@JSImport("aframe", "ANode")
@js.native
object ANode extends TopLevel[ANode]

