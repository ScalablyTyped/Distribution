package typings
package apostropheLib.apostropheMod.apostropheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Pass in custom modules as first argument
// second argument is additional custom options e.g. restApi exposed by apostrophe-headless
trait AposConstructor[M, O] extends js.Object {
  var afterInit: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var afterListen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  var initFailed: js.UndefOr[js.Function1[/* error */ js.Any, scala.Unit]] = js.undefined
  var modules: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in apostrophe.apostrophe.apostrophe.AposCoreModules & M ]:? apostrophe.apostrophe.apostrophe.AposModuleOptions<{}> | O}
    */ apostropheLib.apostropheLibStrings.AposConstructor with js.Any
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
  var rootDir: js.UndefOr[java.lang.String] = js.undefined
  var shortName: java.lang.String
}

object AposConstructor {
  @scala.inline
  def apply[M, O](
    modules: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in apostrophe.apostrophe.apostrophe.AposCoreModules & M ]:? apostrophe.apostrophe.apostrophe.AposModuleOptions<{}> | O}
    */ apostropheLib.apostropheLibStrings.AposConstructor with js.Any,
    shortName: java.lang.String,
    afterInit: js.Function0[scala.Unit] = null,
    afterListen: js.Function0[scala.Unit] = null,
    baseUrl: java.lang.String = null,
    initFailed: js.Function1[/* error */ js.Any, scala.Unit] = null,
    prefix: java.lang.String = null,
    root: java.lang.String = null,
    rootDir: java.lang.String = null
  ): AposConstructor[M, O] = {
    val __obj = js.Dynamic.literal(modules = modules, shortName = shortName)
    if (afterInit != null) __obj.updateDynamic("afterInit")(afterInit)
    if (afterListen != null) __obj.updateDynamic("afterListen")(afterListen)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (initFailed != null) __obj.updateDynamic("initFailed")(initFailed)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (root != null) __obj.updateDynamic("root")(root)
    if (rootDir != null) __obj.updateDynamic("rootDir")(rootDir)
    __obj.asInstanceOf[AposConstructor[M, O]]
  }
}

