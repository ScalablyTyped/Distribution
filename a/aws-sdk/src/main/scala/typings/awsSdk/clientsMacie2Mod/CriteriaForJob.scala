package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CriteriaForJob extends StObject {
  
  /**
    * A property-based condition that defines a property, operator, and one or more values for including or excluding buckets from the job.
    */
  var simpleCriterion: js.UndefOr[SimpleCriterionForJob] = js.undefined
  
  /**
    * A tag-based condition that defines an operator and tag keys, tag values, or tag key and value pairs for including or excluding buckets from the job.
    */
  var tagCriterion: js.UndefOr[TagCriterionForJob] = js.undefined
}
object CriteriaForJob {
  
  inline def apply(): CriteriaForJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CriteriaForJob]
  }
  
  extension [Self <: CriteriaForJob](x: Self) {
    
    inline def setSimpleCriterion(value: SimpleCriterionForJob): Self = StObject.set(x, "simpleCriterion", value.asInstanceOf[js.Any])
    
    inline def setSimpleCriterionUndefined: Self = StObject.set(x, "simpleCriterion", js.undefined)
    
    inline def setTagCriterion(value: TagCriterionForJob): Self = StObject.set(x, "tagCriterion", value.asInstanceOf[js.Any])
    
    inline def setTagCriterionUndefined: Self = StObject.set(x, "tagCriterion", js.undefined)
  }
}
