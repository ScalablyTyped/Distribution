package typings
package autobahnLib.autobahnMod.autobahnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAuthCra extends js.Object {
  def derive_key(secret: java.lang.String, salt: java.lang.String, iterations: scala.Double, keylen: scala.Double): java.lang.String
  def sign(key: java.lang.String, challenge: java.lang.String): java.lang.String
}

