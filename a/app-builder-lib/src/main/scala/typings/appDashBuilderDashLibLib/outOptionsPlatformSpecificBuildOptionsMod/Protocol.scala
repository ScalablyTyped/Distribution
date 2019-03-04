package typings
package appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Protocol extends js.Object {
  /**
    * The name. e.g. `IRC server URL`.
    */
  val name: java.lang.String
  /**
    * *macOS-only* The app’s role with respect to the type.
    * @default Editor
    */
  val role: js.UndefOr[
    appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.Editor | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.Viewer | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.Shell | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.None
  ] = js.undefined
  /**
    * The schemes. e.g. `["irc", "ircs"]`.
    */
  val schemes: js.Array[java.lang.String]
}

object Protocol {
  @scala.inline
  def apply(
    name: java.lang.String,
    schemes: js.Array[java.lang.String],
    role: appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.Editor | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.Viewer | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.Shell | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.None = null
  ): Protocol = {
    val __obj = js.Dynamic.literal(name = name, schemes = schemes)
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Protocol]
  }
}

