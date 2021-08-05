package typings.amazonConnectStreams.connect

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Core extends StObject {
  
  /**
    * Integrates with Amazon Connect by loading the pre-built CCP located at `ccpUrl` into an iframe and placing it into the `container` provided.
    * API requests are funneled through this CCP and agent and contact updates are published through it and made available to your JS client code.
    *
    * @param container The DOM element to place the CCP.
    * @param options The CCP init options.
    */
  def initCCP(container: HTMLElement, options: InitCCPOptions): Unit
  
  /**
    * Subscribes a callback that executes whenever authorization fails (i.e. access denied).
    *
    * @param callback A callback that will execute whenever access is denied.
    */
  def onAccessDenied(callback: SuccessFailCallback[js.Array[js.Any]]): Unit
  
  /**
    * Subscribes a callback that executes whenever authentication fails (e.g. SAML authentication).
    *
    * @param callback A callback that will execute whenever authentication fails.
    */
  def onAuthFail(callback: SuccessFailCallback[js.Array[js.Any]]): Unit
  
  /**
    * Subscribes a callback that executes whenever the currently selected contact on the CCP changes.
    * The callback is called when the contact changes in the UI (i.e. via `click` events) or via `connect.core.viewContact()`.
    *
    * @param callback A callback that will receive a `ViewContactEvent` object.
    */
  def onViewContact(callback: ViewContactCallback): Unit
  
  /**
    * Terminates Amazon Connect Streams. Removing any subscription methods that have been called.
    * The CCP iframe will not be removed though, so you'll have to manually remove it.
    */
  def terminate(): Unit
  
  /**
    * Changes the currently selected contact in the CCP user interface.
    * Useful when an agent handles more than one concurrent chat.
    *
    * @param contactId The contact ID.
    */
  def viewContact(contactId: String): Unit
}
object Core {
  
  inline def apply(
    initCCP: (HTMLElement, InitCCPOptions) => Unit,
    onAccessDenied: SuccessFailCallback[js.Array[js.Any]] => Unit,
    onAuthFail: SuccessFailCallback[js.Array[js.Any]] => Unit,
    onViewContact: ViewContactCallback => Unit,
    terminate: () => Unit,
    viewContact: String => Unit
  ): Core = {
    val __obj = js.Dynamic.literal(initCCP = js.Any.fromFunction2(initCCP), onAccessDenied = js.Any.fromFunction1(onAccessDenied), onAuthFail = js.Any.fromFunction1(onAuthFail), onViewContact = js.Any.fromFunction1(onViewContact), terminate = js.Any.fromFunction0(terminate), viewContact = js.Any.fromFunction1(viewContact))
    __obj.asInstanceOf[Core]
  }
  
  extension [Self <: Core](x: Self) {
    
    inline def setInitCCP(value: (HTMLElement, InitCCPOptions) => Unit): Self = StObject.set(x, "initCCP", js.Any.fromFunction2(value))
    
    inline def setOnAccessDenied(value: SuccessFailCallback[js.Array[js.Any]] => Unit): Self = StObject.set(x, "onAccessDenied", js.Any.fromFunction1(value))
    
    inline def setOnAuthFail(value: SuccessFailCallback[js.Array[js.Any]] => Unit): Self = StObject.set(x, "onAuthFail", js.Any.fromFunction1(value))
    
    inline def setOnViewContact(value: ViewContactCallback => Unit): Self = StObject.set(x, "onViewContact", js.Any.fromFunction1(value))
    
    inline def setTerminate(value: () => Unit): Self = StObject.set(x, "terminate", js.Any.fromFunction0(value))
    
    inline def setViewContact(value: String => Unit): Self = StObject.set(x, "viewContact", js.Any.fromFunction1(value))
  }
}
