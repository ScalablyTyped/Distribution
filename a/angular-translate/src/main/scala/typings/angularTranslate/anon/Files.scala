package typings.angularTranslate.anon

import typings.angularTranslate.mod.angularAugmentingMod.translate.IStaticFilesLoaderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Files extends js.Object {
  var files: js.Array[IStaticFilesLoaderOptions]
}

object Files {
  @scala.inline
  def apply(files: js.Array[IStaticFilesLoaderOptions]): Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Files]
  }
}

