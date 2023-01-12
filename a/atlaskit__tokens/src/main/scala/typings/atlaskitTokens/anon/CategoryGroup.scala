package typings.atlaskitTokens.anon

import typings.atlaskitTokens.atlaskitTokensStrings.palette
import typings.atlaskitTokens.distTypesTypesMod.PaletteCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoryGroup extends StObject {
  
  var category: PaletteCategory
  
  var group: palette
}
object CategoryGroup {
  
  inline def apply(category: PaletteCategory): CategoryGroup = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], group = "palette")
    __obj.asInstanceOf[CategoryGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CategoryGroup] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: PaletteCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: palette): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
  }
}
