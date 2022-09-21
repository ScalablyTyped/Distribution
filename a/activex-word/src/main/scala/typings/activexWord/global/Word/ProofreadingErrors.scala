package typings.activexWord.global.Word

import typings.activexWord.Word.WdProofreadingErrorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Word.ProofreadingErrors")
@js.native
/* private */ open class ProofreadingErrors ()
  extends StObject
     with typings.activexWord.Word.ProofreadingErrors {
  
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  override def Item(Index: Double): typings.activexWord.Word.Range = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val Type: WdProofreadingErrorType = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Word.ProofreadingErrors_typekey")
  var WordDotProofreadingErrors_typekey: typings.activexWord.Word.ProofreadingErrors = js.native
}
