package typings.activexLibreoffice.com_.sun.star.style

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface provides access to the style families within the container document. */
@js.native
trait XStyleFamiliesSupplier extends XInterface {
  
  /**
    * This method returns the collection of style families available in the container document.
    * @see StyleFamilies
    */
  val StyleFamilies: XNameAccess = js.native
  
  /**
    * This method returns the collection of style families available in the container document.
    * @see StyleFamilies
    */
  def getStyleFamilies(): XNameAccess = js.native
}
object XStyleFamiliesSupplier {
  
  @scala.inline
  def apply(
    StyleFamilies: XNameAccess,
    acquire: () => Unit,
    getStyleFamilies: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStyleFamiliesSupplier = {
    val __obj = js.Dynamic.literal(StyleFamilies = StyleFamilies.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getStyleFamilies = js.Any.fromFunction0(getStyleFamilies), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStyleFamiliesSupplier]
  }
  
  @scala.inline
  implicit class XStyleFamiliesSupplierMutableBuilder[Self <: XStyleFamiliesSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetStyleFamilies(value: () => XNameAccess): Self = StObject.set(x, "getStyleFamilies", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStyleFamilies(value: XNameAccess): Self = StObject.set(x, "StyleFamilies", value.asInstanceOf[js.Any])
  }
}
