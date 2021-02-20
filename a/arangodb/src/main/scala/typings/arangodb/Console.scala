package typings.arangodb

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Console extends StObject {
  
  def debugLines(args: js.Any*): Unit = js.native
  
  def debugStack(err: Error): Unit = js.native
  def debugStack(err: Error, msg: String): Unit = js.native
  
  def errorLines(args: js.Any*): Unit = js.native
  
  def errorStack(err: Error): Unit = js.native
  def errorStack(err: Error, msg: String): Unit = js.native
  
  def infoLines(args: js.Any*): Unit = js.native
  
  def infoStack(err: Error): Unit = js.native
  def infoStack(err: Error, msg: String): Unit = js.native
  
  def logLines(args: js.Any*): Unit = js.native
  
  def warnLines(args: js.Any*): Unit = js.native
  
  def warnStack(err: Error): Unit = js.native
  def warnStack(err: Error, msg: String): Unit = js.native
}
