package typings.atlaskitTokens.anon

import typings.atlaskitTokens.atlaskitTokensStrings.palette
import typings.atlaskitTokens.typesTypesMod.PaletteCategory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group extends StObject {
  
  var category: PaletteCategory
  
  var group: palette
}
object Group {
  
  inline def apply(category: PaletteCategory): Group = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], group = "palette")
    __obj.asInstanceOf[Group]
  }
  
  extension [Self <: Group](x: Self) {
    
    inline def setCategory(value: PaletteCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: palette): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
  }
}
