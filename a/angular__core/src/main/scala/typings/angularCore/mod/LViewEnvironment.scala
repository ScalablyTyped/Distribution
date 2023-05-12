package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contextual data that is shared across multiple instances of `LView` in the same application.
  */
trait LViewEnvironment extends StObject {
  
  /** Container for reactivity system `effect`s. */
  var effectManager: EffectManager | Null
  
  /** Factory to be used for creating Renderer. */
  var rendererFactory: RendererFactory
  
  /** An optional custom sanitizer. */
  var sanitizer: Sanitizer | Null
}
object LViewEnvironment {
  
  inline def apply(rendererFactory: RendererFactory): LViewEnvironment = {
    val __obj = js.Dynamic.literal(rendererFactory = rendererFactory.asInstanceOf[js.Any], effectManager = null, sanitizer = null)
    __obj.asInstanceOf[LViewEnvironment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LViewEnvironment] (val x: Self) extends AnyVal {
    
    inline def setEffectManager(value: EffectManager): Self = StObject.set(x, "effectManager", value.asInstanceOf[js.Any])
    
    inline def setEffectManagerNull: Self = StObject.set(x, "effectManager", null)
    
    inline def setRendererFactory(value: RendererFactory): Self = StObject.set(x, "rendererFactory", value.asInstanceOf[js.Any])
    
    inline def setSanitizer(value: Sanitizer): Self = StObject.set(x, "sanitizer", value.asInstanceOf[js.Any])
    
    inline def setSanitizerNull: Self = StObject.set(x, "sanitizer", null)
  }
}
