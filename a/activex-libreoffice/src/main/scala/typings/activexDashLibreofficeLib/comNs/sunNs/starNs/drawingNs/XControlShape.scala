package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is implemented by a {@link ControlShape} to access the controls model.
  * @see com.sun.star.drawing.ControlShape
  * @see com.sun.star.awt.UnoControlModel
  */
trait XControlShape extends XShape {
  /**
    * returns the control model of this {@link Shape} .
    * @returns if there is already a control model assigned to this {@link ControlShape} , than its returned. Otherwise you get an empty reference.
    */
  var Control: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel
  /**
    * returns the control model of this {@link Shape} .
    * @returns if there is already a control model assigned to this {@link ControlShape} , than its returned. Otherwise you get an empty reference.
    */
  def getControl(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel
  /**
    * sets the control model for this {@link Shape} .
    * @param xControl this will be the new control model that is displayed with this shape. You may change the model more than once during the lifetime of a {
    */
  def setControl(xControl: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel): scala.Unit
}

object XControlShape {
  @scala.inline
  def apply(
    Control: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    ShapeType: java.lang.String,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    acquire: js.Function0[scala.Unit],
    getControl: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel],
    getPosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point],
    getShapeType: js.Function0[java.lang.String],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setControl: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel, scala.Unit],
    setPosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point, scala.Unit],
    setSize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, scala.Unit]
  ): XControlShape = {
    val __obj = js.Dynamic.literal(Control = Control, Position = Position, ShapeType = ShapeType, Size = Size, acquire = acquire, getControl = getControl, getPosition = getPosition, getShapeType = getShapeType, getSize = getSize, queryInterface = queryInterface, release = release, setControl = setControl, setPosition = setPosition, setSize = setSize)
  
    __obj.asInstanceOf[XControlShape]
  }
}

