package typings.angularCommon.anon

import typings.angularCommon.angularCommonStrings.ngPlural
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgPlural extends StObject {
  
  var ngPlural: typings.angularCommon.angularCommonStrings.ngPlural
}
object NgPlural {
  
  inline def apply(): NgPlural = {
    val __obj = js.Dynamic.literal(ngPlural = "ngPlural")
    __obj.asInstanceOf[NgPlural]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NgPlural] (val x: Self) extends AnyVal {
    
    inline def setNgPlural(value: ngPlural): Self = StObject.set(x, "ngPlural", value.asInstanceOf[js.Any])
  }
}
