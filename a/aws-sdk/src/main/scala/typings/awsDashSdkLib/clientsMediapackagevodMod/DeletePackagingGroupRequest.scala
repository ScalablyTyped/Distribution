package typings
package awsDashSdkLib.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePackagingGroupRequest extends js.Object {
  /**
    * The ID of the MediaPackage VOD PackagingGroup resource to delete.
    */
  var Id: __string
}

object DeletePackagingGroupRequest {
  @scala.inline
  def apply(Id: __string): DeletePackagingGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[DeletePackagingGroupRequest]
  }
}

