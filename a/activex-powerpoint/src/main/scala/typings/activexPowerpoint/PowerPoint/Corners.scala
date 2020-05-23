package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Corners extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Creator: Double
  val Name: String
  val Parent: js.Any
  @JSName("PowerPoint.Corners_typekey")
  var PowerPointDotCorners_typekey: Corners
  def Select(): js.Any
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
}

