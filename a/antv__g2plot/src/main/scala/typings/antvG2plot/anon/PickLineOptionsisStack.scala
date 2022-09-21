package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@antv/g2plot.@antv/g2plot/lib/plots/line/types.LineOptions, 'isStack'> */
trait PickLineOptionsisStack extends StObject {
  
  var isStack: js.UndefOr[Boolean] = js.undefined
}
object PickLineOptionsisStack {
  
  inline def apply(): PickLineOptionsisStack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickLineOptionsisStack]
  }
  
  extension [Self <: PickLineOptionsisStack](x: Self) {
    
    inline def setIsStack(value: Boolean): Self = StObject.set(x, "isStack", value.asInstanceOf[js.Any])
    
    inline def setIsStackUndefined: Self = StObject.set(x, "isStack", js.undefined)
  }
}
