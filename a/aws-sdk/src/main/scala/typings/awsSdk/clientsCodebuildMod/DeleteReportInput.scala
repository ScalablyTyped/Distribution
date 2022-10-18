package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReportInput extends StObject {
  
  /**
    *  The ARN of the report to delete. 
    */
  var arn: NonEmptyString
}
object DeleteReportInput {
  
  inline def apply(arn: NonEmptyString): DeleteReportInput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReportInput]
  }
  
  extension [Self <: DeleteReportInput](x: Self) {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
