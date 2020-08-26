package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows creating instances of the {@link DataAccessDescriptor} service.
  *
  * Data access descriptors are finally only bags of properties with a defined semantics. Depending on the context in which you use them, certain of their
  * properties are needed or unneeded. ;  The descriptor factory allows you to create instances which offer all properties potentially needed at a
  * descriptor.
  */
@js.native
trait XDataAccessDescriptorFactory extends js.Object {
  /** creates a {@link DataAccessDescriptor} which supports all properties defined for this service, even if they're normally optional only. */
  def createDataAccessDescriptor(): XPropertySet = js.native
}

object XDataAccessDescriptorFactory {
  @scala.inline
  def apply(createDataAccessDescriptor: () => XPropertySet): XDataAccessDescriptorFactory = {
    val __obj = js.Dynamic.literal(createDataAccessDescriptor = js.Any.fromFunction0(createDataAccessDescriptor))
    __obj.asInstanceOf[XDataAccessDescriptorFactory]
  }
  @scala.inline
  implicit class XDataAccessDescriptorFactoryOps[Self <: XDataAccessDescriptorFactory] (val x: Self) extends AnyVal {
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
    def setCreateDataAccessDescriptor(value: () => XPropertySet): Self = this.set("createDataAccessDescriptor", js.Any.fromFunction0(value))
  }
  
}

