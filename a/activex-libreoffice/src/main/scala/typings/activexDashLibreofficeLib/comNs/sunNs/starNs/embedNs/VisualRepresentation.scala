package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** can contain a graphical representation in an arbitrary format. */
trait VisualRepresentation extends js.Object {
  /** The data in the format specified by {@link Flavor} . */
  var Data: js.Any
  /** The format of the visual representation. */
  var Flavor: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.DataFlavor
}

object VisualRepresentation {
  @scala.inline
  def apply(Data: js.Any, Flavor: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.DataFlavor): VisualRepresentation = {
    val __obj = js.Dynamic.literal(Data = Data, Flavor = Flavor)
  
    __obj.asInstanceOf[VisualRepresentation]
  }
}

