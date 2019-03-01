package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HostnamePromisifyAnyRecord extends js.Object {
  def `__promisify__`(hostname: java.lang.String): js.Promise[js.Array[nodeLib.dnsMod.AnyRecord]]
}

object Anon_HostnamePromisifyAnyRecord {
  @scala.inline
  def apply(`__promisify__`: js.Function1[java.lang.String, js.Promise[js.Array[nodeLib.dnsMod.AnyRecord]]]): Anon_HostnamePromisifyAnyRecord = {
    val __obj = js.Dynamic.literal(`__promisify__` = `__promisify__`)
  
    __obj.asInstanceOf[Anon_HostnamePromisifyAnyRecord]
  }
}

