package typings
package adoneLib.adoneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone")
@js.native
object adoneNsMembers extends js.Object {
  val Date: js.Function0[java.lang.String] with stdLib.DateConstructor = js.native
  val EMPTY_BUFFER: nodeLib.Buffer = js.native
  val ETC_PATH: java.lang.String = js.native
  val ROOT_PATH: java.lang.String = js.native
  val _null: js.Symbol = js.native
  val assert: adoneLib.adoneNs.assertionNs.INs.AssertFunction = js.native
  val async: adoneLib.Anon_Acc = js.native
  val bad: adoneLib.adoneLibStrings.bad = js.native
  val benchmark: adoneLib.Anon_BenchmarkAnonAccumulator = js.native
  val clearImmediate: js.Function1[/* immediateId */ nodeLib.NodeJSNs.Immediate, scala.Unit] = js.native
  val clearInterval: js.Function1[/* intervalId */ nodeLib.NodeJSNs.Timeout, scala.Unit] = js.native
  val clearTimeout: js.Function1[/* timeoutId */ nodeLib.NodeJSNs.Timeout, scala.Unit] = js.native
  val configuration: js.Object = js.native
  /**
    * Creates a new datetime object
    */
  val datetime: adoneLib.adoneNs.INs.datetimeNs.DatetimeFunction = js.native
  val expect: adoneLib.adoneNs.assertionNs.INs.ExpectFunction = js.native
  val hrtime: nodeLib.NodeJSNs.Process = js.native
  val lodash: lodashLib.lodashMod.underscoreNs.LoDashStatic = js.native
  val ok: adoneLib.adoneLibStrings.ok = js.native
  val `package`: js.Object = js.native
  val runtime: adoneLib.adoneNs.INs.Runtime = js.native
  val setImmediate: js.Function2[
    /* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], 
    /* repeated */ js.Any, 
    nodeLib.NodeJSNs.Immediate
  ] = js.native
  val setInterval: js.Function3[
    /* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], 
    /* ms */ scala.Double, 
    /* repeated */ js.Any, 
    nodeLib.NodeJSNs.Timeout
  ] = js.native
  val setTimeout: js.Function3[
    /* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], 
    /* ms */ scala.Double, 
    /* repeated */ js.Any, 
    nodeLib.NodeJSNs.Timeout
  ] = js.native
  val std: adoneLib.Anon_Assert = js.native
  val tag: adoneLib.adoneNs.INs.Tag = js.native
  def definePrivate(modules: js.Object, obj: js.Object): js.Object = js.native
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

