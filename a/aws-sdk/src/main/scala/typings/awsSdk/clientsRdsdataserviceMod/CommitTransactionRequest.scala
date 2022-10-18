package typings.awsSdk.clientsRdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitTransactionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
    */
  var resourceArn: Arn
  
  /**
    * The name or ARN of the secret that enables access to the DB cluster.
    */
  var secretArn: Arn
  
  /**
    * The identifier of the transaction to end and commit.
    */
  var transactionId: Id
}
object CommitTransactionRequest {
  
  inline def apply(resourceArn: Arn, secretArn: Arn, transactionId: Id): CommitTransactionRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitTransactionRequest]
  }
  
  extension [Self <: CommitTransactionRequest](x: Self) {
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setSecretArn(value: Arn): Self = StObject.set(x, "secretArn", value.asInstanceOf[js.Any])
    
    inline def setTransactionId(value: Id): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
  }
}
