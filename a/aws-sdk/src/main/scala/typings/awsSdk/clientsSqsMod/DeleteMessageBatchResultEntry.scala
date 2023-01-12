package typings.awsSdk.clientsSqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMessageBatchResultEntry extends StObject {
  
  /**
    * Represents a successfully deleted message.
    */
  var Id: String
}
object DeleteMessageBatchResultEntry {
  
  inline def apply(Id: String): DeleteMessageBatchResultEntry = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMessageBatchResultEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMessageBatchResultEntry] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
