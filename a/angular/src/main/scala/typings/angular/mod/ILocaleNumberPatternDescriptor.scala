package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILocaleNumberPatternDescriptor extends StObject {
  
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
  implicit class ILocaleNumberPatternDescriptorMutableBuilder[Self <: ILocaleNumberPatternDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGSize(value: Double): Self = StObject.set(x, "gSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLgSize(value: Double): Self = StObject.set(x, "lgSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFrac(value: Double): Self = StObject.set(x, "maxFrac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinFrac(value: Double): Self = StObject.set(x, "minFrac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinInt(value: Double): Self = StObject.set(x, "minInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegPre(value: String): Self = StObject.set(x, "negPre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegSuf(value: String): Self = StObject.set(x, "negSuf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosPre(value: String): Self = StObject.set(x, "posPre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosSuf(value: String): Self = StObject.set(x, "posSuf", value.asInstanceOf[js.Any])
  }
}
