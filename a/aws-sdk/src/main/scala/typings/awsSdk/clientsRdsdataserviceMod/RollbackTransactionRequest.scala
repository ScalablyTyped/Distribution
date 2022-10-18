package typings.awsSdk.clientsRdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollbackTransactionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
    */
  var resourceArn: Arn
  
  /**
    * The name or ARN of the secret that enables access to the DB cluster.
    */
  var secretArn: Arn
  
  /**
    * The identifier of the transaction to roll back.
    */
  var transactionId: Id
}
object RollbackTransactionRequest {
  
  inline def apply(resourceArn: Arn, secretArn: Arn, transactionId: Id): RollbackTransactionRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollbackTransactionRequest]
  }
  
  extension [Self <: RollbackTransactionRequest](x: Self) {
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setSecretArn(value: Arn): Self = StObject.set(x, "secretArn", value.asInstanceOf[js.Any])
    
    inline def setTransactionId(value: Id): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
  }
}
