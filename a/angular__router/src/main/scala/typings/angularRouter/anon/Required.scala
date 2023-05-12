package typings.angularRouter.anon

import typings.angularRouter.angularRouterBooleans.`false`
import typings.angularRouter.angularRouterStrings.queryParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Required extends StObject {
  
  var alias: queryParams
  
  var required: `false`
}
object Required {
  
  inline def apply(): Required = {
    val __obj = js.Dynamic.literal(alias = "queryParams", required = false)
    __obj.asInstanceOf[Required]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Required] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: queryParams): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: `false`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}
