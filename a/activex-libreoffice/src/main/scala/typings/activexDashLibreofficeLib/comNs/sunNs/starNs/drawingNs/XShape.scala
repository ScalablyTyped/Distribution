package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** lets you do a basic transformation on a {@link Shape} and get its type. */
trait XShape extends XShapeDescriptor {
  /**
    * gets the current position of this object.
    * @returns the position of the top left edge in 100/th mm
    */
  var Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /**
    * gets the size of this object.
    * @returns the size in 100/th mm
    */
  var Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /**
    * gets the current position of this object.
    * @returns the position of the top left edge in 100/th mm
    */
  def getPosition(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /**
    * gets the size of this object.
    * @returns the size in 100/th mm
    */
  def getSize(): activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /**
    * sets the current position of this object
    * @param aPosition the position of the top left edge in 100/th mm
    */
  def setPosition(aPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point): scala.Unit
  /**
    * sets the size of this object.
    * @param aSize the size in 100/th mm
    */
  def setSize(aSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size): scala.Unit
}

