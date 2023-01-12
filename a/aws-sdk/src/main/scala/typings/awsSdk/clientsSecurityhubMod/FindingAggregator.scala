package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindingAggregator extends StObject {
  
  /**
    * The ARN of the finding aggregator. You use the finding aggregator ARN to retrieve details for, update, and delete the finding aggregator.
    */
  var FindingAggregatorArn: js.UndefOr[NonEmptyString] = js.undefined
}
object FindingAggregator {
  
  inline def apply(): FindingAggregator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingAggregator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FindingAggregator] (val x: Self) extends AnyVal {
    
    inline def setFindingAggregatorArn(value: NonEmptyString): Self = StObject.set(x, "FindingAggregatorArn", value.asInstanceOf[js.Any])
    
    inline def setFindingAggregatorArnUndefined: Self = StObject.set(x, "FindingAggregatorArn", js.undefined)
  }
}
