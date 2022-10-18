package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.IconDisabledDiscovery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconColorTokenSchema[BaseToken] extends StObject {
  
  var color: IconDisabledDiscovery[BaseToken]
}
object IconColorTokenSchema {
  
  inline def apply[BaseToken](color: IconDisabledDiscovery[BaseToken]): IconColorTokenSchema[BaseToken] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconColorTokenSchema[BaseToken]]
  }
  
  extension [Self <: IconColorTokenSchema[?], BaseToken](x: Self & IconColorTokenSchema[BaseToken]) {
    
    inline def setColor(value: IconDisabledDiscovery[BaseToken]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
