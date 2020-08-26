package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents something that provides an embedded object. */
@js.native
trait XEmbeddedObjectSupplier extends XInterface {
  /** returns the object which is embedded into this object. */
  val EmbeddedObject: XComponent = js.native
  /** returns the object which is embedded into this object. */
  def getEmbeddedObject(): XComponent = js.native
}

object XEmbeddedObjectSupplier {
  @scala.inline
  def apply(
    EmbeddedObject: XComponent,
    acquire: () => Unit,
    getEmbeddedObject: () => XComponent,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEmbeddedObjectSupplier = {
    val __obj = js.Dynamic.literal(EmbeddedObject = EmbeddedObject.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEmbeddedObject = js.Any.fromFunction0(getEmbeddedObject), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEmbeddedObjectSupplier]
  }
  @scala.inline
  implicit class XEmbeddedObjectSupplierOps[Self <: XEmbeddedObjectSupplier] (val x: Self) extends AnyVal {
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
    def setEmbeddedObject(value: XComponent): Self = this.set("EmbeddedObject", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetEmbeddedObject(value: () => XComponent): Self = this.set("getEmbeddedObject", js.Any.fromFunction0(value))
  }
  
}

