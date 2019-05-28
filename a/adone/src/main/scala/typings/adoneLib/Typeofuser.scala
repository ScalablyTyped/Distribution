package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofuser extends js.Object {
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
  def uid(username: java.lang.String): Anon_GidUid
  /**
    * Returns username by the given uid
    */
  def username(uid: scala.Double): java.lang.String
}

object Typeofuser {
  @scala.inline
  def apply(
    gid: java.lang.String => scala.Double,
    gids: java.lang.String => js.Array[scala.Double],
    groupname: scala.Double => java.lang.String,
    uid: java.lang.String => Anon_GidUid,
    username: scala.Double => java.lang.String
  ): Typeofuser = {
    val __obj = js.Dynamic.literal(gid = js.Any.fromFunction1(gid), gids = js.Any.fromFunction1(gids), groupname = js.Any.fromFunction1(groupname), uid = js.Any.fromFunction1(uid), username = js.Any.fromFunction1(username))
  
    __obj.asInstanceOf[Typeofuser]
  }
}

