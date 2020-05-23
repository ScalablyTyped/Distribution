package typings.activexLibreoffice.com_.sun.star.awt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a set of properties to describe the model of an {@link UnoControl} which is embedded in a {@link UnoControlDialogModel} . */
trait UnoControlDialogElement extends js.Object {
  /** specifies the height of the control. */
  var Height: Double
  /** specifies the name of the control. */
  var Name: String
  /** specifies the horizontal position of the control. */
  var PositionX: String
  /** specifies the vertical position of the control. */
  var PositionY: String
  /** specifies the step of the control. */
  var Step: Double
  /** specifies the tabindex of the control. */
  var TabIndex: Double
  /** specifies the tag of the control. */
  var Tag: String
  /** specifies the width of the control. */
  var Width: Double
}

object UnoControlDialogElement {
  @scala.inline
  def apply(
    Height: Double,
    Name: String,
    PositionX: String,
    PositionY: String,
    Step: Double,
    TabIndex: Double,
    Tag: String,
    Width: Double
  ): UnoControlDialogElement = {
    val __obj = js.Dynamic.literal(Height = Height.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PositionX = PositionX.asInstanceOf[js.Any], PositionY = PositionY.asInstanceOf[js.Any], Step = Step.asInstanceOf[js.Any], TabIndex = TabIndex.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnoControlDialogElement]
  }
}

