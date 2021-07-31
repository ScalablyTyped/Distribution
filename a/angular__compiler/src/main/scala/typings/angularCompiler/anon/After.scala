package typings.angularCompiler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait After extends StObject {
  
  var after: String
  
  var before: String
}
object After {
  
  @scala.inline
  def apply(after: String, before: String): After = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any])
    __obj.asInstanceOf[After]
  }
  
  @scala.inline
  implicit class AfterMutableBuilder[Self <: After] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
  }
}
