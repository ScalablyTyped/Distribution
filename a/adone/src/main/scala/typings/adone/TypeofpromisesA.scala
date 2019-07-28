package typings.adone

import org.scalablytyped.runtime.Instantiable0
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
import typings.node.Anon_Hostname
import typings.node.dnsMod.AnyRecord
import typings.node.dnsMod.LookupAddress
import typings.node.dnsMod.LookupAllOptions
import typings.node.dnsMod.LookupOneOptions
import typings.node.dnsMod.LookupOptions
import typings.node.dnsMod.MxRecord
import typings.node.dnsMod.NaptrRecord
import typings.node.dnsMod.RecordWithTtl
import typings.node.dnsMod.ResolveOptions
import typings.node.dnsMod.ResolveWithTtlOptions
import typings.node.dnsMod.SoaRecord
import typings.node.dnsMod.SrvRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofpromisesA extends js.Object {
  var Resolver: Instantiable0[typings.adone.glossesStdMod.dnsNs.promisesNs.Resolver] = js.native
  def getServers(): js.Array[String] = js.native
  def lookup(hostname: String): js.Promise[LookupAddress] = js.native
  def lookup(hostname: String, family: Double): js.Promise[LookupAddress] = js.native
  def lookup(hostname: String, options: LookupAllOptions): js.Promise[js.Array[LookupAddress]] = js.native
  def lookup(hostname: String, options: LookupOneOptions): js.Promise[LookupAddress] = js.native
  def lookup(hostname: String, options: LookupOptions): js.Promise[LookupAddress | js.Array[LookupAddress]] = js.native
  def lookupService(address: String, port: Double): js.Promise[Anon_Hostname] = js.native
  def resolve(hostname: String): js.Promise[js.Array[String]] = js.native
  def resolve(hostname: String, rrtype: String): js.Promise[
    (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
  ] = js.native
  def resolve4(hostname: String): js.Promise[js.Array[String]] = js.native
  def resolve4(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
  def resolve4(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
  def resolve6(hostname: String): js.Promise[js.Array[String]] = js.native
  def resolve6(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
  def resolve6(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
  def resolveAny(hostname: String): js.Promise[js.Array[AnyRecord]] = js.native
  def resolveCname(hostname: String): js.Promise[js.Array[String]] = js.native
  def resolveMx(hostname: String): js.Promise[js.Array[MxRecord]] = js.native
  def resolveNaptr(hostname: String): js.Promise[js.Array[NaptrRecord]] = js.native
  def resolveNs(hostname: String): js.Promise[js.Array[String]] = js.native
  def resolvePtr(hostname: String): js.Promise[js.Array[String]] = js.native
  def resolveSoa(hostname: String): js.Promise[SoaRecord] = js.native
  def resolveSrv(hostname: String): js.Promise[js.Array[SrvRecord]] = js.native
  def resolveTxt(hostname: String): js.Promise[js.Array[js.Array[String]]] = js.native
  @JSName("resolve")
  def resolve_A(hostname: String, rrtype: A): js.Promise[js.Array[String]] = js.native
  @JSName("resolve")
  def resolve_AAAA(hostname: String, rrtype: AAAA): js.Promise[js.Array[String]] = js.native
  @JSName("resolve")
  def resolve_ANY(hostname: String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = js.native
  @JSName("resolve")
  def resolve_CNAME(hostname: String, rrtype: CNAME): js.Promise[js.Array[String]] = js.native
  @JSName("resolve")
  def resolve_MX(hostname: String, rrtype: MX): js.Promise[js.Array[MxRecord]] = js.native
  @JSName("resolve")
  def resolve_NAPTR(hostname: String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = js.native
  @JSName("resolve")
  def resolve_NS(hostname: String, rrtype: NS): js.Promise[js.Array[String]] = js.native
  @JSName("resolve")
  def resolve_PTR(hostname: String, rrtype: PTR): js.Promise[js.Array[String]] = js.native
  @JSName("resolve")
  def resolve_SOA(hostname: String, rrtype: SOA): js.Promise[SoaRecord] = js.native
  @JSName("resolve")
  def resolve_SRV(hostname: String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
  @JSName("resolve")
  def resolve_TXT(hostname: String, rrtype: TXT): js.Promise[js.Array[js.Array[String]]] = js.native
  def reverse(ip: String): js.Promise[js.Array[String]] = js.native
  def setServers(servers: js.Array[String]): Unit = js.native
}

