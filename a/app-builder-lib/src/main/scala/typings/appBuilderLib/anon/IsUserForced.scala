package typings.appBuilderLib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsUserForced extends StObject {
  
  var isUserForced: Boolean
  
  var pattern: String
}
object IsUserForced {
  
  inline def apply(isUserForced: Boolean, pattern: String): IsUserForced = {
    val __obj = js.Dynamic.literal(isUserForced = isUserForced.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsUserForced]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsUserForced] (val x: Self) extends AnyVal {
    
    inline def setIsUserForced(value: Boolean): Self = StObject.set(x, "isUserForced", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
  }
}
