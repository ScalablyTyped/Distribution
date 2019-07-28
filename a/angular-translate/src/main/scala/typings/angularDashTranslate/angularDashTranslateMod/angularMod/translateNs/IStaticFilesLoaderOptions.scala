package typings.angularDashTranslate.angularDashTranslateMod.angularMod.translateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStaticFilesLoaderOptions extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var prefix: String
  var suffix: String
}

object IStaticFilesLoaderOptions {
  @scala.inline
  def apply(prefix: String, suffix: String, key: String = null): IStaticFilesLoaderOptions = {
    val __obj = js.Dynamic.literal(prefix = prefix, suffix = suffix)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[IStaticFilesLoaderOptions]
  }
}

