package typings
package angularDashTranslateLib.angularDashTranslateMod.angularMod.translateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStaticFilesLoaderOptions extends js.Object {
  var key: js.UndefOr[java.lang.String] = js.undefined
  var prefix: java.lang.String
  var suffix: java.lang.String
}

object IStaticFilesLoaderOptions {
  @scala.inline
  def apply(prefix: java.lang.String, suffix: java.lang.String, key: java.lang.String = null): IStaticFilesLoaderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("prefix")(prefix)
    __obj.updateDynamic("suffix")(suffix)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[IStaticFilesLoaderOptions]
  }
}

