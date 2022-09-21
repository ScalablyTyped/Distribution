package typings.arangodb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Console extends StObject {
  
  def debugLines(args: Any*): Unit = js.native
  
  def debugStack(err: js.Error): Unit = js.native
  def debugStack(err: js.Error, msg: String): Unit = js.native
  
  def errorLines(args: Any*): Unit = js.native
  
  def errorStack(err: js.Error): Unit = js.native
  def errorStack(err: js.Error, msg: String): Unit = js.native
  
  def infoLines(args: Any*): Unit = js.native
  
  def infoStack(err: js.Error): Unit = js.native
  def infoStack(err: js.Error, msg: String): Unit = js.native
  
  def logLines(args: Any*): Unit = js.native
  
  def warnLines(args: Any*): Unit = js.native
  
  def warnStack(err: js.Error): Unit = js.native
  def warnStack(err: js.Error, msg: String): Unit = js.native
}
