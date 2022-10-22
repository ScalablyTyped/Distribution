package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.ContainerScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpacingTokenSchema[BaseToken] extends StObject {
  
  var spacing: ContainerScale[BaseToken]
}
object SpacingTokenSchema {
  
  inline def apply[BaseToken](spacing: ContainerScale[BaseToken]): SpacingTokenSchema[BaseToken] = {
    val __obj = js.Dynamic.literal(spacing = spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpacingTokenSchema[BaseToken]]
  }
  
  extension [Self <: SpacingTokenSchema[?], BaseToken](x: Self & SpacingTokenSchema[BaseToken]) {
    
    inline def setSpacing(value: ContainerScale[BaseToken]): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
  }
}
