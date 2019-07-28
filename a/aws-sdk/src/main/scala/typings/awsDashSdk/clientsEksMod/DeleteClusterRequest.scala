package typings.awsDashSdk.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteClusterRequest extends js.Object {
  /**
    * The name of the cluster to delete.
    */
  var name: String
}

object DeleteClusterRequest {
  @scala.inline
  def apply(name: String): DeleteClusterRequest = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[DeleteClusterRequest]
  }
}

