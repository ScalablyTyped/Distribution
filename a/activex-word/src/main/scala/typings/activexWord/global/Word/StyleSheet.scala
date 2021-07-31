package typings.activexWord.global.Word

import typings.activexWord.Word.WdStyleSheetLinkType
import typings.activexWord.Word.WdStyleSheetPrecedence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.StyleSheet")
@js.native
class StyleSheet protected ()
  extends StObject
     with typings.activexWord.Word.StyleSheet {
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override val FullName: String = js.native
  
  /* CompleteClass */
  override val Index: Double = js.native
  
  /* CompleteClass */
  override def Move(Precedence: WdStyleSheetPrecedence): Unit = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override val Path: String = js.native
  
  /* CompleteClass */
  var Title: String = js.native
  
  /* CompleteClass */
  var Type: WdStyleSheetLinkType = js.native
  
  /* CompleteClass */
  @JSName("Word.StyleSheet_typekey")
  var WordDotStyleSheet_typekey: typings.activexWord.Word.StyleSheet = js.native
}
