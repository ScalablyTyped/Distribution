package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILocaleNumberPatternDescriptor extends js.Object {
  
  var gSize: Double = js.native
  
  var lgSize: Double = js.native
  
  var maxFrac: Double = js.native
  
  var minFrac: Double = js.native
  
  var minInt: Double = js.native
  
  var negPre: String = js.native
  
  var negSuf: String = js.native
  
  var posPre: String = js.native
  
  var posSuf: String = js.native
}
object ILocaleNumberPatternDescriptor {
  
  @scala.inline
  def apply(
    gSize: Double,
    lgSize: Double,
    maxFrac: Double,
    minFrac: Double,
    minInt: Double,
    negPre: String,
    negSuf: String,
    posPre: String,
    posSuf: String
  ): ILocaleNumberPatternDescriptor = {
    val __obj = js.Dynamic.literal(gSize = gSize.asInstanceOf[js.Any], lgSize = lgSize.asInstanceOf[js.Any], maxFrac = maxFrac.asInstanceOf[js.Any], minFrac = minFrac.asInstanceOf[js.Any], minInt = minInt.asInstanceOf[js.Any], negPre = negPre.asInstanceOf[js.Any], negSuf = negSuf.asInstanceOf[js.Any], posPre = posPre.asInstanceOf[js.Any], posSuf = posSuf.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocaleNumberPatternDescriptor]
  }
  
  @scala.inline
  implicit class ILocaleNumberPatternDescriptorOps[Self <: ILocaleNumberPatternDescriptor] (val x: Self) extends AnyVal {
    
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
    def setGSize(value: Double): Self = this.set("gSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLgSize(value: Double): Self = this.set("lgSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFrac(value: Double): Self = this.set("maxFrac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinFrac(value: Double): Self = this.set("minFrac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinInt(value: Double): Self = this.set("minInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegPre(value: String): Self = this.set("negPre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegSuf(value: String): Self = this.set("negSuf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosPre(value: String): Self = this.set("posPre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosSuf(value: String): Self = this.set("posSuf", value.asInstanceOf[js.Any])
  }
}
