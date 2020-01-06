package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceIdentity extends js.Object {
  /**
    * A JSON document that contains the metadata.
    */
  var Document: js.UndefOr[String] = js.native
  /**
    * A signature that can be used to verify the document's accuracy and authenticity.
    */
  var Signature: js.UndefOr[String] = js.native
}

object InstanceIdentity {
  @scala.inline
  def apply(Document: String = null, Signature: String = null): InstanceIdentity = {
    val __obj = js.Dynamic.literal()
    if (Document != null) __obj.updateDynamic("Document")(Document.asInstanceOf[js.Any])
    if (Signature != null) __obj.updateDynamic("Signature")(Signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceIdentity]
  }
}

