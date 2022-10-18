package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRulesOutput extends StObject {
  
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
  
  /**
    * Information about the rules.
    */
  var Rules: js.UndefOr[typings.awsSdk.clientsElbv2Mod.Rules] = js.undefined
}
object DescribeRulesOutput {
  
  inline def apply(): DescribeRulesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRulesOutput]
  }
  
  extension [Self <: DescribeRulesOutput](x: Self) {
    
    inline def setNextMarker(value: Marker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setRules(value: Rules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
