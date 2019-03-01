package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a set of properties to describe the model of an {@link UnoControl} which is embedded in a {@link UnoControlDialogModel} . */
trait UnoControlDialogElement extends js.Object {
  /** specifies the height of the control. */
  var Height: scala.Double
  /** specifies the name of the control. */
  var Name: java.lang.String
  /** specifies the horizontal position of the control. */
  var PositionX: java.lang.String
  /** specifies the vertical position of the control. */
  var PositionY: java.lang.String
  /** specifies the step of the control. */
  var Step: scala.Double
  /** specifies the tabindex of the control. */
  var TabIndex: scala.Double
  /** specifies the tag of the control. */
  var Tag: java.lang.String
  /** specifies the width of the control. */
  var Width: scala.Double
}

object UnoControlDialogElement {
  @scala.inline
  def apply(
    Height: scala.Double,
    Name: java.lang.String,
    PositionX: java.lang.String,
    PositionY: java.lang.String,
    Step: scala.Double,
    TabIndex: scala.Double,
    Tag: java.lang.String,
    Width: scala.Double
  ): UnoControlDialogElement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Height")(Height)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("PositionX")(PositionX)
    __obj.updateDynamic("PositionY")(PositionY)
    __obj.updateDynamic("Step")(Step)
    __obj.updateDynamic("TabIndex")(TabIndex)
    __obj.updateDynamic("Tag")(Tag)
    __obj.updateDynamic("Width")(Width)
    __obj.asInstanceOf[UnoControlDialogElement]
  }
}

