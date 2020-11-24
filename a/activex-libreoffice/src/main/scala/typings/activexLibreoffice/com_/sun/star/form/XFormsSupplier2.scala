package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** extends the {@link XFormsSupplier} with convenience methods */
@js.native
trait XFormsSupplier2 extends XFormsSupplier {
  
  /**
    * determines whether there are currently forms available at all
    *
    * If you need read access to the forms collection, then you might check the existence of forms using {@link hasForms()} , and if it returns `FALSE` ,
    * you can do as if {@link XFormsSupplier.getForms()} would have returned an empty container.
    *
    * Semantically, {@link hasForms()} is equivalent to calling XElementAccess::hasElements() on the container returned by {@link XFormsSupplier.getForms()}
    * . But when using the latter, the implementation is forced to create a empty container, which might be potentially expensive.
    */
  def hasForms(): Boolean = js.native
}
object XFormsSupplier2 {
  
  @scala.inline
  def apply(
    Forms: XNameContainer,
    acquire: () => Unit,
    getForms: () => XNameContainer,
    hasForms: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFormsSupplier2 = {
    val __obj = js.Dynamic.literal(Forms = Forms.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getForms = js.Any.fromFunction0(getForms), hasForms = js.Any.fromFunction0(hasForms), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFormsSupplier2]
  }
  
  @scala.inline
  implicit class XFormsSupplier2Ops[Self <: XFormsSupplier2] (val x: Self) extends AnyVal {
    
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
    def setHasForms(value: () => Boolean): Self = this.set("hasForms", js.Any.fromFunction0(value))
  }
}
