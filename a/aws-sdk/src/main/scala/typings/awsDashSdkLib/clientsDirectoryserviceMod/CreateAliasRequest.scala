package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAliasRequest extends js.Object {
  /**
    * The requested alias. The alias must be unique amongst all aliases in AWS. This operation throws an EntityAlreadyExistsException error if the alias already exists.
    */
  var Alias: AliasName
  /**
    * The identifier of the directory for which to create the alias.
    */
  var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryId
}

object CreateAliasRequest {
  @scala.inline
  def apply(Alias: AliasName, DirectoryId: DirectoryId): CreateAliasRequest = {
    val __obj = js.Dynamic.literal(Alias = Alias, DirectoryId = DirectoryId)
  
    __obj.asInstanceOf[CreateAliasRequest]
  }
}

