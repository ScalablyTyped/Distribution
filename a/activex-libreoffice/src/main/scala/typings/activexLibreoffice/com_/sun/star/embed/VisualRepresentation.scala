package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.com_.sun.star.datatransfer.DataFlavor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** can contain a graphical representation in an arbitrary format. */
@js.native
trait VisualRepresentation extends js.Object {
  /** The data in the format specified by {@link Flavor} . */
  var Data: js.Any = js.native
  /** The format of the visual representation. */
  var Flavor: DataFlavor = js.native
}

object VisualRepresentation {
  @scala.inline
  def apply(Data: js.Any, Flavor: DataFlavor): VisualRepresentation = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Flavor = Flavor.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualRepresentation]
  }
  @scala.inline
  implicit class VisualRepresentationOps[Self <: VisualRepresentation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: js.Any): Self = this.set("Data", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlavor(value: DataFlavor): Self = this.set("Flavor", value.asInstanceOf[js.Any])
  }
  
}

