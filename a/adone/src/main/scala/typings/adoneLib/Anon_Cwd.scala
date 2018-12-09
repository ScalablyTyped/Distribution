package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Cwd extends js.Object {
  /**
               * cwd to use
               */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The delay to wait between busy tries
               */
  var emfileWait: js.UndefOr[scala.Double] = js.undefined
  /**
               * Whether to consider the given path as a glob pattern
               */
  var glob: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Maximum busy tries, errors when cannot remove a file due to EBUSY, ENOTEMPTY, EPERM
               */
  var maxBusyTries: js.UndefOr[scala.Double] = js.undefined
}

