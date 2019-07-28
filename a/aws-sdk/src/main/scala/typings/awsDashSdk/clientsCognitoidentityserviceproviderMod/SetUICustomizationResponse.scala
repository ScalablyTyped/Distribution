package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetUICustomizationResponse extends js.Object {
  /**
    * The UI customization information.
    */
  var UICustomization: UICustomizationType
}

object SetUICustomizationResponse {
  @scala.inline
  def apply(UICustomization: UICustomizationType): SetUICustomizationResponse = {
    val __obj = js.Dynamic.literal(UICustomization = UICustomization)
  
    __obj.asInstanceOf[SetUICustomizationResponse]
  }
}

