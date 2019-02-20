package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service is for a {@link Shape} which contains a control.
  * @see Shape
  * @see XControlShape
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XControlShape because var conflicts: Position, Size. Inlined Control, getControl, setControl */ trait ControlShape extends Shape {
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

