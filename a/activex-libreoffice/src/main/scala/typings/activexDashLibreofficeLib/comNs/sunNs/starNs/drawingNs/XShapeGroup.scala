package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is implemented by {@link Shapes} that contain other {@link Shapes} .
  * @deprecated Deprecated
  */
trait XShapeGroup extends XShape {
  /**
    * enters the group which enables the editing function for the parts of a grouped {@link Shape} . Then the parts can be edited instead of the group as a
    * whole.
    *
    * This affects only the user interface. The behavior is not specified if this instance is not visible on any view. In this case it may or may not work.
    */
  def enterGroup(): scala.Unit
  /**
    * leaves the group, which disables the editing function for the parts of a grouped {@link Shape} . Then only the group as a whole can be edited.
    *
    * This affects only the user interface. The behavior is not specified if this instance is not visible on any view. In this case it may or may not work.
    */
  def leaveGroup(): scala.Unit
}

