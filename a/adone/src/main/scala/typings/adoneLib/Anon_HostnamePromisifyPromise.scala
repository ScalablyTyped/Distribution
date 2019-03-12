package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HostnamePromisifyPromise extends js.Object {
  def __promisify__(hostname: java.lang.String): js.Promise[nodeLib.dnsMod.SoaRecord]
}

object Anon_HostnamePromisifyPromise {
  @scala.inline
  def apply(__promisify__ : java.lang.String => js.Promise[nodeLib.dnsMod.SoaRecord]): Anon_HostnamePromisifyPromise = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction1(__promisify__))
  
    __obj.asInstanceOf[Anon_HostnamePromisifyPromise]
  }
}

