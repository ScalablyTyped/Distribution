package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgSwitchCase extends StObject {
  
  var ngSwitchCase: `21`
}
object NgSwitchCase {
  
  inline def apply(ngSwitchCase: `21`): NgSwitchCase = {
    val __obj = js.Dynamic.literal(ngSwitchCase = ngSwitchCase.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgSwitchCase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NgSwitchCase] (val x: Self) extends AnyVal {
    
    inline def setNgSwitchCase(value: `21`): Self = StObject.set(x, "ngSwitchCase", value.asInstanceOf[js.Any])
  }
}
