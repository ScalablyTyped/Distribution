package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.Group
import typings.atlaskitTokens.atlaskitTokensStrings.palette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaletteToken
  extends StObject
     with BaseToken[String, palette] {
  
  @JSName("attributes")
  var attributes_PaletteToken: Group
}
object PaletteToken {
  
  inline def apply(attributes: Group, value: String): PaletteToken = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaletteToken]
  }
  
  extension [Self <: PaletteToken](x: Self) {
    
    inline def setAttributes(value: Group): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
  }
}
