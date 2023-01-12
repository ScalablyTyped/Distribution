package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestSegmentPatternRequest extends StObject {
  
  /**
    * The pattern to test.
    */
  var pattern: SegmentPattern
  
  /**
    * A sample evaluationContext JSON block to test against the specified pattern.
    */
  var payload: JsonValue
}
object TestSegmentPatternRequest {
  
  inline def apply(pattern: SegmentPattern, payload: JsonValue): TestSegmentPatternRequest = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSegmentPatternRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestSegmentPatternRequest] (val x: Self) extends AnyVal {
    
    inline def setPattern(value: SegmentPattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: JsonValue): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
