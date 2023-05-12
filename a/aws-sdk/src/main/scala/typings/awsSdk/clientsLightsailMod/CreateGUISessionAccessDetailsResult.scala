package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGUISessionAccessDetailsResult extends StObject {
  
  /**
    * The reason the operation failed.
    */
  var failureReason: js.UndefOr[String] = js.undefined
  
  /**
    * The percentage of completion for the operation.
    */
  var percentageComplete: js.UndefOr[integer] = js.undefined
  
  /**
    * The resource name.
    */
  var resourceName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * Returns information about the specified NICE DCV GUI session.
    */
  var sessions: js.UndefOr[Sessions] = js.undefined
  
  /**
    * The status of the operation.
    */
  var status: js.UndefOr[Status] = js.undefined
}
object CreateGUISessionAccessDetailsResult {
  
  inline def apply(): CreateGUISessionAccessDetailsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGUISessionAccessDetailsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateGUISessionAccessDetailsResult] (val x: Self) extends AnyVal {
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setPercentageComplete(value: integer): Self = StObject.set(x, "percentageComplete", value.asInstanceOf[js.Any])
    
    inline def setPercentageCompleteUndefined: Self = StObject.set(x, "percentageComplete", js.undefined)
    
    inline def setResourceName(value: ResourceName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setSessions(value: Sessions): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
    
    inline def setSessionsUndefined: Self = StObject.set(x, "sessions", js.undefined)
    
    inline def setSessionsVarargs(value: Session*): Self = StObject.set(x, "sessions", js.Array(value*))
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
