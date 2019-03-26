package typings
package agDashGridLib.distLibCsvCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseCreatorBeans extends js.Object {
  var downloader: agDashGridLib.distLibDownloaderMod.Downloader
  var gridOptionsWrapper: agDashGridLib.distLibGridOptionsWrapperMod.GridOptionsWrapper
  var gridSerializer: agDashGridLib.distLibGridSerializerMod.GridSerializer
}

object BaseCreatorBeans {
  @scala.inline
  def apply(
    downloader: agDashGridLib.distLibDownloaderMod.Downloader,
    gridOptionsWrapper: agDashGridLib.distLibGridOptionsWrapperMod.GridOptionsWrapper,
    gridSerializer: agDashGridLib.distLibGridSerializerMod.GridSerializer
  ): BaseCreatorBeans = {
    val __obj = js.Dynamic.literal(downloader = downloader, gridOptionsWrapper = gridOptionsWrapper, gridSerializer = gridSerializer)
  
    __obj.asInstanceOf[BaseCreatorBeans]
  }
}

