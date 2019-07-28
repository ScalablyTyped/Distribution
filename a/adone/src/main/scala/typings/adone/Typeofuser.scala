package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofuser extends js.Object {
  /**
    * Returns gid by the given groupname
    */
  def gid(groupname: String): Double
  /**
    * Returns gids the given user belongs
    */
  def gids(username: String): js.Array[Double]
  /**
    * Returns groupname by the given gid
    */
  def groupname(gid: Double): String
  /**
    * Returns uid by the given username
    */
  def uid(username: String): Anon_GidUid
  /**
    * Returns username by the given uid
    */
  def username(uid: Double): String
}

object Typeofuser {
  @scala.inline
  def apply(
    gid: String => Double,
    gids: String => js.Array[Double],
    groupname: Double => String,
    uid: String => Anon_GidUid,
    username: Double => String
  ): Typeofuser = {
    val __obj = js.Dynamic.literal(gid = js.Any.fromFunction1(gid), gids = js.Any.fromFunction1(gids), groupname = js.Any.fromFunction1(groupname), uid = js.Any.fromFunction1(uid), username = js.Any.fromFunction1(username))
  
    __obj.asInstanceOf[Typeofuser]
  }
}

