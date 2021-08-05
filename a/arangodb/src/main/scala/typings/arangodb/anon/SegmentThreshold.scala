package typings.arangodb.anon

import typings.arangodb.ArangoDB.ArangoSearchViewConsolidationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentThreshold extends StObject {
  
  var segmentThreshold: Double
  
  var threshold: Double
  
  var `type`: ArangoSearchViewConsolidationType
}
object SegmentThreshold {
  
  inline def apply(segmentThreshold: Double, threshold: Double, `type`: ArangoSearchViewConsolidationType): SegmentThreshold = {
    val __obj = js.Dynamic.literal(segmentThreshold = segmentThreshold.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentThreshold]
  }
  
  extension [Self <: SegmentThreshold](x: Self) {
    
    inline def setSegmentThreshold(value: Double): Self = StObject.set(x, "segmentThreshold", value.asInstanceOf[js.Any])
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setType(value: ArangoSearchViewConsolidationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
