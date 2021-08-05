package typings.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  bubbles :boolean,   composed :boolean,   capturePhase :boolean}> */
trait Partialbubblesbooleancomp extends StObject {
  
  var bubbles: js.UndefOr[Boolean] = js.undefined
  
  var capturePhase: js.UndefOr[Boolean] = js.undefined
  
  var composed: js.UndefOr[Boolean] = js.undefined
}
object Partialbubblesbooleancomp {
  
  inline def apply(): Partialbubblesbooleancomp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialbubblesbooleancomp]
  }
  
  extension [Self <: Partialbubblesbooleancomp](x: Self) {
    
    inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
    
    inline def setCapturePhase(value: Boolean): Self = StObject.set(x, "capturePhase", value.asInstanceOf[js.Any])
    
    inline def setCapturePhaseUndefined: Self = StObject.set(x, "capturePhase", js.undefined)
    
    inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
    
    inline def setComposedUndefined: Self = StObject.set(x, "composed", js.undefined)
  }
}
