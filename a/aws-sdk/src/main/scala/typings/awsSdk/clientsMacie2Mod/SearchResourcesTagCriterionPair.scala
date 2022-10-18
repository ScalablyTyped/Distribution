package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResourcesTagCriterionPair extends StObject {
  
  /**
    * The value for the tag key to use in the condition.
    */
  var key: js.UndefOr[string] = js.undefined
  
  /**
    * The tag value to use in the condition.
    */
  var value: js.UndefOr[string] = js.undefined
}
object SearchResourcesTagCriterionPair {
  
  inline def apply(): SearchResourcesTagCriterionPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResourcesTagCriterionPair]
  }
  
  extension [Self <: SearchResourcesTagCriterionPair](x: Self) {
    
    inline def setKey(value: string): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: string): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
