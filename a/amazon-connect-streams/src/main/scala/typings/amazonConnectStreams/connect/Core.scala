package typings.amazonConnectStreams.connect

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Core extends js.Object {
  
  /**
    * Integrates with Amazon Connect by loading the pre-built CCP located at `ccpUrl` into an iframe and placing it into the `container` provided.
    * API requests are funneled through this CCP and agent and contact updates are published through it and made available to your JS client code.
    *
    * @param container The DOM element to place the CCP.
    * @param options The CCP init options.
    */
  def initCCP(container: HTMLElement, options: InitCCPOptions): Unit = js.native
  
  /**
    * Subscribes a callback that executes whenever authorization fails (i.e. access denied).
    *
    * @param callback A callback that will execute whenever access is denied.
    */
  def onAccessDenied(callback: SuccessFailCallback[js.Array[js.Any]]): Unit = js.native
  
  /**
    * Subscribes a callback that executes whenever authentication fails (e.g. SAML authentication).
    *
    * @param callback A callback that will execute whenever authentication fails.
    */
  def onAuthFail(callback: SuccessFailCallback[js.Array[js.Any]]): Unit = js.native
  
  /**
    * Subscribes a callback that executes whenever the currently selected contact on the CCP changes.
    * The callback is called when the contact changes in the UI (i.e. via `click` events) or via `connect.core.viewContact()`.
    *
    * @param callback A callback that will receive a `ViewContactEvent` object.
    */
  def onViewContact(callback: ViewContactCallback): Unit = js.native
  
  /**
    * Terminates Amazon Connect Streams. Removing any subscription methods that have been called.
    * The CCP iframe will not be removed though, so you'll have to manually remove it.
    */
  def terminate(): Unit = js.native
  
  /**
    * Changes the currently selected contact in the CCP user interface.
    * Useful when an agent handles more than one concurrent chat.
    *
    * @param contactId The contact ID.
    */
  def viewContact(contactId: String): Unit = js.native
}
object Core {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class CoreOps[Self <: Core] (val x: Self) extends AnyVal {
    
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
    def setInitCCP(value: (HTMLElement, InitCCPOptions) => Unit): Self = this.set("initCCP", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnAccessDenied(value: SuccessFailCallback[js.Array[js.Any]] => Unit): Self = this.set("onAccessDenied", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAuthFail(value: SuccessFailCallback[js.Array[js.Any]] => Unit): Self = this.set("onAuthFail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnViewContact(value: ViewContactCallback => Unit): Self = this.set("onViewContact", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTerminate(value: () => Unit): Self = this.set("terminate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setViewContact(value: String => Unit): Self = this.set("viewContact", js.Any.fromFunction1(value))
  }
}
