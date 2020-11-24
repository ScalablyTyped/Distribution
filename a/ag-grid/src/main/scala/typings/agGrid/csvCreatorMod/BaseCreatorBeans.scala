package typings.agGrid.csvCreatorMod

import typings.agGrid.downloaderMod.Downloader
import typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typings.agGrid.gridSerializerMod.GridSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseCreatorBeans extends js.Object {
  
  var downloader: Downloader = js.native
  
  var gridOptionsWrapper: GridOptionsWrapper = js.native
  
  var gridSerializer: GridSerializer = js.native
}
object BaseCreatorBeans {
  
  @scala.inline
  def apply(downloader: Downloader, gridOptionsWrapper: GridOptionsWrapper, gridSerializer: GridSerializer): BaseCreatorBeans = {
    val __obj = js.Dynamic.literal(downloader = downloader.asInstanceOf[js.Any], gridOptionsWrapper = gridOptionsWrapper.asInstanceOf[js.Any], gridSerializer = gridSerializer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseCreatorBeans]
  }
  
  @scala.inline
  implicit class BaseCreatorBeansOps[Self <: BaseCreatorBeans] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDownloader(value: Downloader): Self = this.set("downloader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridOptionsWrapper(value: GridOptionsWrapper): Self = this.set("gridOptionsWrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridSerializer(value: GridSerializer): Self = this.set("gridSerializer", value.asInstanceOf[js.Any])
  }
}
