package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewCreateInstruction extends StObject {
  
  /**
    * Indicates that the view is being created by enhancing existing DOM.
    */
  var enhance: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies a key/value lookup of part replacements for the view being created.
    */
  var partReplacements: js.UndefOr[js.Object] = js.native
}
object ViewCreateInstruction {
  
  @scala.inline
  def apply(): ViewCreateInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewCreateInstruction]
  }
  
  @scala.inline
  implicit class ViewCreateInstructionMutableBuilder[Self <: ViewCreateInstruction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnhance(value: Boolean): Self = StObject.set(x, "enhance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnhanceUndefined: Self = StObject.set(x, "enhance", js.undefined)
    
    @scala.inline
    def setPartReplacements(value: js.Object): Self = StObject.set(x, "partReplacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartReplacementsUndefined: Self = StObject.set(x, "partReplacements", js.undefined)
  }
}
