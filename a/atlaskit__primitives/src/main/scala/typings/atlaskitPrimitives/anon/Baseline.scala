package typings.atlaskitPrimitives.anon

import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.baseline
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.center
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.end
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.start
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.stretch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Baseline extends StObject {
  
  val baseline: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.baseline
  
  val center: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.center
  
  val end: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.end
  
  val start: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.start
  
  val stretch: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.stretch
}
object Baseline {
  
  inline def apply(): Baseline = {
    val __obj = js.Dynamic.literal(baseline = "baseline", center = "center", end = "end", start = "start", stretch = "stretch")
    __obj.asInstanceOf[Baseline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Baseline] (val x: Self) extends AnyVal {
    
    inline def setBaseline(value: baseline): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setCenter(value: center): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: end): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: start): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStretch(value: stretch): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
  }
}
