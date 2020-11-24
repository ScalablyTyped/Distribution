package typings.antvDataSet.hexagonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var as: js.UndefOr[js.Tuple3[String, String, String]] = js.native
  
  var binWidth: js.UndefOr[js.Array[Double]] = js.native
  
  var bins: js.UndefOr[js.Array[Double]] = js.native
  
  var fields: js.Tuple2[String, String] = js.native
  
  var offset: js.UndefOr[js.Array[Double]] = js.native
  
  var sizeByCount: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(fields: js.Tuple2[String, String]): Options = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setFields(value: js.Tuple2[String, String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAs(value: js.Tuple3[String, String, String]): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setBinWidthVarargs(value: Double*): Self = this.set("binWidth", js.Array(value :_*))
    
    @scala.inline
    def setBinWidth(value: js.Array[Double]): Self = this.set("binWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinWidth: Self = this.set("binWidth", js.undefined)
    
    @scala.inline
    def setBinsVarargs(value: Double*): Self = this.set("bins", js.Array(value :_*))
    
    @scala.inline
    def setBins(value: js.Array[Double]): Self = this.set("bins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBins: Self = this.set("bins", js.undefined)
    
    @scala.inline
    def setOffsetVarargs(value: Double*): Self = this.set("offset", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: js.Array[Double]): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setSizeByCount(value: Boolean): Self = this.set("sizeByCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeByCount: Self = this.set("sizeByCount", js.undefined)
  }
}
