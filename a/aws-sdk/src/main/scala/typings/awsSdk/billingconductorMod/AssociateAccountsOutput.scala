package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateAccountsOutput extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the billing group that associates the array of account IDs. 
    */
  var Arn: js.UndefOr[BillingGroupArn] = js.undefined
}
object AssociateAccountsOutput {
  
  inline def apply(): AssociateAccountsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateAccountsOutput]
  }
  
  extension [Self <: AssociateAccountsOutput](x: Self) {
    
    inline def setArn(value: BillingGroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
