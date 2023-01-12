package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.CategoryGroup
import typings.atlaskitTokens.atlaskitTokensStrings.palette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaletteToken
  extends StObject
     with BaseToken[String, palette] {
  
  @JSName("attributes")
  var attributes_PaletteToken: CategoryGroup
}
object PaletteToken {
  
  inline def apply(attributes: CategoryGroup, value: String): PaletteToken = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaletteToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaletteToken] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: CategoryGroup): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
  }
}
