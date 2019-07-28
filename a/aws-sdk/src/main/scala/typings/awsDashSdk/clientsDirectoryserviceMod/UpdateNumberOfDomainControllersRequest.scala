package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateNumberOfDomainControllersRequest extends js.Object {
  /**
    * The number of domain controllers desired in the directory.
    */
  var DesiredNumber: DesiredNumberOfDomainControllers
  /**
    * Identifier of the directory to which the domain controllers will be added or removed.
    */
  var DirectoryId: typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId
}

object UpdateNumberOfDomainControllersRequest {
  @scala.inline
  def apply(DesiredNumber: DesiredNumberOfDomainControllers, DirectoryId: DirectoryId): UpdateNumberOfDomainControllersRequest = {
    val __obj = js.Dynamic.literal(DesiredNumber = DesiredNumber, DirectoryId = DirectoryId)
  
    __obj.asInstanceOf[UpdateNumberOfDomainControllersRequest]
  }
}

