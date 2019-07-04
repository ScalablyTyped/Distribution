package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofpromisesA extends js.Object {
  var Resolver: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.dnsNs.promisesNs.Resolver] = js.native
  def getServers(): js.Array[java.lang.String] = js.native
  def lookup(hostname: java.lang.String): js.Promise[nodeLib.dnsMod.LookupAddress] = js.native
  def lookup(hostname: java.lang.String, family: scala.Double): js.Promise[nodeLib.dnsMod.LookupAddress] = js.native
  def lookup(hostname: java.lang.String, options: nodeLib.dnsMod.LookupAllOptions): js.Promise[js.Array[nodeLib.dnsMod.LookupAddress]] = js.native
  def lookup(hostname: java.lang.String, options: nodeLib.dnsMod.LookupOneOptions): js.Promise[nodeLib.dnsMod.LookupAddress] = js.native
  def lookup(hostname: java.lang.String, options: nodeLib.dnsMod.LookupOptions): js.Promise[nodeLib.dnsMod.LookupAddress | js.Array[nodeLib.dnsMod.LookupAddress]] = js.native
  def lookupService(address: java.lang.String, port: scala.Double): js.Promise[nodeLib.Anon_Hostname] = js.native
  def resolve(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolve(hostname: java.lang.String, rrtype: java.lang.String): js.Promise[
    (js.Array[
      nodeLib.dnsMod.AnyRecord | js.Array[java.lang.String] | nodeLib.dnsMod.MxRecord | nodeLib.dnsMod.NaptrRecord | nodeLib.dnsMod.SrvRecord | java.lang.String
    ]) | nodeLib.dnsMod.SoaRecord
  ] = js.native
  def resolve4(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolve4(hostname: java.lang.String, options: nodeLib.dnsMod.ResolveOptions): js.Promise[js.Array[nodeLib.dnsMod.RecordWithTtl | java.lang.String]] = js.native
  def resolve4(hostname: java.lang.String, options: nodeLib.dnsMod.ResolveWithTtlOptions): js.Promise[js.Array[nodeLib.dnsMod.RecordWithTtl]] = js.native
  def resolve6(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolve6(hostname: java.lang.String, options: nodeLib.dnsMod.ResolveOptions): js.Promise[js.Array[nodeLib.dnsMod.RecordWithTtl | java.lang.String]] = js.native
  def resolve6(hostname: java.lang.String, options: nodeLib.dnsMod.ResolveWithTtlOptions): js.Promise[js.Array[nodeLib.dnsMod.RecordWithTtl]] = js.native
  def resolveAny(hostname: java.lang.String): js.Promise[js.Array[nodeLib.dnsMod.AnyRecord]] = js.native
  def resolveCname(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolveMx(hostname: java.lang.String): js.Promise[js.Array[nodeLib.dnsMod.MxRecord]] = js.native
  def resolveNaptr(hostname: java.lang.String): js.Promise[js.Array[nodeLib.dnsMod.NaptrRecord]] = js.native
  def resolveNs(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolvePtr(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def resolveSoa(hostname: java.lang.String): js.Promise[nodeLib.dnsMod.SoaRecord] = js.native
  def resolveSrv(hostname: java.lang.String): js.Promise[js.Array[nodeLib.dnsMod.SrvRecord]] = js.native
  def resolveTxt(hostname: java.lang.String): js.Promise[js.Array[js.Array[java.lang.String]]] = js.native
  @JSName("resolve")
  def resolve_A(hostname: java.lang.String, rrtype: adoneLib.adoneLibStrings.A): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("resolve")
  def resolve_AAAA(hostname: java.lang.String, rrtype: adoneLib.adoneLibStrings.AAAA): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("resolve")
  def resolve_ANY(hostname: java.lang.String, rrtype: adoneLib.adoneLibStrings.ANY): js.Promise[js.Array[nodeLib.dnsMod.AnyRecord]] = js.native
  @JSName("resolve")
  def resolve_CNAME(hostname: java.lang.String, rrtype: adoneLib.adoneLibStrings.CNAME): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("resolve")
  def resolve_MX(hostname: java.lang.String, rrtype: adoneLib.adoneLibStrings.MX): js.Promise[js.Array[nodeLib.dnsMod.MxRecord]] = js.native
  @JSName("resolve")
  def resolve_NAPTR(hostname: java.lang.String, rrtype: adoneLib.adoneLibStrings.NAPTR): js.Promise[js.Array[nodeLib.dnsMod.NaptrRecord]] = js.native
  @JSName("resolve")
  def resolve_NS(hostname: java.lang.String, rrtype: adoneLib.adoneLibStrings.NS): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("resolve")
  def resolve_PTR(hostname: java.lang.String, rrtype: adoneLib.adoneLibStrings.PTR): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("resolve")
  def resolve_SOA(hostname: java.lang.String, rrtype: adoneLib.adoneLibStrings.SOA): js.Promise[nodeLib.dnsMod.SoaRecord] = js.native
  @JSName("resolve")
  def resolve_SRV(hostname: java.lang.String, rrtype: adoneLib.adoneLibStrings.SRV): js.Promise[js.Array[nodeLib.dnsMod.SrvRecord]] = js.native
  @JSName("resolve")
  def resolve_TXT(hostname: java.lang.String, rrtype: adoneLib.adoneLibStrings.TXT): js.Promise[js.Array[js.Array[java.lang.String]]] = js.native
  def reverse(ip: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def setServers(servers: js.Array[java.lang.String]): scala.Unit = js.native
}

