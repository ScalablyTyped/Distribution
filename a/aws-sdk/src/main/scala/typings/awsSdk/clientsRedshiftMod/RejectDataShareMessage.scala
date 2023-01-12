package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectDataShareMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the datashare to reject.
    */
  var DataShareArn: String
}
object RejectDataShareMessage {
  
  inline def apply(DataShareArn: String): RejectDataShareMessage = {
    val __obj = js.Dynamic.literal(DataShareArn = DataShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectDataShareMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RejectDataShareMessage] (val x: Self) extends AnyVal {
    
    inline def setDataShareArn(value: String): Self = StObject.set(x, "DataShareArn", value.asInstanceOf[js.Any])
  }
}
