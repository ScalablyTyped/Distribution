package typings.awsDashSdk.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Artifact extends js.Object {
  var Description: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.Description] = js.native
  var URL: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.URL] = js.native
}

object Artifact {
  @scala.inline
  def apply(Description: Description = null, URL: URL = null): Artifact = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (URL != null) __obj.updateDynamic("URL")(URL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artifact]
  }
}

