package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.anon.Signal
import typings.std.AbortSignal
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait reactiveUtils extends StObject {
  
  def on[T /* <: Evented | EventTarget */](
    getTarget: js.Function0[js.UndefOr[T | Null]],
    eventName: String,
    callback: js.Function1[/* value */ Any, scala.Unit]
  ): IHandle = js.native
  def on[T /* <: Evented | EventTarget */](
    getTarget: js.Function0[js.UndefOr[T | Null]],
    eventName: String,
    callback: js.Function1[/* value */ Any, scala.Unit],
    options: ReactiveListenerOptions[T]
  ): IHandle = js.native
  
  def once[T](getValue: js.Function0[T]): js.Promise[T] = js.native
  def once[T](getValue: js.Function0[T], signal: Signal): js.Promise[T] = js.native
  def once[T](getValue: js.Function0[T], signal: AbortSignal): js.Promise[T] = js.native
  
  def watch[T](getValue: js.Function0[T], callback: js.Function2[/* newValue */ T, /* oldValue */ T, scala.Unit]): IHandle = js.native
  def watch[T](
    getValue: js.Function0[T],
    callback: js.Function2[/* newValue */ T, /* oldValue */ T, scala.Unit],
    options: ReactiveWatchOptions
  ): IHandle = js.native
  
  def when[T](
    getValue: js.Function0[js.UndefOr[T | Null]],
    callback: js.Function2[/* newValue */ T, /* oldValue */ T | Null, scala.Unit]
  ): IHandle = js.native
  def when[T](
    getValue: js.Function0[js.UndefOr[T | Null]],
    callback: js.Function2[/* newValue */ T, /* oldValue */ T | Null, scala.Unit],
    options: ReactiveWatchOptions
  ): IHandle = js.native
  
  def whenOnce[T](getValue: js.Function0[js.UndefOr[T | Null]]): js.Promise[T] = js.native
  def whenOnce[T](getValue: js.Function0[js.UndefOr[T | Null]], signal: Signal): js.Promise[T] = js.native
  def whenOnce[T](getValue: js.Function0[js.UndefOr[T | Null]], signal: AbortSignal): js.Promise[T] = js.native
}
