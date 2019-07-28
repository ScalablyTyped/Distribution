package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUICustomizationResponse extends js.Object {
  /**
    * The UI customization information.
    */
  var UICustomization: UICustomizationType
}

object GetUICustomizationResponse {
  @scala.inline
  def apply(UICustomization: UICustomizationType): GetUICustomizationResponse = {
    val __obj = js.Dynamic.literal(UICustomization = UICustomization)
  
    __obj.asInstanceOf[GetUICustomizationResponse]
  }
}

