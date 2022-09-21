package typings.angularCommon.anon

import typings.angularCommon.angularCommonStrings.ngSwitchCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgSwitchCase extends StObject {
  
  var ngSwitchCase: typings.angularCommon.angularCommonStrings.ngSwitchCase
}
object NgSwitchCase {
  
  inline def apply(): NgSwitchCase = {
    val __obj = js.Dynamic.literal(ngSwitchCase = "ngSwitchCase")
    __obj.asInstanceOf[NgSwitchCase]
  }
  
  extension [Self <: NgSwitchCase](x: Self) {
    
    inline def setNgSwitchCase(value: ngSwitchCase): Self = StObject.set(x, "ngSwitchCase", value.asInstanceOf[js.Any])
  }
}
