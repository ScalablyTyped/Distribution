package typings.activexWord.global.Word

import typings.activexWord.Word.WdTabAlignment
import typings.activexWord.Word.WdTabLeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.TabStop")
@js.native
/* private */ open class TabStop ()
  extends StObject
     with typings.activexWord.Word.TabStop {
  
  /* CompleteClass */
  var Alignment: WdTabAlignment = js.native
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override def Clear(): Unit = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override val CustomTab: Boolean = js.native
  
  /* CompleteClass */
  var Leader: WdTabLeader = js.native
  
  /* CompleteClass */
  override val Next: typings.activexWord.Word.TabStop = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var Position: Double = js.native
  
  /* CompleteClass */
  override val Previous: typings.activexWord.Word.TabStop = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.TabStop_typekey")
  var WordDotTabStop_typekey: typings.activexWord.Word.TabStop = js.native
}
