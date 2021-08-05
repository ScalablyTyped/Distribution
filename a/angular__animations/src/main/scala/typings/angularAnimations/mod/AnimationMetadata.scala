package typings.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationMetadata extends StObject {
  
  var `type`: AnimationMetadataType
}
object AnimationMetadata {
  
  inline def apply(`type`: AnimationMetadataType): AnimationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationMetadata]
  }
  
  extension [Self <: AnimationMetadata](x: Self) {
    
    inline def setType(value: AnimationMetadataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
