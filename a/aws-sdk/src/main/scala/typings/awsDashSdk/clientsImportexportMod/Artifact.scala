package typings.awsDashSdk.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Artifact extends js.Object {
  var Description: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.Description] = js.undefined
  var URL: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.URL] = js.undefined
}

object Artifact {
  @scala.inline
  def apply(Description: Description = null, URL: URL = null): Artifact = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (URL != null) __obj.updateDynamic("URL")(URL)
    __obj.asInstanceOf[Artifact]
  }
}

