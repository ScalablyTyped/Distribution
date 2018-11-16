package typings
package aframeLib.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ANode
  extends stdLib.HTMLElement {
  // detachedCallback
  var hasLoaded: scala.Boolean = js.native
  def attachMixinListener(mixin: stdLib.HTMLElement): scala.Unit = js.native
  // Only public APIs added. Many methods intentionally left out.
  // createdCallback
  // attachedCallback
  // attributeChangedCallback
  def closestScene(): Scene = js.native
  def emit(name: java.lang.String): scala.Unit = js.native
  def emit(name: java.lang.String, detail: js.Any): scala.Unit = js.native
  def emit(name: java.lang.String, detail: js.Any, bubbles: scala.Boolean): scala.Unit = js.native
  def emitter(name: java.lang.String): js.Function0[scala.Unit] = js.native
  def emitter(name: java.lang.String, detail: js.Any): js.Function0[scala.Unit] = js.native
  def emitter(name: java.lang.String, detail: js.Any, bubbles: scala.Boolean): js.Function0[scala.Unit] = js.native
  def load(): scala.Unit = js.native
  def load(cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def load(cb: js.Function0[scala.Unit], childFilter: js.Function1[/* el */ stdLib.Element, scala.Boolean]): scala.Unit = js.native
  // updateMixins
  def registerMixin(id: java.lang.String): scala.Unit = js.native
  def removeMixinListener(id: java.lang.String): scala.Unit = js.native
  def setAttribute(`type`: java.lang.String, newValue: js.Any): scala.Unit = js.native
  def unregisterMixin(id: java.lang.String): scala.Unit = js.native
}

