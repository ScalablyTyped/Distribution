package typings.activexWord.global.Word

import typings.activexWord.Word.WdStyleSheetLinkType
import typings.activexWord.Word.WdStyleSheetPrecedence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.StyleSheets")
@js.native
/* private */ class StyleSheets ()
  extends StObject
     with typings.activexWord.Word.StyleSheets {
  
  /* CompleteClass */
  override def Add(
    FileName: String,
    LinkType: WdStyleSheetLinkType,
    Title: String,
    Precedence: WdStyleSheetPrecedence
  ): typings.activexWord.Word.StyleSheet = js.native
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexWord.Word.StyleSheet = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.StyleSheets_typekey")
  var WordDotStyleSheets_typekey: typings.activexWord.Word.StyleSheets = js.native
}
