package typings.arangodb.anon

import typings.arangodb.ArangoDB.ArangoSearchViewConsolidationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Threshold extends StObject {
  
  var segmentThreshold: js.UndefOr[Double] = js.undefined
  
  var threshold: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[ArangoSearchViewConsolidationType] = js.undefined
}
object Threshold {
  
  @scala.inline
  def apply(): Threshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Threshold]
  }
  
  @scala.inline
  implicit class ThresholdMutableBuilder[Self <: Threshold] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegmentThreshold(value: Double): Self = StObject.set(x, "segmentThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentThresholdUndefined: Self = StObject.set(x, "segmentThreshold", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    @scala.inline
    def setType(value: ArangoSearchViewConsolidationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
