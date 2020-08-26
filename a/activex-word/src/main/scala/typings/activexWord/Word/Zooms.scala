package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Zooms extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.Zooms_typekey")
  var WordDotZooms_typekey: Zooms = js.native
  def Item(Index: WdViewType): Zoom = js.native
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
  @scala.inline
  implicit class ZoomsOps[Self <: Zooms] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: WdViewType => Zoom): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotZooms_typekey(value: Zooms): Self = this.set("Word.Zooms_typekey", value.asInstanceOf[js.Any])
  }
  
}

