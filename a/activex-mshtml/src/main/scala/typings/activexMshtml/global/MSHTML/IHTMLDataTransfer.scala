package typings.activexMshtml.global.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MSHTML.IHTMLDataTransfer")
@js.native
/* private */ class IHTMLDataTransfer ()
  extends StObject
     with typings.activexMshtml.MSHTML.IHTMLDataTransfer {
  
  /* private */ /* CompleteClass */
  @JSName("MSHTML.IHTMLDataTransfer_typekey")
  var MSHTMLDotIHTMLDataTransfer_typekey: typings.activexMshtml.MSHTML.IHTMLDataTransfer = js.native
  
  /* CompleteClass */
  override def clearData(format: String): Boolean = js.native
  
  /* CompleteClass */
  var dropEffect: String = js.native
  
  /* CompleteClass */
  var effectAllowed: String = js.native
  
  /* CompleteClass */
  override def getData(format: String): js.Any = js.native
  
  /* CompleteClass */
  override def setData(format: String, data: js.Any): Boolean = js.native
}
