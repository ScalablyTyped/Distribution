package typings.activexDashOffice.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.ContactCard")
@js.native
class ContactCard protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  var `Office.ContactCard_typekey`: ContactCard = js.native
  def Close(): Unit = js.native
  /** @param boolean [ShowWithDelay=false] */
  def Show(
    CardStyle: MsoContactCardStyle,
    RectangleLeft: Double,
    RectangleRight: Double,
    RectangleTop: Double,
    RectangleBottom: Double,
    HorizontalPosition: Double
  ): Unit = js.native
  def Show(
    CardStyle: MsoContactCardStyle,
    RectangleLeft: Double,
    RectangleRight: Double,
    RectangleTop: Double,
    RectangleBottom: Double,
    HorizontalPosition: Double,
    ShowWithDelay: Boolean
  ): Unit = js.native
}

