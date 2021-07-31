package typings.activexLibreoffice.com_.sun.star.bridge

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Concrete service of the meta service {@link Bridge} for the urp protocol.
  *
  * This bridge works with the urp protocol.
  * @see com.sun.star.bridge.Bridge
  */
trait UrpBridge
  extends StObject
     with XInitialization
     with XBridge
     with XComponent
object UrpBridge {
  
  @scala.inline
  def apply(
    Description: String,
    Name: String,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    getDescription: () => String,
    getInstance: String => XInterface,
    getName: () => String,
    initialize: SeqEquiv[js.Any] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): UrpBridge = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getDescription = js.Any.fromFunction0(getDescription), getInstance = js.Any.fromFunction1(getInstance), getName = js.Any.fromFunction0(getName), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[UrpBridge]
  }
}
