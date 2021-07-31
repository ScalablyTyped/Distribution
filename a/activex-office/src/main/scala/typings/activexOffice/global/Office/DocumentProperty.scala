package typings.activexOffice.global.Office

import typings.activexOffice.Office.MsoDocProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.DocumentProperty")
@js.native
class DocumentProperty[TApplication] protected ()
  extends StObject
     with typings.activexOffice.Office.DocumentProperty[TApplication] {
  
  /* CompleteClass */
  var Application: TApplication = js.native
  
  /* CompleteClass */
  var Creator: Double = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var LinkSource: String = js.native
  
  /* CompleteClass */
  var LinkToContent: Boolean = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  @JSName("Office.DocumentProperty_typekey")
  var OfficeDotDocumentProperty_typekey: typings.activexOffice.Office.DocumentProperty[TApplication] = js.native
  
  /* CompleteClass */
  var Parent: js.Any = js.native
  
  /* CompleteClass */
  var Type: MsoDocProperties = js.native
  
  /* CompleteClass */
  var Value: js.Any = js.native
}
