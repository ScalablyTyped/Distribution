package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCloudFrontOriginAccessIdentityConfigRequest extends js.Object {
  /**
    * The identity's ID. 
    */
  var Id: String
}

object GetCloudFrontOriginAccessIdentityConfigRequest {
  @scala.inline
  def apply(Id: String): GetCloudFrontOriginAccessIdentityConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[GetCloudFrontOriginAccessIdentityConfigRequest]
  }
}

