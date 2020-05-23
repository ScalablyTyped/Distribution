package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMaths extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.OMaths_typekey")
  var WordDotOMaths_typekey: OMaths
  def Add(Range: Range): Range
  def BuildUp(): Unit
  def Item(Index: Double): OMath
  def Linearize(): Unit
}

object OMaths {
  @scala.inline
  def apply(
    Add: Range => Range,
    Application: Application,
    BuildUp: () => Unit,
    Count: Double,
    Creator: Double,
    Item: Double => OMath,
    Linearize: () => Unit,
    Parent: js.Any,
    WordDotOMaths_typekey: OMaths
  ): OMaths = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], BuildUp = js.Any.fromFunction0(BuildUp), Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Linearize = js.Any.fromFunction0(Linearize), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMaths_typekey")(WordDotOMaths_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMaths]
  }
}

