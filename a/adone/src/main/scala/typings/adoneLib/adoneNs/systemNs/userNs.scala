package typings
package adoneLib.adoneNs.systemNs

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
  def gid(groupname: java.lang.String): scala.Double = js.native
  /**
    * Returns gids the given user belongs
    */
  def gids(username: java.lang.String): js.Array[scala.Double] = js.native
  /**
    * Returns groupname by the given gid
    */
  def groupname(gid: scala.Double): java.lang.String = js.native
  /**
    * Returns uid by the given username
    */
  def uid(username: java.lang.String): adoneLib.Anon_GidUid = js.native
  /**
    * Returns username by the given uid
    */
  def username(uid: scala.Double): java.lang.String = js.native
}

