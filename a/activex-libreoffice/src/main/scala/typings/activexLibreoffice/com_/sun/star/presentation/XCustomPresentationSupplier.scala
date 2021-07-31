package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * must be supported to provide access to customized presentations of a presentation document.
  * @see XCustomPresentation
  * @see XCustomPresentationAccess
  */
trait XCustomPresentationSupplier
  extends StObject
     with XInterface {
  
  /** @returns the {@link CustomPresentation} . */
  val CustomPresentations: XNameContainer
  
  /** @returns the {@link CustomPresentation} . */
  def getCustomPresentations(): XNameContainer
}
object XCustomPresentationSupplier {
  
  @scala.inline
  def apply(
    CustomPresentations: XNameContainer,
    acquire: () => Unit,
    getCustomPresentations: () => XNameContainer,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCustomPresentationSupplier = {
    val __obj = js.Dynamic.literal(CustomPresentations = CustomPresentations.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCustomPresentations = js.Any.fromFunction0(getCustomPresentations), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCustomPresentationSupplier]
  }
  
  @scala.inline
  implicit class XCustomPresentationSupplierMutableBuilder[Self <: XCustomPresentationSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomPresentations(value: XNameContainer): Self = StObject.set(x, "CustomPresentations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCustomPresentations(value: () => XNameContainer): Self = StObject.set(x, "getCustomPresentations", js.Any.fromFunction0(value))
  }
}
