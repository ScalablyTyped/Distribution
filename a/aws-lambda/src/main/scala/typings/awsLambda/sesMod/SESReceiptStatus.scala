package typings.awsLambda.sesMod

import typings.awsLambda.awsLambdaStrings.DISABLED
import typings.awsLambda.awsLambdaStrings.FAIL
import typings.awsLambda.awsLambdaStrings.GRAY
import typings.awsLambda.awsLambdaStrings.PASS
import typings.awsLambda.awsLambdaStrings.PROCESSING_FAILED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SESReceiptStatus extends StObject {
  
  var status: PASS | FAIL | GRAY | PROCESSING_FAILED | DISABLED
}
object SESReceiptStatus {
  
  inline def apply(status: PASS | FAIL | GRAY | PROCESSING_FAILED | DISABLED): SESReceiptStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SESReceiptStatus]
  }
  
  extension [Self <: SESReceiptStatus](x: Self) {
    
    inline def setStatus(value: PASS | FAIL | GRAY | PROCESSING_FAILED | DISABLED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
