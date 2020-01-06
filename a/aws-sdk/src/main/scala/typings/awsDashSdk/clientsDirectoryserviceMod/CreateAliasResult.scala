package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAliasResult extends js.Object {
  /**
    * The alias for the directory.
    */
  var Alias: js.UndefOr[AliasName] = js.native
  /**
    * The identifier of the directory.
    */
  var DirectoryId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId] = js.native
}

object CreateAliasResult {
  @scala.inline
  def apply(Alias: AliasName = null, DirectoryId: DirectoryId = null): CreateAliasResult = {
    val __obj = js.Dynamic.literal()
    if (Alias != null) __obj.updateDynamic("Alias")(Alias.asInstanceOf[js.Any])
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAliasResult]
  }
}

