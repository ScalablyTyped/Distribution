package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyType extends StObject {
  
  var ApplyType: Double
  
  var Cancel: Double
}
object ApplyType {
  
  inline def apply(ApplyType: Double, Cancel: Double): ApplyType = {
    val __obj = js.Dynamic.literal(ApplyType = ApplyType.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyType]
  }
  
  extension [Self <: ApplyType](x: Self) {
    
    inline def setApplyType(value: Double): Self = StObject.set(x, "ApplyType", value.asInstanceOf[js.Any])
    
    inline def setCancel(value: Double): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
  }
}
