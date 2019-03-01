package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GidGids extends js.Object {
  /**
    * Returns gid by the given groupname
    */
  def gid(groupname: java.lang.String): scala.Double
  /**
    * Returns gids the given user belongs
    */
  def gids(username: java.lang.String): js.Array[scala.Double]
  /**
    * Returns groupname by the given gid
    */
  def groupname(gid: scala.Double): java.lang.String
  /**
    * Returns uid by the given username
    */
  def uid(username: java.lang.String): Anon_GidUidNumber
  /**
    * Returns username by the given uid
    */
  def username(uid: scala.Double): java.lang.String
}

object Anon_GidGids {
  @scala.inline
  def apply(
    gid: js.Function1[java.lang.String, scala.Double],
    gids: js.Function1[java.lang.String, js.Array[scala.Double]],
    groupname: js.Function1[scala.Double, java.lang.String],
    uid: js.Function1[java.lang.String, Anon_GidUidNumber],
    username: js.Function1[scala.Double, java.lang.String]
  ): Anon_GidGids = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("gid")(gid)
    __obj.updateDynamic("gids")(gids)
    __obj.updateDynamic("groupname")(groupname)
    __obj.updateDynamic("uid")(uid)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_GidGids]
  }
}

