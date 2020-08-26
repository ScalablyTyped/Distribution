package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the collection of all embedded and linked graphics within this context (i.e. within this document). */
@js.native
trait XTextGraphicObjectsSupplier extends XInterface {
  /** @returns the collection of graphic objects in this object (document). */
  val GraphicObjects: XNameAccess = js.native
  /** @returns the collection of graphic objects in this object (document). */
  def getGraphicObjects(): XNameAccess = js.native
}

object XTextGraphicObjectsSupplier {
  @scala.inline
  def apply(
    GraphicObjects: XNameAccess,
    acquire: () => Unit,
    getGraphicObjects: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextGraphicObjectsSupplier = {
    val __obj = js.Dynamic.literal(GraphicObjects = GraphicObjects.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getGraphicObjects = js.Any.fromFunction0(getGraphicObjects), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextGraphicObjectsSupplier]
  }
  @scala.inline
  implicit class XTextGraphicObjectsSupplierOps[Self <: XTextGraphicObjectsSupplier] (val x: Self) extends AnyVal {
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
    def setGraphicObjects(value: XNameAccess): Self = this.set("GraphicObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetGraphicObjects(value: () => XNameAccess): Self = this.set("getGraphicObjects", js.Any.fromFunction0(value))
  }
  
}

