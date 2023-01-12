package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageMapFilter extends StObject {
  
  /**
    * The operator to compare coverage on.
    */
  var comparison: CoverageMapComparison
  
  /**
    * The tag key associated with the coverage map filter.
    */
  var key: NonEmptyString
  
  /**
    * The tag value associated with the coverage map filter.
    */
  var value: js.UndefOr[NonEmptyString] = js.undefined
}
object CoverageMapFilter {
  
  inline def apply(comparison: CoverageMapComparison, key: NonEmptyString): CoverageMapFilter = {
    val __obj = js.Dynamic.literal(comparison = comparison.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageMapFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageMapFilter] (val x: Self) extends AnyVal {
    
    inline def setComparison(value: CoverageMapComparison): Self = StObject.set(x, "comparison", value.asInstanceOf[js.Any])
    
    inline def setKey(value: NonEmptyString): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: NonEmptyString): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
