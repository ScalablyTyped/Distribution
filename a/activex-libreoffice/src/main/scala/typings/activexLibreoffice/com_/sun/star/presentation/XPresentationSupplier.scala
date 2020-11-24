package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** controls a presentation directly. This supplier will do this. */
@js.native
trait XPresentationSupplier extends XInterface {
  
  /** @returns an interface to control a presentation. */
  val Presentation: XPresentation = js.native
  
  /** @returns an interface to control a presentation. */
  def getPresentation(): XPresentation = js.native
}
object XPresentationSupplier {
  
  @scala.inline
  def apply(
    Presentation: XPresentation,
    acquire: () => Unit,
    getPresentation: () => XPresentation,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPresentationSupplier = {
    val __obj = js.Dynamic.literal(Presentation = Presentation.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPresentation = js.Any.fromFunction0(getPresentation), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPresentationSupplier]
  }
  
  @scala.inline
  implicit class XPresentationSupplierOps[Self <: XPresentationSupplier] (val x: Self) extends AnyVal {
    
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
    def setPresentation(value: XPresentation): Self = this.set("Presentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPresentation(value: () => XPresentation): Self = this.set("getPresentation", js.Any.fromFunction0(value))
  }
}
