package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backwards extends StObject {
  
  var backwards: js.UndefOr[Boolean] = js.undefined
}
object Backwards {
  
  @scala.inline
  def apply(): Backwards = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Backwards]
  }
  
  @scala.inline
  implicit class BackwardsMutableBuilder[Self <: Backwards] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackwards(value: Boolean): Self = StObject.set(x, "backwards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackwardsUndefined: Self = StObject.set(x, "backwards", js.undefined)
  }
}
