package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReplicationSetOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the replication set. 
    */
  var arn: Arn
}
object CreateReplicationSetOutput {
  
  inline def apply(arn: Arn): CreateReplicationSetOutput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReplicationSetOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateReplicationSetOutput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
