package typings.angularPlatformBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HammerInstance extends StObject {
  
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  
  def off(eventName: String): Unit = js.native
  def off(eventName: String, callback: js.Function): Unit = js.native
  
  def on(eventName: String): Unit = js.native
  def on(eventName: String, callback: js.Function): Unit = js.native
}
