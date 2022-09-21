package typings.atlaskitTokens.typesTypesMod

import typings.atlaskitTokens.anon.BackgroundDangerDisabled
import typings.atlaskitTokens.anon.MISSINGTOKEN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.atlaskitTokens.typesTypesMod.AccentColorTokenSchema because var conflicts: color. Inlined 
- typings.atlaskitTokens.typesTypesMod.TextColorTokenSchema because var conflicts: color. Inlined 
- typings.atlaskitTokens.typesTypesMod.IconColorTokenSchema because var conflicts: color. Inlined 
- typings.atlaskitTokens.typesTypesMod.BorderColorTokenSchema because var conflicts: color. Inlined  */ trait ColorTokenSchema[BaseToken]
  extends StObject
     with BackgroundColorTokenSchema[BaseToken]
     with UtilTokenSchema[BaseToken]
object ColorTokenSchema {
  
  inline def apply[BaseToken](UNSAFE_util: MISSINGTOKEN, color: BackgroundDangerDisabled[BaseToken]): ColorTokenSchema[BaseToken] = {
    val __obj = js.Dynamic.literal(UNSAFE_util = UNSAFE_util.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorTokenSchema[BaseToken]]
  }
}
