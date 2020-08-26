package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Corners extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val Creator: Double = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Corners_typekey")
  var PowerPointDotCorners_typekey: Corners = js.native
  def Select(): js.Any = js.native
}

object Corners {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Name: String,
    Parent: js.Any,
    PowerPointDotCorners_typekey: Corners,
    Select: () => js.Any
  ): Corners = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("PowerPoint.Corners_typekey")(PowerPointDotCorners_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Corners]
  }
  @scala.inline
  implicit class CornersOps[Self <: Corners] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotCorners_typekey(value: Corners): Self = this.set("PowerPoint.Corners_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(value: () => js.Any): Self = this.set("Select", js.Any.fromFunction0(value))
  }
  
}

