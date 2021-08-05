package typings.activexOffice.global.Office

import typings.activexOffice.Office.MsoDocInspectorStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.DocumentInspector")
@js.native
/* private */ class DocumentInspector ()
  extends StObject
     with typings.activexOffice.Office.DocumentInspector {
  
  /* CompleteClass */
  override val Application: js.Any = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override val Description: String = js.native
  
  /* CompleteClass */
  override def Fix(Status: MsoDocInspectorStatus, Results: String): Unit = js.native
  
  /* CompleteClass */
  override def Inspect(Status: MsoDocInspectorStatus, Results: String): Unit = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Office.DocumentInspector_typekey")
  var OfficeDotDocumentInspector_typekey: typings.activexOffice.Office.DocumentInspector = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
}
