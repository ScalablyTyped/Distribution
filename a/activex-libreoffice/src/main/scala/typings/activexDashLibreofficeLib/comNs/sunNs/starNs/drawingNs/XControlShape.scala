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
    acquire: () => scala.Unit,
    getControl: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel,
    getPosition: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    getShapeType: () => java.lang.String,
    getSize: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setControl: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel => scala.Unit,
    setPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point => scala.Unit,
    setSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size => scala.Unit
  ): XControlShape = {
    val __obj = js.Dynamic.literal(Control = Control, Position = Position, ShapeType = ShapeType, Size = Size, acquire = js.Any.fromFunction0(acquire), getControl = js.Any.fromFunction0(getControl), getPosition = js.Any.fromFunction0(getPosition), getShapeType = js.Any.fromFunction0(getShapeType), getSize = js.Any.fromFunction0(getSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setControl = js.Any.fromFunction1(setControl), setPosition = js.Any.fromFunction1(setPosition), setSize = js.Any.fromFunction1(setSize))
  
    __obj.asInstanceOf[XControlShape]
  }
}

