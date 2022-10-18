package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsFilter extends StObject {
  
  /**
    * A conjunction (logical AND) of predicates, which is used in evaluating an analytics filter. The operator must have at least two predicates.
    */
  var And: js.UndefOr[AnalyticsAndOperator] = js.undefined
  
  /**
    * The prefix to use when evaluating an analytics filter.
    */
  var Prefix: js.UndefOr[typings.awsSdk.clientsS3Mod.Prefix] = js.undefined
  
  /**
    * The tag to use when evaluating an analytics filter.
    */
  var Tag: js.UndefOr[typings.awsSdk.clientsS3Mod.Tag] = js.undefined
}
object AnalyticsFilter {
  
  inline def apply(): AnalyticsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsFilter]
  }
  
  extension [Self <: AnalyticsFilter](x: Self) {
    
    inline def setAnd(value: AnalyticsAndOperator): Self = StObject.set(x, "And", value.asInstanceOf[js.Any])
    
    inline def setAndUndefined: Self = StObject.set(x, "And", js.undefined)
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setTag(value: Tag): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
