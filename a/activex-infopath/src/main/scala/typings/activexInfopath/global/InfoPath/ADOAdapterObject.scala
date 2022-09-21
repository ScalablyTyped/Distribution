package typings.activexInfopath.global.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("InfoPath.ADOAdapterObject")
@js.native
/* private */ open class ADOAdapterObject ()
  extends StObject
     with typings.activexInfopath.InfoPath.ADOAdapterObject {
  
  /* CompleteClass */
  override def BuildSQLFromXMLNodes(pXmlNode: IXMLDOMNode): String = js.native
  
  /* CompleteClass */
  var Command: String = js.native
  
  /* CompleteClass */
  var Connection: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("InfoPath.ADOAdapterObject_typekey")
  var InfoPathDotADOAdapterObject_typekey: typings.activexInfopath.InfoPath.ADOAdapterObject = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  override def Query(): Unit = js.native
  
  /* CompleteClass */
  override val QueryAllowed: Boolean = js.native
  
  /* CompleteClass */
  override def Submit(): Unit = js.native
  
  /* CompleteClass */
  override val SubmitAllowed: Boolean = js.native
  
  /* CompleteClass */
  var Timeout: Double = js.native
}
