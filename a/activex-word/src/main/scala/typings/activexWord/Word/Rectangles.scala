package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rectangles extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.Rectangles_typekey")
  var WordDotRectangles_typekey: Rectangles
  def Item(Index: Double): Rectangle
}

object Rectangles {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => Rectangle,
    Parent: js.Any,
    WordDotRectangles_typekey: Rectangles
  ): Rectangles = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Rectangles_typekey")(WordDotRectangles_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rectangles]
  }
}

