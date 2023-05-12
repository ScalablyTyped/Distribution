package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.ChartBlueBrand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartColorTokenSchema[BaseToken] extends StObject {
  
  var color: ChartBlueBrand[BaseToken]
}
object ChartColorTokenSchema {
  
  inline def apply[BaseToken](color: ChartBlueBrand[BaseToken]): ChartColorTokenSchema[BaseToken] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartColorTokenSchema[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartColorTokenSchema[?], BaseToken] (val x: Self & ChartColorTokenSchema[BaseToken]) extends AnyVal {
    
    inline def setColor(value: ChartBlueBrand[BaseToken]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
