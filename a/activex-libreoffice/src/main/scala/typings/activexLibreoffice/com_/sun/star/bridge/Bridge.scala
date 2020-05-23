package typings.activexLibreoffice.com_.sun.star.bridge

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This meta service allows the bridgefactory service to instantiate an interprocess bridge using a certain transfer protocol.
  *
  * Components, that support a certain protocol, must have at least two service names:
  *
  * {@link com.sun.star.bridge.Bridge}arbitrary-module-path.ProtocolnameBridge
  *
  * The protocol name should be written as common servicenames, first letter is a capital letter, the rest in small letters postfixed by {@link Bridge}
  * (e.g.: `com.sun.star.bridge.UrpBridge` would be correct servicename for the "urp" protocol). However, the protocol names are compared case
  * insensitive. If there exist two services supporting the same protocol, it is arbitrary which one is chosen, so this should be omitted.
  */
trait Bridge
  extends XInitialization
     with XBridge
     with XComponent

object Bridge {
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
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): Bridge = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getDescription = js.Any.fromFunction0(getDescription), getInstance = js.Any.fromFunction1(getInstance), getName = js.Any.fromFunction0(getName), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[Bridge]
  }
}

