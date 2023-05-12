package typings.angularRouter.anon

import typings.angularRouter.angularRouterBooleans.`false`
import typings.angularRouter.angularRouterStrings.ariaCurrentWhenActive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  var alias: ariaCurrentWhenActive
  
  var required: `false`
}
object `8` {
  
  inline def apply(): `8` = {
    val __obj = js.Dynamic.literal(alias = "ariaCurrentWhenActive", required = false)
    __obj.asInstanceOf[`8`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `8`] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: ariaCurrentWhenActive): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: `false`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
