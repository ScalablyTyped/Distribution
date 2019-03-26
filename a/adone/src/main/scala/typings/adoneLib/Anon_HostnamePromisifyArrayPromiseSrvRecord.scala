package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HostnamePromisifyArrayPromiseSrvRecord extends js.Object {
  def __promisify__(hostname: java.lang.String): js.Promise[js.Array[nodeLib.dnsMod.SrvRecord]]
}

object Anon_HostnamePromisifyArrayPromiseSrvRecord {
  @scala.inline
  def apply(__promisify__ : java.lang.String => js.Promise[js.Array[nodeLib.dnsMod.SrvRecord]]): Anon_HostnamePromisifyArrayPromiseSrvRecord = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction1(__promisify__))
  
    __obj.asInstanceOf[Anon_HostnamePromisifyArrayPromiseSrvRecord]
  }
}

