package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionSummary extends StObject {
  
  /**
    * The session description.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * The engine version used by the session (for example, PySpark engine version 3).
    */
  var EngineVersion: js.UndefOr[typings.awsSdk.clientsAthenaMod.EngineVersion] = js.undefined
  
  /**
    * The notebook version.
    */
  var NotebookVersion: js.UndefOr[NameString] = js.undefined
  
  /**
    * The session ID.
    */
  var SessionId: js.UndefOr[typings.awsSdk.clientsAthenaMod.SessionId] = js.undefined
  
  /**
    * Contains information about the session status.
    */
  var Status: js.UndefOr[SessionStatus] = js.undefined
}
object SessionSummary {
  
  inline def apply(): SessionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SessionSummary] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEngineVersion(value: EngineVersion): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setNotebookVersion(value: NameString): Self = StObject.set(x, "NotebookVersion", value.asInstanceOf[js.Any])
    
    inline def setNotebookVersionUndefined: Self = StObject.set(x, "NotebookVersion", js.undefined)
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "SessionId", js.undefined)
    
    inline def setStatus(value: SessionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
