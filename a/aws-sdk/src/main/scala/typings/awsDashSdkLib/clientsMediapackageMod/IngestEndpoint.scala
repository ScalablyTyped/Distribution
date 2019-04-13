package typings
package awsDashSdkLib.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IngestEndpoint extends js.Object {
  /**
    * The system generated unique identifier for the IngestEndpoint
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * The system generated password for ingest authentication.
    */
  var Password: js.UndefOr[__string] = js.undefined
  /**
    * The ingest URL to which the source stream should be sent.
    */
  var Url: js.UndefOr[__string] = js.undefined
  /**
    * The system generated username for ingest authentication.
    */
  var Username: js.UndefOr[__string] = js.undefined
}

object IngestEndpoint {
  @scala.inline
  def apply(Id: __string = null, Password: __string = null, Url: __string = null, Username: __string = null): IngestEndpoint = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Password != null) __obj.updateDynamic("Password")(Password)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    if (Username != null) __obj.updateDynamic("Username")(Username)
    __obj.asInstanceOf[IngestEndpoint]
  }
}

