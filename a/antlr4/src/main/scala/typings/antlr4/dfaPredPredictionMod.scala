package typings.antlr4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dfaPredPredictionMod {
  
  @JSImport("antlr4/dfa/PredPrediction", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with PredPrediction {
    def this(pred: typings.antlr4.atnSemanticContextMod.default, alt: Double) = this()
    
    /* CompleteClass */
    override val alt: Double = js.native
    
    /* CompleteClass */
    override val pred: typings.antlr4.atnSemanticContextMod.default = js.native
  }
  
  trait PredPrediction extends StObject {
    
    val alt: Double
    
    val pred: typings.antlr4.atnSemanticContextMod.default
  }
  object PredPrediction {
    
    inline def apply(alt: Double, pred: typings.antlr4.atnSemanticContextMod.default): PredPrediction = {
      val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], pred = pred.asInstanceOf[js.Any])
      __obj.asInstanceOf[PredPrediction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PredPrediction] (val x: Self) extends AnyVal {
      
      inline def setAlt(value: Double): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setPred(value: typings.antlr4.atnSemanticContextMod.default): Self = StObject.set(x, "pred", value.asInstanceOf[js.Any])
    }
  }
}
