package typings.antvDataSet.transformRegressionMod

import typings.antvDataSet.antvDataSetStrings.exponential
import typings.antvDataSet.antvDataSetStrings.linear
import typings.antvDataSet.antvDataSetStrings.logarithmic
import typings.antvDataSet.antvDataSetStrings.polynomial
import typings.antvDataSet.antvDataSetStrings.power
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var as: js.UndefOr[js.Array[String]] = js.native
  
  var bandwidth: js.UndefOr[Double] = js.native
  
  var extent: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var fields: js.Array[String] = js.native
  
  var method: js.UndefOr[linear | exponential | logarithmic | power | polynomial] = js.native
  
  var order: js.UndefOr[Double] = js.native
  
  var precision: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(fields: js.Array[String]): Options = {
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
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsVarargs(value: String*): Self = this.set("as", js.Array(value :_*))
    
    @scala.inline
    def setAs(value: js.Array[String]): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setBandwidth(value: Double): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBandwidth: Self = this.set("bandwidth", js.undefined)
    
    @scala.inline
    def setExtent(value: js.Tuple2[Double, Double]): Self = this.set("extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    
    @scala.inline
    def setMethod(value: linear | exponential | logarithmic | power | polynomial): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
  }
}
