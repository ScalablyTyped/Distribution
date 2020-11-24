package typings.avvio.mod

import typings.avvio.avvioStrings.close
import typings.avvio.avvioStrings.preReady
import typings.avvio.avvioStrings.start
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Avvio[I]
  extends EventEmitter
     with Server[I] {
  
  var booted: Boolean = js.native
  
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_preReady(event: preReady, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_start(event: start, listener: js.Function0[Unit]): this.type = js.native
  
  def `override`(server: context[I], fn: Plugin[_, I], options: js.Any): context[I] = js.native
  
  def prettyPrint(): String = js.native
  
  def start(): this.type = js.native
  
  var started: Boolean = js.native
  
  def toJSON(): js.Object = js.native
}
