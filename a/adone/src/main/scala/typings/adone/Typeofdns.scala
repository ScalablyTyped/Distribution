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
import typings.node.NodeJSNs.ErrnoException
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
trait Typeofdns extends js.Object {
  // Supported getaddrinfo flags.
  val ADDRCONFIG: Double = js.native
  val ADDRGETNETWORKPARAMS: String = js.native
  val BADFAMILY: String = js.native
  val BADFLAGS: String = js.native
  val BADHINTS: String = js.native
  val BADNAME: String = js.native
  val BADQUERY: String = js.native
  val BADRESP: String = js.native
  val BADSTR: String = js.native
  val CANCELLED: String = js.native
  val CONNREFUSED: String = js.native
  val DESTRUCTION: String = js.native
  val EOF: String = js.native
  val FILE: String = js.native
  val FORMERR: String = js.native
  val LOADIPHLPAPI: String = js.native
  // Error codes
  val NODATA: String = js.native
  val NOMEM: String = js.native
  val NONAME: String = js.native
  val NOTFOUND: String = js.native
  val NOTIMP: String = js.native
  val NOTINITIALIZED: String = js.native
  val REFUSED: String = js.native
  var Resolver: Instantiable0[typings.adone.glossesStdMod.dnsNs.Resolver] = js.native
  val SERVFAIL: String = js.native
  val TIMEOUT: String = js.native
  val V4MAPPED: Double = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val lookupNs: Typeoflookup = js.native
  val lookupServiceNs: TypeoflookupService = js.native
  val promisesNs: TypeofpromisesA = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val resolve4Ns: Typeofresolve4 = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val resolve6Ns: Typeofresolve6 = js.native
  val resolveAnyNs: TypeofresolveAny = js.native
  val resolveCnameNs: TypeofresolveCname = js.native
  val resolveMxNs: TypeofresolveMx = js.native
  val resolveNaptrNs: TypeofresolveNaptr = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val resolveNs: Typeofresolve = js.native
  val resolveNsNs: TypeofresolveNs = js.native
  val resolvePtrNs: TypeofresolvePtr = js.native
  val resolveSoaNs: TypeofresolveSoa = js.native
  val resolveSrvNs: TypeofresolveSrv = js.native
  val resolveTxtNs: TypeofresolveTxt = js.native
  def getServers(): js.Array[String] = js.native
  def lookup(
    hostname: String,
    callback: js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]
  ): Unit = js.native
  def lookup(
    hostname: String,
    family: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]
  ): Unit = js.native
  def lookup(
    hostname: String,
    options: LookupAllOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[LookupAddress], Unit]
  ): Unit = js.native
  def lookup(
    hostname: String,
    options: LookupOneOptions,
    callback: js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]
  ): Unit = js.native
  def lookup(
    hostname: String,
    options: LookupOptions,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* address */ String | js.Array[LookupAddress], 
      /* family */ Double, 
      Unit
    ]
  ): Unit = js.native
  def lookupService(
    address: String,
    port: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* hostname */ String, /* service */ String, Unit]
  ): Unit = js.native
  def resolve(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def resolve(
    hostname: String,
    rrtype: String,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord, 
      Unit
    ]
  ): Unit = js.native
  def resolve4(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def resolve4(
    hostname: String,
    options: ResolveOptions,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ js.Array[RecordWithTtl | String], 
      Unit
    ]
  ): Unit = js.native
  def resolve4(
    hostname: String,
    options: ResolveWithTtlOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[RecordWithTtl], Unit]
  ): Unit = js.native
  def resolve6(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def resolve6(
    hostname: String,
    options: ResolveOptions,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* addresses */ js.Array[RecordWithTtl | String], 
      Unit
    ]
  ): Unit = js.native
  def resolve6(
    hostname: String,
    options: ResolveWithTtlOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[RecordWithTtl], Unit]
  ): Unit = js.native
  def resolveAny(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit]
  ): Unit = js.native
  def resolveCname(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def resolveMx(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[MxRecord], Unit]
  ): Unit = js.native
  def resolveNaptr(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[NaptrRecord], Unit]
  ): Unit = js.native
  def resolveNs(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def resolvePtr(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  def resolveSoa(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* address */ SoaRecord, Unit]
  ): Unit = js.native
  def resolveSrv(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit]
  ): Unit = js.native
  def resolveTxt(
    hostname: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[js.Array[String]], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_A(
    hostname: String,
    rrtype: A,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_AAAA(
    hostname: String,
    rrtype: AAAA,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_ANY(
    hostname: String,
    rrtype: ANY,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_CNAME(
    hostname: String,
    rrtype: CNAME,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_MX(
    hostname: String,
    rrtype: MX,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[MxRecord], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_NAPTR(
    hostname: String,
    rrtype: NAPTR,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[NaptrRecord], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_NS(
    hostname: String,
    rrtype: NS,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_PTR(
    hostname: String,
    rrtype: PTR,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_SOA(
    hostname: String,
    rrtype: SOA,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ SoaRecord, Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_SRV(
    hostname: String,
    rrtype: SRV,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit]
  ): Unit = js.native
  @JSName("resolve")
  def resolve_TXT(
    hostname: String,
    rrtype: TXT,
    callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[js.Array[String]], Unit]
  ): Unit = js.native
  def reverse(
    ip: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* hostnames */ js.Array[String], Unit]
  ): Unit = js.native
  def setServers(servers: js.Array[String]): Unit = js.native
}

