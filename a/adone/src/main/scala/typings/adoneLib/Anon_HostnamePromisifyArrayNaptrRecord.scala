package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HostnamePromisifyArrayNaptrRecord extends js.Object {
  def `__promisify__`(hostname: java.lang.String): js.Promise[js.Array[nodeLib.dnsMod.NaptrRecord]]
}

object Anon_HostnamePromisifyArrayNaptrRecord {
  @scala.inline
  def apply(`__promisify__`: js.Function1[java.lang.String, js.Promise[js.Array[nodeLib.dnsMod.NaptrRecord]]]): Anon_HostnamePromisifyArrayNaptrRecord = {
    val __obj = js.Dynamic.literal(`__promisify__` = `__promisify__`)
  
    __obj.asInstanceOf[Anon_HostnamePromisifyArrayNaptrRecord]
  }
}

