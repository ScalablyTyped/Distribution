package typings.angularOdataResources.OData

import typings.angularOdataResources.anon.Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Currently supported options for the $resource factory options argument.
  */
@js.native
trait IResourceOptions extends js.Object {
  var isodatav4: js.UndefOr[Boolean] = js.native
  var odata: js.UndefOr[Method] = js.native
  /**
    * If true then the trailing slashes from any calculated URL will be stripped (defaults to true)
    */
  var stripTrailingSlashes: js.UndefOr[Boolean] = js.native
}

object IResourceOptions {
  @scala.inline
  def apply(): IResourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResourceOptions]
  }
  @scala.inline
  implicit class IResourceOptionsOps[Self <: IResourceOptions] (val x: Self) extends AnyVal {
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
    def setIsodatav4(value: Boolean): Self = this.set("isodatav4", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsodatav4: Self = this.set("isodatav4", js.undefined)
    @scala.inline
    def setOdata(value: Method): Self = this.set("odata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOdata: Self = this.set("odata", js.undefined)
    @scala.inline
    def setStripTrailingSlashes(value: Boolean): Self = this.set("stripTrailingSlashes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripTrailingSlashes: Self = this.set("stripTrailingSlashes", js.undefined)
  }
  
}

