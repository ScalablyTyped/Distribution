package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResourcesBucketCriteria extends StObject {
  
  /**
    * The property- and tag-based conditions that determine which buckets to exclude from the results.
    */
  var excludes: js.UndefOr[SearchResourcesCriteriaBlock] = js.undefined
  
  /**
    * The property- and tag-based conditions that determine which buckets to include in the results.
    */
  var includes: js.UndefOr[SearchResourcesCriteriaBlock] = js.undefined
}
object SearchResourcesBucketCriteria {
  
  inline def apply(): SearchResourcesBucketCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResourcesBucketCriteria]
  }
  
  extension [Self <: SearchResourcesBucketCriteria](x: Self) {
    
    inline def setExcludes(value: SearchResourcesCriteriaBlock): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
    
    inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
    
    inline def setIncludes(value: SearchResourcesCriteriaBlock): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    inline def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
  }
}
