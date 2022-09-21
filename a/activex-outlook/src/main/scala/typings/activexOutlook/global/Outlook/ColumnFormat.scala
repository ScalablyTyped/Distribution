package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlAlign
import typings.activexOutlook.Outlook.OlObjectClass
import typings.activexOutlook.Outlook.OlUserPropertyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Outlook.ColumnFormat")
@js.native
/* private */ open class ColumnFormat ()
  extends StObject
     with typings.activexOutlook.Outlook.ColumnFormat {
  
  /* CompleteClass */
  var Align: OlAlign = js.native
  
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  
  /* CompleteClass */
  var FieldFormat: Double = js.native
  
  /* CompleteClass */
  override val FieldType: OlUserPropertyType = js.native
  
  /* CompleteClass */
  var Label: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Outlook.ColumnFormat_typekey")
  var OutlookDotColumnFormat_typekey: typings.activexOutlook.Outlook.ColumnFormat = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  
  /* CompleteClass */
  var Width: Double = js.native
}
