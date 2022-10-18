package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopActivityStreamRequest extends StObject {
  
  /**
    * Specifies whether or not the database activity stream is to stop as soon as possible, regardless of the maintenance window for the database.
    */
  var ApplyImmediately: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the DB cluster for the database activity stream. For example, arn:aws:rds:us-east-1:12345667890:cluster:das-cluster.
    */
  var ResourceArn: String
}
object StopActivityStreamRequest {
  
  inline def apply(ResourceArn: String): StopActivityStreamRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopActivityStreamRequest]
  }
  
  extension [Self <: StopActivityStreamRequest](x: Self) {
    
    inline def setApplyImmediately(value: BooleanOptional): Self = StObject.set(x, "ApplyImmediately", value.asInstanceOf[js.Any])
    
    inline def setApplyImmediatelyUndefined: Self = StObject.set(x, "ApplyImmediately", js.undefined)
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
