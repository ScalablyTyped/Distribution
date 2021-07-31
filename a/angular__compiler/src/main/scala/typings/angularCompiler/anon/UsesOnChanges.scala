package typings.angularCompiler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsesOnChanges extends StObject {
  
  /**
    * Whether the directive uses NgOnChanges.
    */
  var usesOnChanges: Boolean
}
object UsesOnChanges {
  
  @scala.inline
  def apply(usesOnChanges: Boolean): UsesOnChanges = {
    val __obj = js.Dynamic.literal(usesOnChanges = usesOnChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsesOnChanges]
  }
  
  @scala.inline
  implicit class UsesOnChangesMutableBuilder[Self <: UsesOnChanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsesOnChanges(value: Boolean): Self = StObject.set(x, "usesOnChanges", value.asInstanceOf[js.Any])
  }
}
