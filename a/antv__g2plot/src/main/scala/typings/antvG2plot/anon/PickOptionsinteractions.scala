package typings.antvG2plot.anon

import typings.antvG2plot.interactionMod.Interaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@antv/g2plot.@antv/g2plot/lib/types.Options, 'interactions'> */
trait PickOptionsinteractions extends StObject {
  
  var interactions: js.UndefOr[js.Array[Interaction]] = js.undefined
}
object PickOptionsinteractions {
  
  inline def apply(): PickOptionsinteractions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickOptionsinteractions]
  }
  
  extension [Self <: PickOptionsinteractions](x: Self) {
    
    inline def setInteractions(value: js.Array[Interaction]): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
    
    inline def setInteractionsUndefined: Self = StObject.set(x, "interactions", js.undefined)
    
    inline def setInteractionsVarargs(value: Interaction*): Self = StObject.set(x, "interactions", js.Array(value*))
  }
}
