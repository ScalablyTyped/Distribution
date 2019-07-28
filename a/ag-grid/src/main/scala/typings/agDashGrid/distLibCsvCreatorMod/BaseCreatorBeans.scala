package typings.agDashGrid.distLibCsvCreatorMod

import typings.agDashGrid.distLibDownloaderMod.Downloader
import typings.agDashGrid.distLibGridOptionsWrapperMod.GridOptionsWrapper
import typings.agDashGrid.distLibGridSerializerMod.GridSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseCreatorBeans extends js.Object {
  var downloader: Downloader
  var gridOptionsWrapper: GridOptionsWrapper
  var gridSerializer: GridSerializer
}

object BaseCreatorBeans {
  @scala.inline
  def apply(downloader: Downloader, gridOptionsWrapper: GridOptionsWrapper, gridSerializer: GridSerializer): BaseCreatorBeans = {
    val __obj = js.Dynamic.literal(downloader = downloader, gridOptionsWrapper = gridOptionsWrapper, gridSerializer = gridSerializer)
  
    __obj.asInstanceOf[BaseCreatorBeans]
  }
}

