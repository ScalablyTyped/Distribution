package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowObject extends StObject {
  
  def Activate(): Unit = js.native
  
  val Active: Boolean = js.native
  
  var Caption: String = js.native
  
  /** @param boolean [fForce=false] */
  def Close(): Unit = js.native
  def Close(fForce: Boolean): Unit = js.native
  
  val CommandBars: Any = js.native
  
  var Height: Double = js.native
  
  /* private */ @JSName("InfoPath.WindowObject_typekey")
  var InfoPathDotWindowObject_typekey: WindowObject = js.native
  
  var Left: Double = js.native
  
  val MailEnvelope: MailEnvelopeObject = js.native
  
  val TaskPanes: TaskPanesCollection = js.native
  
  var Top: Double = js.native
  
  val Type: XdWindowType = js.native
  
  var Width: Double = js.native
  
  var WindowState: XdWindowState = js.native
  
  val XDocument: _XDocument = js.native
}
