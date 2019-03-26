package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HostnamePromisify extends js.Object {
  def __promisify__(hostname: java.lang.String): js.Promise[js.Array[nodeLib.dnsMod.NaptrRecord]]
}

object Anon_HostnamePromisify {
  @scala.inline
  def apply(__promisify__ : java.lang.String => js.Promise[js.Array[nodeLib.dnsMod.NaptrRecord]]): Anon_HostnamePromisify = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction1(__promisify__))
  
    __obj.asInstanceOf[Anon_HostnamePromisify]
  }
}

