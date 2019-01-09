package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_1 extends js.Object {
  val INs: js.Any = js.native
  val aix: scala.Boolean = js.native
  val darwin: scala.Boolean = js.native
  val freebsd: scala.Boolean = js.native
  val linux: scala.Boolean = js.native
  val openbsd: scala.Boolean = js.native
  val sunos: scala.Boolean = js.native
  val windows: scala.Boolean = js.native
  /**
    * Checks whether the given object is a class
    */
  def _class(obj: js.Any): scala.Boolean = js.native
  /**
    * Checks whether the given object is a function
    */
  def _function(obj: js.Any): scala.Boolean = js.native
  /**
    * Checks whether the given object is `null`
    */
  def _null(obj: js.Any): /* is null */ scala.Boolean = js.native
  def application(obj: js.Any): /* is adone.adone.app.Application */ scala.Boolean = js.native
  def array(obj: js.Any): /* is std.Array<any> */ scala.Boolean = js.native
  def arrayBuffer(obj: js.Any): /* is std.ArrayBuffer */ scala.Boolean = js.native
  def arrayBufferView(obj: js.Any): /* is std.ArrayBufferView */ scala.Boolean = js.native
  def arrayLikeObject(obj: js.Any): /* is std.ArrayLike<any> */ scala.Boolean = js.native
  def asyncEmitter(obj: js.Any): /* is adone.adone.event.AsyncEmitter */ scala.Boolean = js.native
  def asyncFunction(obj: js.Any): scala.Boolean = js.native
  def bigNumber(obj: js.Any): /* is adone.adone.math.BigNumber */ scala.Boolean = js.native
  def binaryExtension(str: java.lang.String): scala.Boolean = js.native
  def binaryPath(str: java.lang.String): scala.Boolean = js.native
  def boolean(obj: js.Any): /* is boolean */ scala.Boolean = js.native
  def buffer(obj: js.Any): /* is node.Buffer */ scala.Boolean = js.native
  def byteArray(obj: js.Any): /* is adone.adone.collection.ByteArray */ scala.Boolean = js.native
  def callback(obj: js.Any): scala.Boolean = js.native
  def configuration(obj: js.Any): scala.Boolean = js.native
  def conforms(obj: js.Object, schema: js.Object): scala.Boolean = js.native
  def conforms(obj: js.Object, schema: js.Object, strict: scala.Boolean): scala.Boolean = js.native
  def coreStream(obj: js.Any): /* is adone.adone.stream.core.Stream<any, any> */ scala.Boolean = js.native
  def date(obj: js.Any): /* is std.Date */ scala.Boolean = js.native
  def datetime(obj: js.Any): /* is adone.adone.I.datetime.Datetime */ scala.Boolean = js.native
  def deepEqual(left: js.Any, right: js.Any): scala.Boolean = js.native
  def digits(str: java.lang.String): scala.Boolean = js.native
  def dotfile(str: java.lang.String): scala.Boolean = js.native
  def duplexStream(obj: js.Any): scala.Boolean = js.native
  def email(obj: js.Any): /* is string */ scala.Boolean = js.native
  def email(obj: js.Any, options: Anon_AllowDisplayName): /* is string */ scala.Boolean = js.native
  def emitter(obj: js.Any): /* is adone.adone.event.Emitter */ scala.Boolean = js.native
  def emptyObject(obj: js.Any): /* is object */ scala.Boolean = js.native
  def emptyString(obj: js.Any): /* is string */ scala.Boolean = js.native
  def equalArrays(left: js.Array[_], right: js.Array[_]): scala.Boolean = js.native
  def error(obj: js.Any): scala.Boolean = js.native
  def even(obj: js.Any): /* is number */ scala.Boolean = js.native
  def exist(obj: js.Any): scala.Boolean = js.native
  def fastLocalMapStream(obj: js.Any): /* is adone.adone.fast.I.LocalMapStream<any> */ scala.Boolean = js.native
  def fastLocalStream(obj: js.Any): /* is adone.adone.fast.I.LocalStream<any> */ scala.Boolean = js.native
  def fastStream(obj: js.Any): /* is adone.adone.fast.I.Stream<any, any> */ scala.Boolean = js.native
  def finite(obj: js.Any): /* is number */ scala.Boolean = js.native
  def float(obj: js.Any): /* is number */ scala.Boolean = js.native
  def fqdn(obj: js.Any): /* is string */ scala.Boolean = js.native
  def fqdn(obj: js.Any, options: adoneLib.adoneNs.isNs.INs.FQDNOptions): /* is string */ scala.Boolean = js.native
  def generator(obj: js.Any): /* is std.GeneratorFunction */ scala.Boolean = js.native
  def genesisNetron(obj: js.Any): scala.Boolean = js.native
  def genesisPeer(obj: js.Any): scala.Boolean = js.native
  def glob(str: js.Any): /* is string */ scala.Boolean = js.native
  def identifier(str: java.lang.String): scala.Boolean = js.native
  def inArray[T](value: T, array: js.Array[_]): scala.Boolean = js.native
  def inArray[T](value: T, array: js.Array[_], offset: scala.Double): scala.Boolean = js.native
  def inArray[T](
    value: T,
    array: js.Array[_],
    offset: scala.Double,
    comparator: js.Function2[/* a */ T, /* b */ T, scala.Boolean]
  ): scala.Boolean = js.native
  def infinite(obj: js.Any): /* is number */ scala.Boolean = js.native
  def integer(obj: js.Any): /* is number */ scala.Boolean = js.native
  def ip(str: java.lang.String): scala.Boolean = js.native
  def ip(str: java.lang.String, options: adoneLib.adoneNs.regexNs.INs.IPNs.Options): scala.Boolean = js.native
  def ip4(str: java.lang.String): scala.Boolean = js.native
  def ip4(str: java.lang.String, options: adoneLib.adoneNs.regexNs.INs.IPNs.Options): scala.Boolean = js.native
  def ip6(str: java.lang.String): scala.Boolean = js.native
  def ip6(str: java.lang.String, options: adoneLib.adoneNs.regexNs.INs.IPNs.Options): scala.Boolean = js.native
  def iterable(obj: js.Any): /* is node.Iterable<any> */ scala.Boolean = js.native
  def json(obj: js.Any): scala.Boolean = js.native
  def logger(obj: js.Any): scala.Boolean = js.native
  def long(obj: js.Any): /* is adone.adone.math.Long */ scala.Boolean = js.native
  def lowercase(str: java.lang.String): scala.Boolean = js.native
  def map(obj: js.Any): /* is lodash.lodash.Global.Map<any, any> */ scala.Boolean = js.native
  def multiAddress(obj: js.Any): scala.Boolean = js.native
  def namespace(obj: js.Any): scala.Boolean = js.native
  def nan(obj: js.Any): scala.Boolean = js.native
  def negativeZero(obj: js.Any): /* is number */ scala.Boolean = js.native
  def netron(obj: js.Any): scala.Boolean = js.native
  def netronAdapter(obj: js.Any): scala.Boolean = js.native
  def netronContext(obj: js.Any): scala.Boolean = js.native
  def netronDefinition(obj: js.Any): scala.Boolean = js.native
  def netronDefinitions(obj: js.Any): scala.Boolean = js.native
  def netronIMethod(netronInterface: js.Object, name: java.lang.String): scala.Boolean = js.native
  def netronIProperty(netronInterface: js.Any, name: java.lang.String): scala.Boolean = js.native
  def netronInterface(obj: js.Any): scala.Boolean = js.native
  def netronPeer(obj: js.Any): scala.Boolean = js.native
  def netronReference(obj: js.Any): scala.Boolean = js.native
  def netronRemoteStub(obj: js.Any): scala.Boolean = js.native
  def netronStream(obj: js.Any): scala.Boolean = js.native
  def netronStub(obj: js.Any): scala.Boolean = js.native
  def nil(obj: js.Any): scala.Boolean = js.native
  def number(obj: js.Any): /* is number */ scala.Boolean = js.native
  def numeral(obj: java.lang.String): /* is string */ scala.Boolean = js.native
  def numeral(obj: js.Any): scala.Boolean = js.native
  def numeral(obj: scala.Double): /* is number */ scala.Boolean = js.native
  def `object`(obj: js.Any): /* is object */ scala.Boolean = js.native
  def odd(obj: js.Any): /* is number */ scala.Boolean = js.native
  def pathAbsolute(path: java.lang.String): scala.Boolean = js.native
  def plainObject(obj: js.Any): /* is object */ scala.Boolean = js.native
  def posixPathAbsolute(path: java.lang.String): scala.Boolean = js.native
  def prefix(prefix: java.lang.String, string: java.lang.String): scala.Boolean = js.native
  def primitive(obj: js.Any): scala.Boolean = js.native
  def promise(obj: js.Any): /* is std.PromiseLike<any> */ scala.Boolean = js.native
  def propertyDefined(obj: js.Any, field: java.lang.String): scala.Boolean = js.native
  def propertyOwned(obj: js.Any, field: java.lang.String): scala.Boolean = js.native
  def readableStream(obj: js.Any): scala.Boolean = js.native
  def regexp(obj: js.Any): /* is std.RegExp */ scala.Boolean = js.native
  def safeInteger(obj: js.Any): /* is number */ scala.Boolean = js.native
  def sameType(value: js.Any, other: js.Any): scala.Boolean = js.native
  def set(obj: js.Any): /* is node.Set<any> */ scala.Boolean = js.native
  def shallowEqual(left: js.Any, right: js.Any): scala.Boolean = js.native
  def stream(obj: js.Any): scala.Boolean = js.native
  def string(obj: js.Any): /* is string */ scala.Boolean = js.native
  def substring(substring: java.lang.String, string: java.lang.String): scala.Boolean = js.native
  def substring(substring: java.lang.String, string: java.lang.String, offset: scala.Double): scala.Boolean = js.native
  def subsystem(obj: js.Any): /* is adone.adone.app.Subsystem */ scala.Boolean = js.native
  def suffix(suffix: java.lang.String, string: java.lang.String): scala.Boolean = js.native
  def symbol(obj: js.Any): /* is symbol */ scala.Boolean = js.native
  def task(obj: js.Any): scala.Boolean = js.native
  def transform(obj: js.Any): scala.Boolean = js.native
  def transformStream(obj: js.Any): scala.Boolean = js.native
  def uint8Array(obj: js.Any): /* is std.Uint8Array */ scala.Boolean = js.native
  def undefined(obj: js.Any): /* is undefined */ scala.Boolean = js.native
  def uppercase(str: java.lang.String): scala.Boolean = js.native
  def url(obj: js.Any): /* is string */ scala.Boolean = js.native
  def url(obj: js.Any, options: adoneLib.adoneNs.isNs.INs.FQDNOptions with Anon_AllowProtocolRelativeUrls): /* is string */ scala.Boolean = js.native
  def utf8(obj: nodeLib.Buffer): scala.Boolean = js.native
  def uuid(obj: js.Any): /* is string */ scala.Boolean = js.native
  def uuid(obj: js.Any, version: adoneLib.adoneLibNumbers.`1`): /* is string */ scala.Boolean = js.native
  def uuid(obj: js.Any, version: adoneLib.adoneLibNumbers.`2`): /* is string */ scala.Boolean = js.native
  def uuid(obj: js.Any, version: adoneLib.adoneLibNumbers.`3`): /* is string */ scala.Boolean = js.native
  def uuid(obj: js.Any, version: adoneLib.adoneLibNumbers.`4`): /* is string */ scala.Boolean = js.native
  def uuid(obj: js.Any, version: adoneLib.adoneLibNumbers.`5`): /* is string */ scala.Boolean = js.native
  @JSName("uuid")
  def uuid_all(obj: js.Any, version: adoneLib.adoneLibStrings.all): /* is string */ scala.Boolean = js.native
  def validDate(str: java.lang.String): scala.Boolean = js.native
  def vaultValuable(obj: js.Any): scala.Boolean = js.native
  def win32PathAbsolute(path: java.lang.String): scala.Boolean = js.native
  def writableStream(obj: js.Any): scala.Boolean = js.native
}

