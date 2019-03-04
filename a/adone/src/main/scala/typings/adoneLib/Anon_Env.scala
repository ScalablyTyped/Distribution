package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Env extends js.Object {
  val envNs: Anon_Editor
  val processNs: Anon_ArgsCmd
  /**
    * Utils for uid/gid
    */
  val userNs: Anon_GidGids
}

object Anon_Env {
  @scala.inline
  def apply(envNs: Anon_Editor, processNs: Anon_ArgsCmd, userNs: Anon_GidGids): Anon_Env = {
    val __obj = js.Dynamic.literal(envNs = envNs, processNs = processNs, userNs = userNs)
  
    __obj.asInstanceOf[Anon_Env]
  }
}

