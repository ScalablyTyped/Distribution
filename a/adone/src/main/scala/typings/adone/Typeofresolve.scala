package typings.adone

import typings.adone.adoneStrings.A
import typings.adone.adoneStrings.AAAA
import typings.adone.adoneStrings.ANY
import typings.adone.adoneStrings.CNAME
import typings.adone.adoneStrings.MX
import typings.adone.adoneStrings.NAPTR
import typings.adone.adoneStrings.NS
import typings.adone.adoneStrings.PTR
import typings.adone.adoneStrings.SOA
import typings.adone.adoneStrings.SRV
import typings.adone.adoneStrings.TXT
import typings.node.dnsMod.AnyRecord
import typings.node.dnsMod.MxRecord
import typings.node.dnsMod.NaptrRecord
import typings.node.dnsMod.SoaRecord
import typings.node.dnsMod.SrvRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofresolve extends js.Object {
  def __promisify__(hostname: String): js.Promise[js.Array[String]] = js.native
  def __promisify__(hostname: String, rrtype: String): js.Promise[
    (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
  ] = js.native
  @JSName("__promisify__")
  def __promisify___A(hostname: String, rrtype: A): js.Promise[js.Array[String]] = js.native
  @JSName("__promisify__")
  def __promisify___AAAA(hostname: String, rrtype: AAAA): js.Promise[js.Array[String]] = js.native
  @JSName("__promisify__")
  def __promisify___ANY(hostname: String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___CNAME(hostname: String, rrtype: CNAME): js.Promise[js.Array[String]] = js.native
  @JSName("__promisify__")
  def __promisify___MX(hostname: String, rrtype: MX): js.Promise[js.Array[MxRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___NAPTR(hostname: String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___NS(hostname: String, rrtype: NS): js.Promise[js.Array[String]] = js.native
  @JSName("__promisify__")
  def __promisify___PTR(hostname: String, rrtype: PTR): js.Promise[js.Array[String]] = js.native
  @JSName("__promisify__")
  def __promisify___SOA(hostname: String, rrtype: SOA): js.Promise[SoaRecord] = js.native
  @JSName("__promisify__")
  def __promisify___SRV(hostname: String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
  @JSName("__promisify__")
  def __promisify___TXT(hostname: String, rrtype: TXT): js.Promise[js.Array[js.Array[String]]] = js.native
}

