package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AAAAA extends js.Object {
  def __promisify__(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def __promisify__(hostname: java.lang.String, rrtype: java.lang.String): js.Promise[
    js.Array[java.lang.String] | js.Array[nodeLib.dnsMod.MxRecord] | js.Array[nodeLib.dnsMod.NaptrRecord] | nodeLib.dnsMod.SoaRecord | js.Array[nodeLib.dnsMod.SrvRecord] | js.Array[js.Array[java.lang.String]] | js.Array[nodeLib.dnsMod.AnyRecord]
  ] = js.native
  @JSName("__promisify__")
  def __promisify___A(hostname: java.lang.String, rrtype: adoneLib.adoneLibStrings.A): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("__promisify__")
  def __promisify___AAAA(hostname: java.lang.String, rrtype: adoneLib.adoneLibStrings.AAAA): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("__promisify__")
  def __promisify___ANY(hostname: java.lang.String, rrtype: adoneLib.adoneLibStrings.ANY): js.Promise[js.Array[nodeLib.dnsMod.AnyRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___CNAME(hostname: java.lang.String, rrtype: adoneLib.adoneLibStrings.CNAME): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("__promisify__")
  def __promisify___MX(hostname: java.lang.String, rrtype: adoneLib.adoneLibStrings.MX): js.Promise[js.Array[nodeLib.dnsMod.MxRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___NAPTR(hostname: java.lang.String, rrtype: adoneLib.adoneLibStrings.NAPTR): js.Promise[js.Array[nodeLib.dnsMod.NaptrRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___NS(hostname: java.lang.String, rrtype: adoneLib.adoneLibStrings.NS): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("__promisify__")
  def __promisify___PTR(hostname: java.lang.String, rrtype: adoneLib.adoneLibStrings.PTR): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("__promisify__")
  def __promisify___SOA(hostname: java.lang.String, rrtype: adoneLib.adoneLibStrings.SOA): js.Promise[nodeLib.dnsMod.SoaRecord] = js.native
  @JSName("__promisify__")
  def __promisify___SRV(hostname: java.lang.String, rrtype: adoneLib.adoneLibStrings.SRV): js.Promise[js.Array[nodeLib.dnsMod.SrvRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___TXT(hostname: java.lang.String, rrtype: adoneLib.adoneLibStrings.TXT): js.Promise[js.Array[js.Array[java.lang.String]]] = js.native
}

