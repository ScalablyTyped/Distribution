package typings.agGrid.csvCreatorMod

import typings.agGrid.downloaderMod.Downloader
import typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typings.agGrid.gridSerializerMod.GridSerializer
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
    val __obj = js.Dynamic.literal(downloader = downloader.asInstanceOf[js.Any], gridOptionsWrapper = gridOptionsWrapper.asInstanceOf[js.Any], gridSerializer = gridSerializer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BaseCreatorBeans]
  }
}

