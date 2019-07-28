package typings.awsDashSdk.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePackagingConfigurationRequest extends js.Object {
  /**
    * The ID of the MediaPackage VOD PackagingConfiguration resource to delete.
    */
  var Id: __string
}

object DeletePackagingConfigurationRequest {
  @scala.inline
  def apply(Id: __string): DeletePackagingConfigurationRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[DeletePackagingConfigurationRequest]
  }
}

