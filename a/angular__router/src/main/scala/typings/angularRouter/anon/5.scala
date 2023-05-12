package typings.angularRouter.anon

import typings.angularRouter.angularRouterBooleans.`false`
import typings.angularRouter.angularRouterStrings.replaceUrl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  var alias: replaceUrl
  
  var required: `false`
}
object `5` {
  
  inline def apply(): `5` = {
    val __obj = js.Dynamic.literal(alias = "replaceUrl", required = false)
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `5`] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: replaceUrl): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: `false`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
