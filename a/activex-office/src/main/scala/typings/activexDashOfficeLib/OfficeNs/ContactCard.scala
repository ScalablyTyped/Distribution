package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Office.ContactCard")
@js.native
class ContactCard protected () extends js.Object {
  val Application: js.Any = js.native
  val Creator: scala.Double = js.native
  var `Office.ContactCard_typekey`: ContactCard = js.native
  def Close(): scala.Unit = js.native
  /** @param boolean [ShowWithDelay=false] */
  def Show(
    CardStyle: MsoContactCardStyle,
    RectangleLeft: scala.Double,
    RectangleRight: scala.Double,
    RectangleTop: scala.Double,
    RectangleBottom: scala.Double,
    HorizontalPosition: scala.Double
  ): scala.Unit = js.native
  /** @param boolean [ShowWithDelay=false] */
  def Show(
    CardStyle: MsoContactCardStyle,
    RectangleLeft: scala.Double,
    RectangleRight: scala.Double,
    RectangleTop: scala.Double,
    RectangleBottom: scala.Double,
    HorizontalPosition: scala.Double,
    ShowWithDelay: scala.Boolean
  ): scala.Unit = js.native
}

