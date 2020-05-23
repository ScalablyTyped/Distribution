package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.com_.sun.star.datatransfer.DataFlavor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** can contain a graphical representation in an arbitrary format. */
trait VisualRepresentation extends js.Object {
  /** The data in the format specified by {@link Flavor} . */
  var Data: js.Any
  /** The format of the visual representation. */
  var Flavor: DataFlavor
}

object VisualRepresentation {
  @scala.inline
  def apply(Data: js.Any, Flavor: DataFlavor): VisualRepresentation = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Flavor = Flavor.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualRepresentation]
  }
}

