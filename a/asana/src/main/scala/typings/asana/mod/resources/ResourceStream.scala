package typings.asana.mod.resources

import typings.asana.asanaStrings.data
import typings.asana.asanaStrings.end
import typings.asana.asanaStrings.error
import typings.asana.asanaStrings.finish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceStream[T /* <: AnonymousResource */] extends StObject {
  
  def on(command: end | finish | error, callback: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_data(command: data, callback: js.Function1[/* resource */ T, Any]): Unit = js.native
}
