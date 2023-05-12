package typings.angularRouter.anon

import typings.angularRouter.angularRouterStrings.isActiveChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsActiveChange extends StObject {
  
  var isActiveChange: typings.angularRouter.angularRouterStrings.isActiveChange
}
object IsActiveChange {
  
  inline def apply(): IsActiveChange = {
    val __obj = js.Dynamic.literal(isActiveChange = "isActiveChange")
    __obj.asInstanceOf[IsActiveChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsActiveChange] (val x: Self) extends AnyVal {
    
    inline def setIsActiveChange(value: isActiveChange): Self = StObject.set(x, "isActiveChange", value.asInstanceOf[js.Any])
  }
}
