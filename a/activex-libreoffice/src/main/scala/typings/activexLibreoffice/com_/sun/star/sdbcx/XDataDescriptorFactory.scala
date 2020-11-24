package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the creation of a descriptor for a definition object. */
@js.native
trait XDataDescriptorFactory extends XInterface {
  
  /**
    * returns a descriptor of a definition object.
    * @returns the descriptor for that kind of objects
    */
  def createDataDescriptor(): XPropertySet = js.native
}
object XDataDescriptorFactory {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createDataDescriptor: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDataDescriptorFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createDataDescriptor = js.Any.fromFunction0(createDataDescriptor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataDescriptorFactory]
  }
  
  @scala.inline
  implicit class XDataDescriptorFactoryOps[Self <: XDataDescriptorFactory] (val x: Self) extends AnyVal {
    
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
    def setCreateDataDescriptor(value: () => XPropertySet): Self = this.set("createDataDescriptor", js.Any.fromFunction0(value))
  }
}
