package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReplicationSetInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the replication set you're deleting.
    */
  var arn: Arn
}
object DeleteReplicationSetInput {
  
  inline def apply(arn: Arn): DeleteReplicationSetInput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicationSetInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteReplicationSetInput] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
