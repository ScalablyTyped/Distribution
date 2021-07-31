package typings.aceBuilds.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait First extends StObject {
  
  var first: Double
  
  var last: Double
}
object First {
  
  @scala.inline
  def apply(first: Double, last: Double): First = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any])
    __obj.asInstanceOf[First]
  }
  
  @scala.inline
  implicit class FirstMutableBuilder[Self <: First] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst(value: Double): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast(value: Double): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
  }
}
