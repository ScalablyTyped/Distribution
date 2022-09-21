package typings.activexWord.global.Word

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.Version")
@js.native
/* private */ open class Version ()
  extends StObject
     with typings.activexWord.Word.Version {
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override val Comment: String = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override val Date: VarDate = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override val Index: Double = js.native
  
  /* CompleteClass */
  override def Open(): typings.activexWord.Word.Document = js.native
  
  /* CompleteClass */
  override def OpenOld(): Unit = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val SavedBy: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.Version_typekey")
  var WordDotVersion_typekey: typings.activexWord.Word.Version = js.native
}
