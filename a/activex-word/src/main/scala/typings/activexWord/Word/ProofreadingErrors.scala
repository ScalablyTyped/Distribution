package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProofreadingErrors extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  val Type: WdProofreadingErrorType
  @JSName("Word.ProofreadingErrors_typekey")
  var WordDotProofreadingErrors_typekey: ProofreadingErrors
  def Item(Index: Double): Range
}

object ProofreadingErrors {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => Range,
    Parent: js.Any,
    Type: WdProofreadingErrorType,
    WordDotProofreadingErrors_typekey: ProofreadingErrors
  ): ProofreadingErrors = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ProofreadingErrors_typekey")(WordDotProofreadingErrors_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProofreadingErrors]
  }
}

