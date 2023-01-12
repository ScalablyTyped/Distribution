package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReplicationSetInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the replication set you want to retrieve.
    */
  var arn: Arn
}
object GetReplicationSetInput {
  
  inline def apply(arn: Arn): GetReplicationSetInput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReplicationSetInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetReplicationSetInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
