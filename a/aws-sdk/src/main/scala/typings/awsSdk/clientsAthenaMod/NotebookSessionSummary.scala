package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotebookSessionSummary extends StObject {
  
  /**
    * The time when the notebook session was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The notebook session ID.
    */
  var SessionId: js.UndefOr[typings.awsSdk.clientsAthenaMod.SessionId] = js.undefined
}
object NotebookSessionSummary {
  
  inline def apply(): NotebookSessionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookSessionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotebookSessionSummary] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "SessionId", js.undefined)
  }
}
