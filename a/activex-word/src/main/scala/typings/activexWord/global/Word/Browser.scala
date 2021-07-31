package typings.activexWord.global.Word

import typings.activexWord.Word.WdBrowseTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.Browser")
@js.native
class Browser protected ()
  extends StObject
     with typings.activexWord.Word.Browser {
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Next(): Unit = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override def Previous(): Unit = js.native
  
  /* CompleteClass */
  var Target: WdBrowseTarget = js.native
  
  /* CompleteClass */
  @JSName("Word.Browser_typekey")
  var WordDotBrowser_typekey: typings.activexWord.Word.Browser = js.native
}
