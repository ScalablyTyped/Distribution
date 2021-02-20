package typings.astTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parenthesized extends StObject {
  
  var parenthesized: Boolean = js.native
}
object Parenthesized {
  
  @scala.inline
  def apply(parenthesized: Boolean): Parenthesized = {
    val __obj = js.Dynamic.literal(parenthesized = parenthesized.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parenthesized]
  }
  
  @scala.inline
  implicit class ParenthesizedMutableBuilder[Self <: Parenthesized] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParenthesized(value: Boolean): Self = StObject.set(x, "parenthesized", value.asInstanceOf[js.Any])
  }
}
