package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CwdFilename extends js.Object {
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var filter: js.UndefOr[js.Function1[/* filename */ java.lang.String, scala.Boolean]] = js.undefined
}

object Anon_CwdFilename {
  @scala.inline
  def apply(cwd: java.lang.String = null, filter: /* filename */ java.lang.String => scala.Boolean = null): Anon_CwdFilename = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    __obj.asInstanceOf[Anon_CwdFilename]
  }
}

