package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CwdFilename extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[js.Function1[/* filename */ String, Boolean]] = js.undefined
}

object Anon_CwdFilename {
  @scala.inline
  def apply(cwd: String = null, filter: /* filename */ String => Boolean = null): Anon_CwdFilename = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    __obj.asInstanceOf[Anon_CwdFilename]
  }
}

