package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A layer is an entity inside a document which contains shapes.
  *
  * There could be zero or more {@link Shapes} attached to such a layer.
  *
  * The properties of a {@link Layer} instance affect all {@link Shapes} attached to the {@link Layer} .
  * @see DrawingDocument
  * @see LayerManager
  */
trait Layer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** If a {@link Layer} is locked, the objects in this {@link Layer} cannot be edited in the user interface. */
  var IsLocked: scala.Boolean
  /** If a {@link Layer} is not printable, the objects in this {@link Layer} are not printed. */
  var IsPrintable: scala.Boolean
  /** If a {@link Layer} is not visible, the objects in this {@link Layer} are not shown in the user interface. */
  var IsVisible: scala.Boolean
  /** The name of a {@link Layer} is used to identify the {@link Layer} in the user interface. */
  var Name: java.lang.String
}

