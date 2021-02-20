package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IterateOptions extends StObject {
  
  var limit: js.UndefOr[Double] = js.native
  
  var probability: js.UndefOr[Double] = js.native
}
object IterateOptions {
  
  @scala.inline
  def apply(): IterateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IterateOptions]
  }
  
  @scala.inline
  implicit class IterateOptionsMutableBuilder[Self <: IterateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setProbability(value: Double): Self = StObject.set(x, "probability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProbabilityUndefined: Self = StObject.set(x, "probability", js.undefined)
  }
}
