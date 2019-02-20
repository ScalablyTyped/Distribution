package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service is for a group of {@link Shapes} .
  * @see XShapeGroup
  * @see XShapes
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XShapeGroup because var conflicts: Position, Size. Inlined enterGroup, leaveGroup */ trait GroupShape
  extends Shape
     with XShapes {
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

