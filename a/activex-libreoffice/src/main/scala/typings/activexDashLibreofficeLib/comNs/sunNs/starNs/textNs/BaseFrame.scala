package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the base service of text frames, graphic objects, and embedded objects */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShape because var conflicts: Size. Inlined getPosition, getSize, Position, setPosition, setSize */ trait BaseFrame
  extends TextContent
     with BaseFrameProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed {
  /** contains the name of the frame style that is applied to this object. */
  var FrameStyleName: java.lang.String
  /**
    * gets the current position of this object.
    * @returns the position of the top left edge in 100/th mm
    */
  var Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
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

