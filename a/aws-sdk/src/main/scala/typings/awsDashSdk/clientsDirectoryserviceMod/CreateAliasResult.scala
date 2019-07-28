package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAliasResult extends js.Object {
  /**
    * The alias for the directory.
    */
  var Alias: js.UndefOr[AliasName] = js.undefined
  /**
    * The identifier of the directory.
    */
  var DirectoryId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId] = js.undefined
}

object CreateAliasResult {
  @scala.inline
  def apply(Alias: AliasName = null, DirectoryId: DirectoryId = null): CreateAliasResult = {
    val __obj = js.Dynamic.literal()
    if (Alias != null) __obj.updateDynamic("Alias")(Alias)
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId)
    __obj.asInstanceOf[CreateAliasResult]
  }
}

