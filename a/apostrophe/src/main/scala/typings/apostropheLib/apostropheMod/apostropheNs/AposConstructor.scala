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

