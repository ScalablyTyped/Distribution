package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofsystemEnv extends js.Object {
  val envNs: Typeofenv
  val processNs: Typeofprocess
  /**
    * Utils for uid/gid
    */
  val userNs: Typeofuser
}

object TypeofsystemEnv {
  @scala.inline
  def apply(envNs: Typeofenv, processNs: Typeofprocess, userNs: Typeofuser): TypeofsystemEnv = {
    val __obj = js.Dynamic.literal(envNs = envNs, processNs = processNs, userNs = userNs)
  
    __obj.asInstanceOf[TypeofsystemEnv]
  }
}

