package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLabelsResult extends StObject {
  
  /**
    * An array of labels.
    */
  var labels: js.UndefOr[labelList] = js.undefined
  
  /**
    * The next page token.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object GetLabelsResult {
  
  inline def apply(): GetLabelsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLabelsResult]
  }
  
  extension [Self <: GetLabelsResult](x: Self) {
    
    inline def setLabels(value: labelList): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: Label*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
