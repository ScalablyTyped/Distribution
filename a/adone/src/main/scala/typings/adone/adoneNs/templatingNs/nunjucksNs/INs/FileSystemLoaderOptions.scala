package typings.adone.adoneNs.templatingNs.nunjucksNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystemLoaderOptions extends js.Object {
  var noCache: js.UndefOr[Boolean] = js.undefined
  var watch: js.UndefOr[Boolean] = js.undefined
}

object FileSystemLoaderOptions {
  @scala.inline
  def apply(noCache: js.UndefOr[Boolean] = js.undefined, watch: js.UndefOr[Boolean] = js.undefined): FileSystemLoaderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noCache)) __obj.updateDynamic("noCache")(noCache)
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[FileSystemLoaderOptions]
  }
}

