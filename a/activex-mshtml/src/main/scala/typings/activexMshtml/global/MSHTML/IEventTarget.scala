package typings.activexMshtml.global.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MSHTML.IEventTarget")
@js.native
/* private */ open class IEventTarget ()
  extends StObject
     with typings.activexMshtml.MSHTML.IEventTarget {
  
  /* private */ /* CompleteClass */
  @JSName("MSHTML.IEventTarget_typekey")
  var MSHTMLDotIEventTarget_typekey: typings.activexMshtml.MSHTML.IEventTarget = js.native
  
  /* CompleteClass */
  override def addEventListener(`type`: String, listener: Any, useCapture: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def dispatchEvent(evt: typings.activexMshtml.MSHTML.IDOMEvent): Boolean = js.native
  
  /* CompleteClass */
  override def removeEventListener(`type`: String, listener: Any, useCapture: Boolean): Unit = js.native
}
