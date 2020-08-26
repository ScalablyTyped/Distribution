package typings.arcgisRestApi.mod

import typings.arcgisRestApi.arcgisRestApiStrings.esriPFS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PictureFillSymbol
  extends Symbol
     with PictureSourced {
  var outline: js.UndefOr[SimpleLineSymbol] = js.native
  @JSName("type")
  var type_PictureFillSymbol: esriPFS = js.native
   // if outline has been specified
  var xscale: js.UndefOr[Double] = js.native
  var yscale: js.UndefOr[Double] = js.native
}

object PictureFillSymbol {
  @scala.inline
  def apply(`type`: esriPFS): PictureFillSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureFillSymbol]
  }
  @scala.inline
  implicit class PictureFillSymbolOps[Self <: PictureFillSymbol] (val x: Self) extends AnyVal {
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
    def setType(value: esriPFS): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutline(value: SimpleLineSymbol): Self = this.set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    @scala.inline
    def setXscale(value: Double): Self = this.set("xscale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXscale: Self = this.set("xscale", js.undefined)
    @scala.inline
    def setYscale(value: Double): Self = this.set("yscale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYscale: Self = this.set("yscale", js.undefined)
  }
  
}

