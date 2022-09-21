package typings.angularCommon.anon

import typings.angularCommon.angularCommonBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Optional extends StObject {
  
  var optional: `true`
}
object Optional {
  
  inline def apply(): Optional = {
    val __obj = js.Dynamic.literal(optional = true)
    __obj.asInstanceOf[Optional]
  }
  
  extension [Self <: Optional](x: Self) {
    
    inline def setOptional(value: `true`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
  }
}
