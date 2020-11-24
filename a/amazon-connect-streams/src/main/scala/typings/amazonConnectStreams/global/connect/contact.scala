package typings.amazonConnectStreams.global.connect

import typings.amazonConnectStreams.connect.ContactCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("connect.contact")
@js.native
object contact extends js.Object {
  
  /**
    * Subscribe a method to be called for each newly detected agent contact.
    * Note that this function is not only for incoming contacts, but for contacts which already existed when Streams was initialized, such as from a previous agent session.
    * This callback is provided with a `Contact` API object for this contact. `Contact` API objects can also be listed from the `Agent` API by calling `agent.getContacts()`.
    *
    * @param callback A callback that will receive an `Contact` API object instance.
    */
  def apply(callback: ContactCallback): Unit = js.native
}
