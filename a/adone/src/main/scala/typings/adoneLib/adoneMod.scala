package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone", JSImport.Namespace)
@js.native
object adoneMod extends js.Object {
  @js.native
  object adone extends js.Object {
    val EMPTY_BUFFER: nodeLib.Buffer = js.native
    val ETC_PATH: java.lang.String = js.native
    val INs: adoneLib.Anon_Datetime = js.native
    val ROOT_PATH: java.lang.String = js.native
    val _null: js.Symbol = js.native
    val appNs: adoneLib.Anon_App = js.native
    /**
      * Various archivers
      */
    val archiveNs: adoneLib.Anon_Tar = js.native
    @JSName("assert")
    val assert_Original: adoneLib.adoneNs.assertionNs.INs.AssertFunction = js.native
    /**
      * assertion functions
      */
    val assertionNs: adoneLib.Anon_Assert = js.native
    val bad: adoneLib.adoneLibStrings.bad = js.native
    /**
      * Data structures
      */
    val collectionNs: adoneLib.Anon_AAVLTree = js.native
    /**
      * Various compressors
      */
    val compressorNs: adoneLib.Anon_Brotli = js.native
    val configuration: js.Object = js.native
    val cryptoNs: adoneLib.Anon_Asn1 = js.native
    /**
      * Various data [de]serializers
      */
    val dataNs: adoneLib.Anon_AlphabetBase32 = js.native
    /**
      * Creates a new datetime object
      */
    @JSName("datetime")
    val datetime_Original: adoneLib.adoneNs.INs.datetimeNs.DatetimeFunction = js.native
    val errorNs: adoneLib.Anon_Bind = js.native
    val eventNs: adoneLib.Anon_AsyncEmitter = js.native
    @JSName("expect")
    val expect_Original: adoneLib.adoneNs.assertionNs.INs.ExpectFunction = js.native
    val fakeNs: adoneLib.Anon_AddressCommerce = js.native
    /**
      * Filesystem Automation Streaming Templates/Transforms
      */
    val fastNs: adoneLib.Anon_File = js.native
    /**
      * File system stuff
      */
    val fsNs: adoneLib.Anon_AbstractRandomAccessReader = js.native
    /**
      * predicates
      */
    val isNs: adoneLib.Anon_1 = js.native
    val lodash: lodashLib.lodashMod.LoDashStatic = js.native
    /**
      * math related things
      */
    val mathNs: adoneLib.Anon_ArrayBigNumber = js.native
    val metaNs: adoneLib.Anon_I = js.native
    val netNs: adoneLib.Anon_Http = js.native
    val ok: adoneLib.adoneLibStrings.ok = js.native
    val `package`: js.Object = js.native
    val prettyNs: adoneLib.Anon_DataI = js.native
    /**
      * promise helpers
      */
    val promiseNs: adoneLib.Anon_AArgs = js.native
    val regexNs: adoneLib.Anon_Ansi = js.native
    val runtime: adoneLib.adoneNs.INs.Runtime = js.native
    val semverNs: adoneLib.Anon_01 = js.native
    /**
      * testing framework
      */
    val shaniNs: adoneLib.Anon_Engine = js.native
    val streamNs: adoneLib.Anon_Core = js.native
    val systemNs: adoneLib.Anon_Env = js.native
    val tag: adoneLib.adoneNs.INs.Tag = js.native
    val templatingNs: adoneLib.Anon_Dot = js.native
    val textNs: adoneLib.Anon_CamelCaseToDashed = js.native
    /**
      * various utility functions
      */
    val utilNs: adoneLib.Anon_AArgsArgument = js.native
    val vaultNs: adoneLib.Anon_IId = js.native
    /**
      * Asserts that value is truthy
      */
    def assert(value: js.Any): scala.Unit = js.native
    def assert(value: js.Any, message: java.lang.String): scala.Unit = js.native
    /**
      * Creates a new datetime object
      */
    def datetime(): adoneLib.adoneNs.INs.datetimeNs.Datetime = js.native
    def datetime(inp: adoneLib.adoneNs.INs.datetimeNs.DatetimeInput): adoneLib.adoneNs.INs.datetimeNs.Datetime = js.native
    def datetime(
      inp: adoneLib.adoneNs.INs.datetimeNs.DatetimeInput,
      format: adoneLib.adoneNs.INs.datetimeNs.DatetimeFormatSpecification
    ): adoneLib.adoneNs.INs.datetimeNs.Datetime = js.native
    def datetime(
      inp: adoneLib.adoneNs.INs.datetimeNs.DatetimeInput,
      format: adoneLib.adoneNs.INs.datetimeNs.DatetimeFormatSpecification,
      language: java.lang.String
    ): adoneLib.adoneNs.INs.datetimeNs.Datetime = js.native
    def datetime(
      inp: adoneLib.adoneNs.INs.datetimeNs.DatetimeInput,
      format: adoneLib.adoneNs.INs.datetimeNs.DatetimeFormatSpecification,
      language: java.lang.String,
      strict: scala.Boolean
    ): adoneLib.adoneNs.INs.datetimeNs.Datetime = js.native
    def datetime(
      inp: adoneLib.adoneNs.INs.datetimeNs.DatetimeInput,
      format: adoneLib.adoneNs.INs.datetimeNs.DatetimeFormatSpecification,
      strict: scala.Boolean
    ): adoneLib.adoneNs.INs.datetimeNs.Datetime = js.native
    def definePrivate(modules: js.Object, obj: js.Object): js.Object = js.native
    def expect(value: adoneLib.adoneNs.shaniNs.utilNs.INs.Spy): adoneLib.adoneNs.assertionNs.INs.MockAssertions = js.native
    def expect(value: adoneLib.adoneNs.shaniNs.utilNs.INs.Spy, message: java.lang.String): adoneLib.adoneNs.assertionNs.INs.MockAssertions = js.native
    def expect(value: js.Any): adoneLib.adoneNs.assertionNs.INs.Assertion = js.native
    def expect(value: js.Any, message: java.lang.String): adoneLib.adoneNs.assertionNs.INs.Assertion = js.native
    def falsely(): adoneLib.adoneLibNumbers.`false` = js.native
    def getAssetAbsolutePath(relPath: java.lang.String): java.lang.String = js.native
    def identity[T](x: T): T = js.native
    def lazify(modules: js.Object): js.Object = js.native
    def lazify(modules: js.Object, obj: js.Object): js.Object = js.native
    def lazify(modules: js.Object, obj: js.Object, require: js.Function1[/* path */ java.lang.String, _]): js.Object = js.native
    def lazify(
      modules: js.Object,
      obj: js.Object,
      require: js.Function1[/* path */ java.lang.String, _],
      options: adoneLib.adoneNs.INs.LazifyOptions
    ): js.Object = js.native
    def lazifyPrivate(modules: js.Object): js.Object = js.native
    def lazifyPrivate(modules: js.Object, obj: js.Object): js.Object = js.native
    def lazifyPrivate(modules: js.Object, obj: js.Object, require: js.Function1[/* path */ java.lang.String, _]): js.Object = js.native
    def lazifyPrivate(
      modules: js.Object,
      obj: js.Object,
      require: js.Function1[/* path */ java.lang.String, _],
      options: adoneLib.adoneNs.INs.LazifyOptions
    ): js.Object = js.native
    def loadAsset(relPath: java.lang.String): java.lang.String | nodeLib.Buffer = js.native
    def log(args: js.Any*): scala.Unit = js.native
    def logDebug(args: js.Any*): scala.Unit = js.native
    def logError(args: js.Any*): scala.Unit = js.native
    def logFatal(args: js.Any*): scala.Unit = js.native
    def logInfo(args: js.Any*): scala.Unit = js.native
    def logTrace(args: js.Any*): scala.Unit = js.native
    def logWarn(args: js.Any*): scala.Unit = js.native
    def noop(): scala.Unit = js.native
    def o(props: js.Any*): js.Object = js.native
    def `private`(obj: js.Object): js.Any = js.native
    def require(path: java.lang.String): js.Object = js.native
    def sprintf(format: java.lang.String, args: js.Any*): java.lang.String = js.native
    def truly(): adoneLib.adoneLibNumbers.`true` = js.native
  }
  
}

