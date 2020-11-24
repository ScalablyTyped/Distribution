package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDataCatalogOutput extends js.Object {
  
  /**
    * The data catalog returned.
    */
  var DataCatalog: js.UndefOr[typings.awsSdk.athenaMod.DataCatalog] = js.native
}
object GetDataCatalogOutput {
  
  @scala.inline
  def apply(): GetDataCatalogOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataCatalogOutput]
  }
  
  @scala.inline
  implicit class GetDataCatalogOutputOps[Self <: GetDataCatalogOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataCatalog(value: DataCatalog): Self = this.set("DataCatalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataCatalog: Self = this.set("DataCatalog", js.undefined)
  }
}
