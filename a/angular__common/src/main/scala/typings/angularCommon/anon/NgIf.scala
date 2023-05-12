package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgIf extends StObject {
  
  var ngIf: `13`
  
  var ngIfElse: `15`
  
  var ngIfThen: `14`
}
object NgIf {
  
  inline def apply(ngIf: `13`, ngIfElse: `15`, ngIfThen: `14`): NgIf = {
    val __obj = js.Dynamic.literal(ngIf = ngIf.asInstanceOf[js.Any], ngIfElse = ngIfElse.asInstanceOf[js.Any], ngIfThen = ngIfThen.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgIf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NgIf] (val x: Self) extends AnyVal {
    
    inline def setNgIf(value: `13`): Self = StObject.set(x, "ngIf", value.asInstanceOf[js.Any])
    
    inline def setNgIfElse(value: `15`): Self = StObject.set(x, "ngIfElse", value.asInstanceOf[js.Any])
    
    inline def setNgIfThen(value: `14`): Self = StObject.set(x, "ngIfThen", value.asInstanceOf[js.Any])
  }
}
