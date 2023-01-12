package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskMediaInfo extends StObject {
  
  val contactId: String
  
  val initialContactId: String
}
object TaskMediaInfo {
  
  inline def apply(contactId: String, initialContactId: String): TaskMediaInfo = {
    val __obj = js.Dynamic.literal(contactId = contactId.asInstanceOf[js.Any], initialContactId = initialContactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskMediaInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskMediaInfo] (val x: Self) extends AnyVal {
    
    inline def setContactId(value: String): Self = StObject.set(x, "contactId", value.asInstanceOf[js.Any])
    
    inline def setInitialContactId(value: String): Self = StObject.set(x, "initialContactId", value.asInstanceOf[js.Any])
  }
}
