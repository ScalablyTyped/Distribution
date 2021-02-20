package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FacetHit extends StObject {
  
  /**
    * The count.
    */
  val count: Double = js.native
  
  /**
    * The highlighted value.
    */
  val highlighted: String = js.native
  
  /**
    * The value of the facet.
    */
  val value: String = js.native
}
object FacetHit {
  
  @scala.inline
  def apply(count: Double, highlighted: String, value: String): FacetHit = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacetHit]
  }
  
  @scala.inline
  implicit class FacetHitMutableBuilder[Self <: FacetHit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlighted(value: String): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
