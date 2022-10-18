package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResourcesCriteria extends StObject {
  
  /**
    * A property-based condition that defines a property, operator, and one or more values for including or excluding resources from the results.
    */
  var simpleCriterion: js.UndefOr[SearchResourcesSimpleCriterion] = js.undefined
  
  /**
    * A tag-based condition that defines an operator and tag keys, tag values, or tag key and value pairs for including or excluding resources from the results.
    */
  var tagCriterion: js.UndefOr[SearchResourcesTagCriterion] = js.undefined
}
object SearchResourcesCriteria {
  
  inline def apply(): SearchResourcesCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResourcesCriteria]
  }
  
  extension [Self <: SearchResourcesCriteria](x: Self) {
    
    inline def setSimpleCriterion(value: SearchResourcesSimpleCriterion): Self = StObject.set(x, "simpleCriterion", value.asInstanceOf[js.Any])
    
    inline def setSimpleCriterionUndefined: Self = StObject.set(x, "simpleCriterion", js.undefined)
    
    inline def setTagCriterion(value: SearchResourcesTagCriterion): Self = StObject.set(x, "tagCriterion", value.asInstanceOf[js.Any])
    
    inline def setTagCriterionUndefined: Self = StObject.set(x, "tagCriterion", js.undefined)
  }
}
