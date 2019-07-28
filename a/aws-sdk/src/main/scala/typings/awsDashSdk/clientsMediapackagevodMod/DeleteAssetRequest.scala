package typings.awsDashSdk.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAssetRequest extends js.Object {
  /**
    * The ID of the MediaPackage VOD Asset resource to delete.
    */
  var Id: __string
}

object DeleteAssetRequest {
  @scala.inline
  def apply(Id: __string): DeleteAssetRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[DeleteAssetRequest]
  }
}

