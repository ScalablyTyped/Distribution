package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceIdentity extends js.Object {
  /**
    * A description of an EC2 instance that is generated when the instance is launched and exposed to the instance via the instance metadata service in the form of a JSON representation of an object.
    */
  var document: js.UndefOr[String] = js.native
  /**
    * A signature which can be used to verify the accuracy and authenticity of the information provided in the instance identity document.
    */
  var signature: js.UndefOr[String] = js.native
}

object InstanceIdentity {
  @scala.inline
  def apply(document: String = null, signature: String = null): InstanceIdentity = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceIdentity]
  }
}

