package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSessionResponse extends StObject {
  
  /**
    * The session description.
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  
  /**
    * Contains engine configuration information like DPU usage.
    */
  var EngineConfiguration: js.UndefOr[typings.awsSdk.clientsAthenaMod.EngineConfiguration] = js.undefined
  
  /**
    * The engine version used by the session (for example, PySpark engine version 3). You can get a list of engine versions by calling ListEngineVersions.
    */
  var EngineVersion: js.UndefOr[NameString] = js.undefined
  
  /**
    * The notebook version.
    */
  var NotebookVersion: js.UndefOr[NameString] = js.undefined
  
  /**
    * Contains the workgroup configuration information used by the session.
    */
  var SessionConfiguration: js.UndefOr[typings.awsSdk.clientsAthenaMod.SessionConfiguration] = js.undefined
  
  /**
    * The session ID.
    */
  var SessionId: js.UndefOr[typings.awsSdk.clientsAthenaMod.SessionId] = js.undefined
  
  /**
    * Contains the DPU execution time.
    */
  var Statistics: js.UndefOr[SessionStatistics] = js.undefined
  
  /**
    * Contains information about the status of the session.
    */
  var Status: js.UndefOr[SessionStatus] = js.undefined
  
  /**
    * The workgroup to which the session belongs.
    */
  var WorkGroup: js.UndefOr[WorkGroupName] = js.undefined
}
object GetSessionResponse {
  
  inline def apply(): GetSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSessionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSessionResponse] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEngineConfiguration(value: EngineConfiguration): Self = StObject.set(x, "EngineConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEngineConfigurationUndefined: Self = StObject.set(x, "EngineConfiguration", js.undefined)
    
    inline def setEngineVersion(value: NameString): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setNotebookVersion(value: NameString): Self = StObject.set(x, "NotebookVersion", value.asInstanceOf[js.Any])
    
    inline def setNotebookVersionUndefined: Self = StObject.set(x, "NotebookVersion", js.undefined)
    
    inline def setSessionConfiguration(value: SessionConfiguration): Self = StObject.set(x, "SessionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSessionConfigurationUndefined: Self = StObject.set(x, "SessionConfiguration", js.undefined)
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "SessionId", js.undefined)
    
    inline def setStatistics(value: SessionStatistics): Self = StObject.set(x, "Statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "Statistics", js.undefined)
    
    inline def setStatus(value: SessionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setWorkGroup(value: WorkGroupName): Self = StObject.set(x, "WorkGroup", value.asInstanceOf[js.Any])
    
    inline def setWorkGroupUndefined: Self = StObject.set(x, "WorkGroup", js.undefined)
  }
}
