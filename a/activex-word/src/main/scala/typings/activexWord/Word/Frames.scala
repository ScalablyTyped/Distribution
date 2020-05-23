package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frames extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.Frames_typekey")
  var WordDotFrames_typekey: Frames
  def Add(Range: Range): Frame
  def Delete(): Unit
  def Item(Index: Double): Frame
}

object Frames {
  @scala.inline
  def apply(
    Add: Range => Frame,
    Application: Application,
    Count: Double,
    Creator: Double,
    Delete: () => Unit,
    Item: Double => Frame,
    Parent: js.Any,
    WordDotFrames_typekey: Frames
  ): Frames = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Frames_typekey")(WordDotFrames_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frames]
  }
}

