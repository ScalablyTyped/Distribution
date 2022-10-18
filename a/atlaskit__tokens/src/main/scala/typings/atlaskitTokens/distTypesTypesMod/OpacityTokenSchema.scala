package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.Loading
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpacityTokenSchema extends StObject {
  
  var opacity: Loading
}
object OpacityTokenSchema {
  
  inline def apply(opacity: Loading): OpacityTokenSchema = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacityTokenSchema]
  }
  
  extension [Self <: OpacityTokenSchema](x: Self) {
    
    inline def setOpacity(value: Loading): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
  }
}
