package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Retries extends js.Object {
  /**
               * Will retry after this delay
               */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
               * Will retry if fails with EPERM or EACCESS errors
               */
  var retries: js.UndefOr[scala.Double] = js.undefined
}

