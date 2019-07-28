package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCloudFrontOriginAccessIdentityRequest extends js.Object {
  /**
    * The identity's ID.
    */
  var Id: String
}

object GetCloudFrontOriginAccessIdentityRequest {
  @scala.inline
  def apply(Id: String): GetCloudFrontOriginAccessIdentityRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[GetCloudFrontOriginAccessIdentityRequest]
  }
}

