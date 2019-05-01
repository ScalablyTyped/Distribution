package typings
package awsDashSdkLib.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPublicAccessBlockOutput extends js.Object {
  /**
    * 
    */
  var PublicAccessBlockConfiguration: js.UndefOr[PublicAccessBlockConfiguration] = js.undefined
}

object GetPublicAccessBlockOutput {
  @scala.inline
  def apply(PublicAccessBlockConfiguration: PublicAccessBlockConfiguration = null): GetPublicAccessBlockOutput = {
    val __obj = js.Dynamic.literal()
    if (PublicAccessBlockConfiguration != null) __obj.updateDynamic("PublicAccessBlockConfiguration")(PublicAccessBlockConfiguration)
    __obj.asInstanceOf[GetPublicAccessBlockOutput]
  }
}

