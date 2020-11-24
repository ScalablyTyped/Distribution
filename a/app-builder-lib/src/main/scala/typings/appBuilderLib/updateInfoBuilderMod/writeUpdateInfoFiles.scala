package typings.appBuilderLib.updateInfoBuilderMod

import typings.appBuilderLib.packagerMod.Packager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/publish/updateInfoBuilder", "writeUpdateInfoFiles")
@js.native
object writeUpdateInfoFiles extends js.Object {
  
  def apply(updateInfoFileTasks: js.Array[UpdateInfoFileTask], packager: Packager): js.Promise[Unit] = js.native
}
