package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILocalIdentificationBlock extends StObject {
  
  var isConstructed: scala.Boolean
  
  var tagClass: Double
  
  var tagNumber: Double
}
object ILocalIdentificationBlock {
  
  inline def apply(isConstructed: scala.Boolean, tagClass: Double, tagNumber: Double): ILocalIdentificationBlock = {
    val __obj = js.Dynamic.literal(isConstructed = isConstructed.asInstanceOf[js.Any], tagClass = tagClass.asInstanceOf[js.Any], tagNumber = tagNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILocalIdentificationBlock]
  }
  
  extension [Self <: ILocalIdentificationBlock](x: Self) {
    
    inline def setIsConstructed(value: scala.Boolean): Self = StObject.set(x, "isConstructed", value.asInstanceOf[js.Any])
    
    inline def setTagClass(value: Double): Self = StObject.set(x, "tagClass", value.asInstanceOf[js.Any])
    
    inline def setTagNumber(value: Double): Self = StObject.set(x, "tagNumber", value.asInstanceOf[js.Any])
  }
}
