package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Gid extends js.Object {
  var gid: js.UndefOr[Double] = js.undefined
  var uid: js.UndefOr[Double] = js.undefined
}

object Anon_Gid {
  @scala.inline
  def apply(gid: Int | Double = null, uid: Int | Double = null): Anon_Gid = {
    val __obj = js.Dynamic.literal()
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Gid]
  }
}

