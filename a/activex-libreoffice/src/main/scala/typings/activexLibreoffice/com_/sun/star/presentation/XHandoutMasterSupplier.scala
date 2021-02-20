package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.drawing.XDrawPage
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** returns the handout master page for this document */
@js.native
trait XHandoutMasterSupplier extends XInterface {
  
  /** returns the {@link DrawPage} . */
  val HandoutMasterPage: XDrawPage = js.native
  
  /** returns the {@link DrawPage} . */
  def getHandoutMasterPage(): XDrawPage = js.native
}
object XHandoutMasterSupplier {
  
  @scala.inline
  def apply(
    HandoutMasterPage: XDrawPage,
    acquire: () => Unit,
    getHandoutMasterPage: () => XDrawPage,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XHandoutMasterSupplier = {
    val __obj = js.Dynamic.literal(HandoutMasterPage = HandoutMasterPage.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getHandoutMasterPage = js.Any.fromFunction0(getHandoutMasterPage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XHandoutMasterSupplier]
  }
  
  @scala.inline
  implicit class XHandoutMasterSupplierMutableBuilder[Self <: XHandoutMasterSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetHandoutMasterPage(value: () => XDrawPage): Self = StObject.set(x, "getHandoutMasterPage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandoutMasterPage(value: XDrawPage): Self = StObject.set(x, "HandoutMasterPage", value.asInstanceOf[js.Any])
  }
}
