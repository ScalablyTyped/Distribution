package typings.adone.adoneNs

import typings.adone.adoneNs.INs.LazifyOptions
import typings.adone.adoneNs.INs.Runtime
import typings.adone.adoneNs.INs.Tag
import typings.adone.adoneNs.INs.datetimeNs.DatetimeFunction
import typings.adone.adoneNs.assertionNs.INs.AssertFunction
import typings.adone.adoneNs.assertionNs.INs.ExpectFunction
import typings.adone.adoneNumbers.`false`
import typings.adone.adoneNumbers.`true`
import typings.lodash.lodashMod.LoDashStatic
import typings.node.Buffer
import typings.node.NodeJSNs.Immediate
import typings.node.NodeJSNs.Process
import typings.node.NodeJSNs.Timeout
import typings.std.DateConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone")
@js.native
object ^ extends js.Object {
  val Date: js.Function0[String] with DateConstructor = js.native
  val EMPTY_BUFFER: Buffer = js.native
  val ETC_PATH: String = js.native
  val ROOT_PATH: String = js.native
  val _null: js.Symbol = js.native
  val assert: AssertFunction = js.native
  val bad: typings.adone.adoneStrings.bad = js.native
  val clearImmediate: js.Function1[/* immediateId */ Immediate, Unit] = js.native
  val clearInterval: js.Function1[/* intervalId */ Timeout, Unit] = js.native
  val clearTimeout: js.Function1[/* timeoutId */ Timeout, Unit] = js.native
  val configuration: js.Object = js.native
  /**
    * Creates a new datetime object
    */
  val datetime: DatetimeFunction = js.native
  val expect: ExpectFunction = js.native
  val hrtime: Process = js.native
  val lodash: LoDashStatic = js.native
  val ok: typings.adone.adoneStrings.ok = js.native
  val `package`: js.Object = js.native
  val runtime: Runtime = js.native
  val setImmediate: js.Function2[
    /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
    /* repeated */ js.Any, 
    Immediate
  ] = js.native
  val setInterval: js.Function3[
    /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
    /* ms */ Double, 
    /* repeated */ js.Any, 
    Timeout
  ] = js.native
  val setTimeout: js.Function3[
    /* callback */ js.Function1[/* repeated */ js.Any, Unit], 
    /* ms */ Double, 
    /* repeated */ js.Any, 
    Timeout
  ] = js.native
  val tag: Tag = js.native
  def definePrivate(modules: js.Object, obj: js.Object): js.Object = js.native
  def falsely(): `false` = js.native
  def getAssetAbsolutePath(relPath: String): String = js.native
  def identity[T](x: T): T = js.native
  def lazify(modules: js.Object): js.Object = js.native
  def lazify(modules: js.Object, obj: js.Object): js.Object = js.native
  def lazify(modules: js.Object, obj: js.Object, require: js.Function1[/* path */ String, _]): js.Object = js.native
  def lazify(
    modules: js.Object,
    obj: js.Object,
    require: js.Function1[/* path */ String, _],
    options: LazifyOptions
  ): js.Object = js.native
  def lazifyPrivate(modules: js.Object): js.Object = js.native
  def lazifyPrivate(modules: js.Object, obj: js.Object): js.Object = js.native
  def lazifyPrivate(modules: js.Object, obj: js.Object, require: js.Function1[/* path */ String, _]): js.Object = js.native
  def lazifyPrivate(
    modules: js.Object,
    obj: js.Object,
    require: js.Function1[/* path */ String, _],
    options: LazifyOptions
  ): js.Object = js.native
  def loadAsset(relPath: String): String | Buffer = js.native
  def log(args: js.Any*): Unit = js.native
  def logDebug(args: js.Any*): Unit = js.native
  def logError(args: js.Any*): Unit = js.native
  def logFatal(args: js.Any*): Unit = js.native
  def logInfo(args: js.Any*): Unit = js.native
  def logTrace(args: js.Any*): Unit = js.native
  def logWarn(args: js.Any*): Unit = js.native
  def noop(): Unit = js.native
  def o(props: js.Any*): js.Object = js.native
  def `private`(obj: js.Object): js.Any = js.native
  def require(path: String): js.Object = js.native
  def sprintf(format: String, args: js.Any*): String = js.native
  def truly(): `true` = js.native
}

