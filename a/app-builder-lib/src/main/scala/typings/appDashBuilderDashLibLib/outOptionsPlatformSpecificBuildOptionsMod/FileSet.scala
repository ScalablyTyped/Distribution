package typings
package appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSet extends js.Object {
  /**
    * The [glob patterns](/file-patterns).
    */
  var filter: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  /**
    * The source path relative to the project directory.
    */
  var from: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The destination path relative to the app's content directory for `extraFiles` and the app's resource directory for `extraResources`.
    */
  var to: js.UndefOr[java.lang.String] = js.undefined
}

object FileSet {
  @scala.inline
  def apply(
    filter: js.Array[java.lang.String] | java.lang.String = null,
    from: java.lang.String = null,
    to: java.lang.String = null
  ): FileSet = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[FileSet]
  }
}

