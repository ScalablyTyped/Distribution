package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceIdentity extends js.Object {
  /**
    * A JSON document that contains the metadata.
    */
  var Document: js.UndefOr[String] = js.undefined
  /**
    * A signature that can be used to verify the document's accuracy and authenticity.
    */
  var Signature: js.UndefOr[String] = js.undefined
}

object InstanceIdentity {
  @scala.inline
  def apply(Document: String = null, Signature: String = null): InstanceIdentity = {
    val __obj = js.Dynamic.literal()
    if (Document != null) __obj.updateDynamic("Document")(Document)
    if (Signature != null) __obj.updateDynamic("Signature")(Signature)
    __obj.asInstanceOf[InstanceIdentity]
  }
}

