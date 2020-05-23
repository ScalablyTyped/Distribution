package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Zooms extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.Zooms_typekey")
  var WordDotZooms_typekey: Zooms
  def Item(Index: WdViewType): Zoom
}

object Zooms {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Item: WdViewType => Zoom,
    Parent: js.Any,
    WordDotZooms_typekey: Zooms
  ): Zooms = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Zooms_typekey")(WordDotZooms_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Zooms]
  }
}

