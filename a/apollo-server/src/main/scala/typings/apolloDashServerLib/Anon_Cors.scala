package typings
package apolloDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cors extends js.Object {
  var cors: js.UndefOr[corsLib.corsMod.CorsOptions | scala.Boolean] = js.undefined
}

object Anon_Cors {
  @scala.inline
  def apply(cors: corsLib.corsMod.CorsOptions | scala.Boolean = null): Anon_Cors = {
    val __obj = js.Dynamic.literal()
    if (cors != null) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cors]
  }
}

