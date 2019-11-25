package typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod

import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.Editor
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.None
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.Shell
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.Viewer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Protocol extends js.Object {
  /**
    * The name. e.g. `IRC server URL`.
    */
  val name: String
  /**
    * *macOS-only* The app’s role with respect to the type.
    * @default Editor
    */
  val role: js.UndefOr[Editor | Viewer | Shell | None] = js.undefined
  /**
    * The schemes. e.g. `["irc", "ircs"]`.
    */
  val schemes: js.Array[String]
}

object Protocol {
  @scala.inline
  def apply(name: String, schemes: js.Array[String], role: Editor | Viewer | Shell | None = null): Protocol = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], schemes = schemes.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Protocol]
  }
}

