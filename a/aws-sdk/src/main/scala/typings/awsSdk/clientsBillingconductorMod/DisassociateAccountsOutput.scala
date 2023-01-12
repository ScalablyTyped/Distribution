package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateAccountsOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the billing group that the array of account IDs is disassociated from. 
    */
  var Arn: js.UndefOr[BillingGroupArn] = js.undefined
}
object DisassociateAccountsOutput {
  
  inline def apply(): DisassociateAccountsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateAccountsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateAccountsOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: BillingGroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
