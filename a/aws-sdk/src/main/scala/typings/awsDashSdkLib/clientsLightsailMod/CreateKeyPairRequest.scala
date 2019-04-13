package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateKeyPairRequest extends js.Object {
  /**
    * The name for your new key pair.
    */
  var keyPairName: ResourceName
  /**
    * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object CreateKeyPairRequest {
  @scala.inline
  def apply(keyPairName: ResourceName, tags: TagList = null): CreateKeyPairRequest = {
    val __obj = js.Dynamic.literal(keyPairName = keyPairName)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateKeyPairRequest]
  }
}

