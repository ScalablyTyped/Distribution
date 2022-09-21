package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewCreateInstruction extends StObject {
  
  /**
  	* Indicates that the view is being created by enhancing existing DOM.
  	*/
  var enhance: js.UndefOr[Boolean] = js.undefined
  
  /**
  	* Specifies a key/value lookup of part replacements for the view being created.
  	*/
  var partReplacements: js.UndefOr[js.Object] = js.undefined
}
object ViewCreateInstruction {
  
  inline def apply(): ViewCreateInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewCreateInstruction]
  }
  
  extension [Self <: ViewCreateInstruction](x: Self) {
    
    inline def setEnhance(value: Boolean): Self = StObject.set(x, "enhance", value.asInstanceOf[js.Any])
    
    inline def setEnhanceUndefined: Self = StObject.set(x, "enhance", js.undefined)
    
    inline def setPartReplacements(value: js.Object): Self = StObject.set(x, "partReplacements", value.asInstanceOf[js.Any])
    
    inline def setPartReplacementsUndefined: Self = StObject.set(x, "partReplacements", js.undefined)
  }
}
