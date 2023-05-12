package typings.angularRouter.anon

import typings.angularRouter.angularRouterBooleans.`false`
import typings.angularRouter.angularRouterStrings.skipLocationChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var alias: skipLocationChange
  
  var required: `false`
}
object `4` {
  
  inline def apply(): `4` = {
    val __obj = js.Dynamic.literal(alias = "skipLocationChange", required = false)
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `4`] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: skipLocationChange): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: `false`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
