package typings.amazonConnectStreams.global.connect

import typings.amazonConnectStreams.connect.Contact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Contact API provides event subscription methods and action methods which can be called on behalf of a specific contact.
  * Contacts come and go and so should these API objects.
  * It is good practice not to persist these objects or keep them as internal state.
  * If you need to, store the `contactId` of the contact and make sure that the contact still exists by fetching it from the `Agent` API object before calling methods on it.
  */
@JSGlobal("connect.Contact")
@js.native
class Contact_ () extends Contact

