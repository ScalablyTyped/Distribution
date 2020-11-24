package typings.antvDataSet.densityMod

import typings.antvDataSet.antvDataSetStrings.boxcar
import typings.antvDataSet.antvDataSetStrings.cosine
import typings.antvDataSet.antvDataSetStrings.epanechnikov
import typings.antvDataSet.antvDataSetStrings.gaussian
import typings.antvDataSet.antvDataSetStrings.quartic
import typings.antvDataSet.antvDataSetStrings.triangular
import typings.antvDataSet.antvDataSetStrings.tricube
import typings.antvDataSet.antvDataSetStrings.triweight
import typings.antvDataSet.antvDataSetStrings.uniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var as: js.UndefOr[js.Tuple3[String, String, String]] = js.native
  
  var bandwidth: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var extent: js.UndefOr[js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]] = js.native
  
  var fields: js.Tuple2[String, String] = js.native
  
  var method: cosine | epanechnikov | gaussian | quartic | triangular | tricube | triweight | uniform | boxcar = js.native
}
object Options {
  
  @scala.inline
  def apply(
    fields: js.Tuple2[String, String],
    method: cosine | epanechnikov | gaussian | quartic | triangular | tricube | triweight | uniform | boxcar
  ): Options = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
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
    def setMethod(
      value: cosine | epanechnikov | gaussian | quartic | triangular | tricube | triweight | uniform | boxcar
    ): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAs(value: js.Tuple3[String, String, String]): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setBandwidth(value: js.Tuple2[Double, Double]): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBandwidth: Self = this.set("bandwidth", js.undefined)
    
    @scala.inline
    def setExtent(value: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): Self = this.set("extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
  }
}
