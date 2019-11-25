package typings.appDashBuilderDashLib.outOptionsPlatformSpecificBuildOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSet extends js.Object {
  /**
    * The [glob patterns](/file-patterns).
    */
  var filter: js.UndefOr[js.Array[String] | String] = js.undefined
  /**
    * The source path relative to the project directory.
    */
  var from: js.UndefOr[String] = js.undefined
  /**
    * The destination path relative to the app's content directory for `extraFiles` and the app's resource directory for `extraResources`.
    */
  var to: js.UndefOr[String] = js.undefined
}

object FileSet {
  @scala.inline
  def apply(filter: js.Array[String] | String = null, from: String = null, to: String = null): FileSet = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSet]
  }
}

