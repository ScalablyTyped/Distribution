package typings
package aliDashOssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Etag extends js.Object {
  var etag: java.lang.String
  var number: scala.Double
}

object Anon_Etag {
  @scala.inline
  def apply(etag: java.lang.String, number: scala.Double): Anon_Etag = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("etag")(etag)
    __obj.updateDynamic("number")(number)
    __obj.asInstanceOf[Anon_Etag]
  }
}

