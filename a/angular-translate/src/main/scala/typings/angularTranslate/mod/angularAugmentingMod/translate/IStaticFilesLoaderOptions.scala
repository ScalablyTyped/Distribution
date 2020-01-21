package typings.angularTranslate.mod.angularAugmentingMod.translate

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
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStaticFilesLoaderOptions]
  }
}

