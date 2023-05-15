package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.BackgroundInput
import typings.atlaskitTokens.anon.Transparent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.atlaskitTokens.distTypesTypesMod.AccentColorTokenSchema because var conflicts: color. Inlined 
- typings.atlaskitTokens.distTypesTypesMod.TextColorTokenSchema because var conflicts: color. Inlined 
- typings.atlaskitTokens.distTypesTypesMod.IconColorTokenSchema because var conflicts: color. Inlined 
- typings.atlaskitTokens.distTypesTypesMod.BorderColorTokenSchema because var conflicts: color. Inlined  */ trait ColorTokenSchema[BaseToken]
  extends StObject
     with BackgroundColorTokenSchema[BaseToken]
     with UtilTokenSchema[BaseToken]
object ColorTokenSchema {
  
  inline def apply[BaseToken](UNSAFE: Transparent, color: BackgroundInput[BaseToken]): ColorTokenSchema[BaseToken] = {
    val __obj = js.Dynamic.literal(UNSAFE = UNSAFE.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorTokenSchema[BaseToken]]
  }
}
