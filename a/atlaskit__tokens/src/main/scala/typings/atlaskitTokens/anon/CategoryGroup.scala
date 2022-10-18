package typings.atlaskitTokens.anon

import typings.atlaskitTokens.atlaskitTokensStrings.palette
import typings.atlaskitTokens.distTypesTypesMod.ValueCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoryGroup extends StObject {
  
  var category: ValueCategory
  
  var group: palette
}
object CategoryGroup {
  
  inline def apply(category: ValueCategory): CategoryGroup = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], group = "palette")
    __obj.asInstanceOf[CategoryGroup]
  }
  
  extension [Self <: CategoryGroup](x: Self) {
    
    inline def setCategory(value: ValueCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: palette): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
  }
}
