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

