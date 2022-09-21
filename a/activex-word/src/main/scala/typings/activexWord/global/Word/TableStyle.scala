package typings.activexWord.global.Word

import typings.activexWord.Word.WdConditionCode
import typings.activexWord.Word.WdRowAlignment
import typings.activexWord.Word.WdTableDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.TableStyle")
@js.native
/* private */ open class TableStyle ()
  extends StObject
     with typings.activexWord.Word.TableStyle {
  
  /* CompleteClass */
  var Alignment: WdRowAlignment = js.native
  
  /* CompleteClass */
  var AllowBreakAcrossPage: Double = js.native
  
  /* CompleteClass */
  var AllowPageBreaks: Boolean = js.native
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  var Borders: typings.activexWord.Word.Borders = js.native
  
  /* CompleteClass */
  var BottomPadding: Double = js.native
  
  /* CompleteClass */
  var ColumnStripe: Double = js.native
  
  /* CompleteClass */
  override def Condition(ConditionCode: WdConditionCode): typings.activexWord.Word.ConditionalStyle = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var LeftIndent: Double = js.native
  
  /* CompleteClass */
  var LeftPadding: Double = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var RightPadding: Double = js.native
  
  /* CompleteClass */
  var RowStripe: Double = js.native
  
  /* CompleteClass */
  override val Shading: typings.activexWord.Word.Shading = js.native
  
  /* CompleteClass */
  var Spacing: Double = js.native
  
  /* CompleteClass */
  var TableDirection: WdTableDirection = js.native
  
  /* CompleteClass */
  var TopPadding: Double = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.TableStyle_typekey")
  var WordDotTableStyle_typekey: typings.activexWord.Word.TableStyle = js.native
}
