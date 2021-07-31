package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  def Activate(): Unit = js.native
  
  val Active: Boolean = js.native
  
  /** @param boolean [fForce=false] */
  def Close(): Unit = js.native
  def Close(fForce: Boolean): Unit = js.native
  
  val CommandBars: js.Any = js.native
  
  @JSName("InfoPath.Window_typekey")
  var InfoPathDotWindow_typekey: Window = js.native
  
  val MailEnvelope: MailEnvelopeObject = js.native
  
  val TaskPanes: TaskPanesCollection = js.native
  
  val Type: XdWindowType = js.native
  
  val XDocument: _XDocument = js.native
}
