package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Count extends StObject {
  
  val Count: Double
  
  val Page: Boolean
}
object Count {
  
  @scala.inline
  def apply(Count: Double, Page: Boolean): Count = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Page = Page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  
  @scala.inline
  implicit class CountMutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Boolean): Self = StObject.set(x, "Page", value.asInstanceOf[js.Any])
  }
}
