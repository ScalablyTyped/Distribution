package typings.activexLibreoffice.com_.sun.star.xforms

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to the {@link XForms} models contained in the component */
@js.native
trait XFormsSupplier extends XInterface {
  
  /**
    * access {@link XForms} model container.
    * @returns a container for the {@link XForms} models contained in the component
    */
  val XForms: XNameContainer = js.native
  
  /**
    * access {@link XForms} model container.
    * @returns a container for the {@link XForms} models contained in the component
    */
  def getXForms(): XNameContainer = js.native
}
object XFormsSupplier {
  
  @scala.inline
  def apply(
    XForms: XNameContainer,
    acquire: () => Unit,
    getXForms: () => XNameContainer,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFormsSupplier = {
    val __obj = js.Dynamic.literal(XForms = XForms.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getXForms = js.Any.fromFunction0(getXForms), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFormsSupplier]
  }
  
  @scala.inline
  implicit class XFormsSupplierOps[Self <: XFormsSupplier] (val x: Self) extends AnyVal {
    
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
    def setXForms(value: XNameContainer): Self = this.set("XForms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetXForms(value: () => XNameContainer): Self = this.set("getXForms", js.Any.fromFunction0(value))
  }
}
