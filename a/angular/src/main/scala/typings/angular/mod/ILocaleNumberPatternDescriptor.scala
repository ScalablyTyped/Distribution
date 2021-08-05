package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILocaleNumberPatternDescriptor extends StObject {
  
  var gSize: Double
  
  var lgSize: Double
  
  var maxFrac: Double
  
  var minFrac: Double
  
  var minInt: Double
  
  var negPre: String
  
  var negSuf: String
  
  var posPre: String
  
  var posSuf: String
}
object ILocaleNumberPatternDescriptor {
  
  inline def apply(
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
  
  extension [Self <: ILocaleNumberPatternDescriptor](x: Self) {
    
    inline def setGSize(value: Double): Self = StObject.set(x, "gSize", value.asInstanceOf[js.Any])
    
    inline def setLgSize(value: Double): Self = StObject.set(x, "lgSize", value.asInstanceOf[js.Any])
    
    inline def setMaxFrac(value: Double): Self = StObject.set(x, "maxFrac", value.asInstanceOf[js.Any])
    
    inline def setMinFrac(value: Double): Self = StObject.set(x, "minFrac", value.asInstanceOf[js.Any])
    
    inline def setMinInt(value: Double): Self = StObject.set(x, "minInt", value.asInstanceOf[js.Any])
    
    inline def setNegPre(value: String): Self = StObject.set(x, "negPre", value.asInstanceOf[js.Any])
    
    inline def setNegSuf(value: String): Self = StObject.set(x, "negSuf", value.asInstanceOf[js.Any])
    
    inline def setPosPre(value: String): Self = StObject.set(x, "posPre", value.asInstanceOf[js.Any])
    
    inline def setPosSuf(value: String): Self = StObject.set(x, "posSuf", value.asInstanceOf[js.Any])
  }
}
