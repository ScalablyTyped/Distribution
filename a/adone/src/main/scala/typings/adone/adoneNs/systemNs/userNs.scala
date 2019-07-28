package typings.adone.adoneNs.systemNs

import typings.adone.Anon_GidUid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Utils for uid/gid
  */
@JSGlobal("adone.system.user")
@js.native
object userNs extends js.Object {
  /**
    * Returns gid by the given groupname
    */
  def gid(groupname: String): Double = js.native
  /**
    * Returns gids the given user belongs
    */
  def gids(username: String): js.Array[Double] = js.native
  /**
    * Returns groupname by the given gid
    */
  def groupname(gid: Double): String = js.native
  /**
    * Returns uid by the given username
    */
  def uid(username: String): Anon_GidUid = js.native
  /**
    * Returns username by the given uid
    */
  def username(uid: Double): String = js.native
}

