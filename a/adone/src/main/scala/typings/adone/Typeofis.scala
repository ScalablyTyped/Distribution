package typings.adone

import typings.adone.adoneNs.isNs.INs.FQDNOptions
import typings.adone.adoneNs.regexNs.INs.IPNs.Options
import typings.adone.adoneNumbers.`1`
import typings.adone.adoneNumbers.`2`
import typings.adone.adoneNumbers.`3`
import typings.adone.adoneNumbers.`4`
import typings.adone.adoneNumbers.`5`
import typings.adone.adoneStrings.all
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofis extends js.Object {
  val INs: js.Any = js.native
  val aix: Boolean = js.native
  val darwin: Boolean = js.native
  val freebsd: Boolean = js.native
  val linux: Boolean = js.native
  val openbsd: Boolean = js.native
  val sunos: Boolean = js.native
  val windows: Boolean = js.native
  /**
    * Checks whether the given object is a class
    */
  def _class(obj: js.Any): Boolean = js.native
  /**
    * Checks whether the given object is a function
    */
  def _function(obj: js.Any): Boolean = js.native
  /**
    * Checks whether the given object is `null`
    */
  def _null(obj: js.Any): /* is null */ Boolean = js.native
  def application(obj: js.Any): /* is adone.adone.app.Application */ Boolean = js.native
  def array(obj: js.Any): /* is std.Array<any> */ Boolean = js.native
  def arrayBuffer(obj: js.Any): /* is std.ArrayBuffer */ Boolean = js.native
  def arrayBufferView(obj: js.Any): /* is std.ArrayBufferView */ Boolean = js.native
  def arrayLikeObject(obj: js.Any): /* is std.ArrayLike<any> */ Boolean = js.native
  def asyncEmitter(obj: js.Any): /* is adone.adone.event.AsyncEmitter */ Boolean = js.native
  def asyncFunction(obj: js.Any): Boolean = js.native
  def bigNumber(obj: js.Any): /* is adone.adone.math.BigNumber */ Boolean = js.native
  def binaryExtension(str: String): Boolean = js.native
  def binaryPath(str: String): Boolean = js.native
  def boolean(obj: js.Any): /* is boolean */ Boolean = js.native
  def buffer(obj: js.Any): /* is node.Buffer */ Boolean = js.native
  def byteArray(obj: js.Any): /* is adone.adone.collection.ByteArray */ Boolean = js.native
  def callback(obj: js.Any): Boolean = js.native
  def configuration(obj: js.Any): Boolean = js.native
  def conforms(obj: js.Object, schema: js.Object): Boolean = js.native
  def conforms(obj: js.Object, schema: js.Object, strict: Boolean): Boolean = js.native
  def coreStream(obj: js.Any): /* is adone.adone.stream.core.Stream<any, any> */ Boolean = js.native
  def date(obj: js.Any): /* is std.Date */ Boolean = js.native
  def datetime(obj: js.Any): /* is adone.adone.I.datetime.Datetime */ Boolean = js.native
  def deepEqual(left: js.Any, right: js.Any): Boolean = js.native
  def digits(str: String): Boolean = js.native
  def dotfile(str: String): Boolean = js.native
  def duplexStream(obj: js.Any): Boolean = js.native
  def email(obj: js.Any): /* is string */ Boolean = js.native
  def email(obj: js.Any, options: Anon_AllowDisplayName): /* is string */ Boolean = js.native
  def emitter(obj: js.Any): /* is adone.adone.event.Emitter */ Boolean = js.native
  def emptyObject(obj: js.Any): /* is object */ Boolean = js.native
  def emptyString(obj: js.Any): /* is string */ Boolean = js.native
  def equalArrays(left: js.Array[_], right: js.Array[_]): Boolean = js.native
  def error(obj: js.Any): Boolean = js.native
  def even(obj: js.Any): /* is number */ Boolean = js.native
  def exist(obj: js.Any): Boolean = js.native
  def fastLocalMapStream(obj: js.Any): /* is adone.adone.fast.I.LocalMapStream<any> */ Boolean = js.native
  def fastLocalStream(obj: js.Any): /* is adone.adone.fast.I.LocalStream<any> */ Boolean = js.native
  def fastStream(obj: js.Any): /* is adone.adone.fast.I.Stream<any, / * import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for T * / any> */ Boolean = js.native
  def finite(obj: js.Any): /* is number */ Boolean = js.native
  def float(obj: js.Any): /* is number */ Boolean = js.native
  def fqdn(obj: js.Any): /* is string */ Boolean = js.native
  def fqdn(obj: js.Any, options: FQDNOptions): /* is string */ Boolean = js.native
  def generator(obj: js.Any): /* is std.GeneratorFunction */ Boolean = js.native
  def genesisNetron(obj: js.Any): Boolean = js.native
  def genesisPeer(obj: js.Any): Boolean = js.native
  def glob(str: js.Any): /* is string */ Boolean = js.native
  def identifier(str: String): Boolean = js.native
  def inArray[T](value: T, array: js.Array[_]): Boolean = js.native
  def inArray[T](value: T, array: js.Array[_], offset: Double): Boolean = js.native
  def inArray[T](
    value: T,
    array: js.Array[_],
    offset: Double,
    comparator: js.Function2[/* a */ T, /* b */ T, Boolean]
  ): Boolean = js.native
  def infinite(obj: js.Any): /* is number */ Boolean = js.native
  def integer(obj: js.Any): /* is number */ Boolean = js.native
  def ip(str: String): Boolean = js.native
  def ip(str: String, options: Options): Boolean = js.native
  def ip4(str: String): Boolean = js.native
  def ip4(str: String, options: Options): Boolean = js.native
  def ip6(str: String): Boolean = js.native
  def ip6(str: String, options: Options): Boolean = js.native
  def iterable(obj: js.Any): /* is std.Iterable<any> */ Boolean = js.native
  def json(obj: js.Any): Boolean = js.native
  def logger(obj: js.Any): Boolean = js.native
  def long(obj: js.Any): /* is adone.adone.math.Long */ Boolean = js.native
  def lowercase(str: String): Boolean = js.native
  def map(obj: js.Any): /* is std.Map<any, any> */ Boolean = js.native
  def multiAddress(obj: js.Any): Boolean = js.native
  def namespace(obj: js.Any): Boolean = js.native
  def nan(obj: js.Any): Boolean = js.native
  def negativeZero(obj: js.Any): /* is number */ Boolean = js.native
  def netron(obj: js.Any): Boolean = js.native
  def netronAdapter(obj: js.Any): Boolean = js.native
  def netronContext(obj: js.Any): Boolean = js.native
  def netronDefinition(obj: js.Any): Boolean = js.native
  def netronDefinitions(obj: js.Any): Boolean = js.native
  def netronIMethod(netronInterface: js.Object, name: String): Boolean = js.native
  def netronIProperty(netronInterface: js.Any, name: String): Boolean = js.native
  def netronInterface(obj: js.Any): Boolean = js.native
  def netronPeer(obj: js.Any): Boolean = js.native
  def netronReference(obj: js.Any): Boolean = js.native
  def netronRemoteStub(obj: js.Any): Boolean = js.native
  def netronStream(obj: js.Any): Boolean = js.native
  def netronStub(obj: js.Any): Boolean = js.native
  def nil(obj: js.Any): Boolean = js.native
  def number(obj: js.Any): /* is number */ Boolean = js.native
  def numeral(obj: String): /* is string */ Boolean = js.native
  def numeral(obj: js.Any): Boolean = js.native
  def numeral(obj: Double): /* is number */ Boolean = js.native
  def `object`(obj: js.Any): /* is object */ Boolean = js.native
  def odd(obj: js.Any): /* is number */ Boolean = js.native
  def pathAbsolute(path: String): Boolean = js.native
  def plainObject(obj: js.Any): /* is object */ Boolean = js.native
  def posixPathAbsolute(path: String): Boolean = js.native
  def prefix(prefix: String, string: String): Boolean = js.native
  def primitive(obj: js.Any): Boolean = js.native
  def promise(obj: js.Any): /* is std.PromiseLike<any> */ Boolean = js.native
  def propertyDefined(obj: js.Any, field: String): Boolean = js.native
  def propertyOwned(obj: js.Any, field: String): Boolean = js.native
  def readableStream(obj: js.Any): Boolean = js.native
  def regexp(obj: js.Any): /* is std.RegExp */ Boolean = js.native
  def safeInteger(obj: js.Any): /* is number */ Boolean = js.native
  def sameType(value: js.Any, other: js.Any): Boolean = js.native
  def set(obj: js.Any): /* is std.Set<any> */ Boolean = js.native
  def shallowEqual(left: js.Any, right: js.Any): Boolean = js.native
  def stream(obj: js.Any): Boolean = js.native
  def string(obj: js.Any): /* is string */ Boolean = js.native
  def substring(substring: String, string: String): Boolean = js.native
  def substring(substring: String, string: String, offset: Double): Boolean = js.native
  def subsystem(obj: js.Any): /* is adone.adone.app.Subsystem */ Boolean = js.native
  def suffix(suffix: String, string: String): Boolean = js.native
  def symbol(obj: js.Any): /* is symbol */ Boolean = js.native
  def task(obj: js.Any): Boolean = js.native
  def transform(obj: js.Any): Boolean = js.native
  def transformStream(obj: js.Any): Boolean = js.native
  def uint8Array(obj: js.Any): /* is std.Uint8Array */ Boolean = js.native
  def undefined(obj: js.Any): /* is undefined */ Boolean = js.native
  def uppercase(str: String): Boolean = js.native
  def url(obj: js.Any): /* is string */ Boolean = js.native
  def url(obj: js.Any, options: FQDNOptions with Anon_AllowProtocolRelativeUrls): /* is string */ Boolean = js.native
  def utf8(obj: Buffer): Boolean = js.native
  def uuid(obj: js.Any): /* is string */ Boolean = js.native
  @JSName("uuid")
  def uuid_1(obj: js.Any, version: `1`): /* is string */ Boolean = js.native
  @JSName("uuid")
  def uuid_2(obj: js.Any, version: `2`): /* is string */ Boolean = js.native
  @JSName("uuid")
  def uuid_3(obj: js.Any, version: `3`): /* is string */ Boolean = js.native
  @JSName("uuid")
  def uuid_4(obj: js.Any, version: `4`): /* is string */ Boolean = js.native
  @JSName("uuid")
  def uuid_5(obj: js.Any, version: `5`): /* is string */ Boolean = js.native
  @JSName("uuid")
  def uuid_all(obj: js.Any, version: all): /* is string */ Boolean = js.native
  def validDate(str: String): Boolean = js.native
  def vaultValuable(obj: js.Any): Boolean = js.native
  def win32PathAbsolute(path: String): Boolean = js.native
  def writableStream(obj: js.Any): Boolean = js.native
}

