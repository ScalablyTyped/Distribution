package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** controls a presentation directly. This supplier will do this. */
trait XPresentationSupplier
  extends StObject
     with XInterface {
  
  /** @returns an interface to control a presentation. */
  val Presentation: XPresentation
  
  /** @returns an interface to control a presentation. */
  def getPresentation(): XPresentation
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
  implicit class XPresentationSupplierMutableBuilder[Self <: XPresentationSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPresentation(value: () => XPresentation): Self = StObject.set(x, "getPresentation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPresentation(value: XPresentation): Self = StObject.set(x, "Presentation", value.asInstanceOf[js.Any])
  }
}
