package typings.awsLambda.triggerSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SESEventRecord extends StObject {
  
  var eventSource: String
  
  var eventVersion: String
  
  var ses: SESMessage
}
object SESEventRecord {
  
  inline def apply(eventSource: String, eventVersion: String, ses: SESMessage): SESEventRecord = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], ses = ses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SESEventRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SESEventRecord] (val x: Self) extends AnyVal {
    
    inline def setEventSource(value: String): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
    
    inline def setEventVersion(value: String): Self = StObject.set(x, "eventVersion", value.asInstanceOf[js.Any])
    
    inline def setSes(value: SESMessage): Self = StObject.set(x, "ses", value.asInstanceOf[js.Any])
  }
}
