package typings.aceBuilds.mod.Ace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventEmitter extends StObject {
  
  def addEventListener(name: String, callback: js.Function): Unit = js.native
  def addEventListener(name: String, callback: js.Function, capturing: Boolean): Unit = js.native
  
  def off(name: String, callback: js.Function): Unit = js.native
  
  def on(name: String, callback: js.Function): Unit = js.native
  def on(name: String, callback: js.Function, capturing: Boolean): Unit = js.native
  
  def once(name: String, callback: js.Function): Unit = js.native
  
  def removeDefaultHandler(name: String, callback: js.Function): Unit = js.native
  
  def removeEventListener(name: String, callback: js.Function): Unit = js.native
  
  def removeListener(name: String, callback: js.Function): Unit = js.native
  
  def setDefaultHandler(name: String, callback: js.Function): Unit = js.native
}
