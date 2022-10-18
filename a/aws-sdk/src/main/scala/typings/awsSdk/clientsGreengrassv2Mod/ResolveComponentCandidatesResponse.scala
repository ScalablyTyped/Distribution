package typings.awsSdk.clientsGreengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveComponentCandidatesResponse extends StObject {
  
  /**
    * A list of components that meet the requirements that you specify in the request. This list includes each component's recipe that you can use to install the component.
    */
  var resolvedComponentVersions: js.UndefOr[ResolvedComponentVersionsList] = js.undefined
}
object ResolveComponentCandidatesResponse {
  
  inline def apply(): ResolveComponentCandidatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveComponentCandidatesResponse]
  }
  
  extension [Self <: ResolveComponentCandidatesResponse](x: Self) {
    
    inline def setResolvedComponentVersions(value: ResolvedComponentVersionsList): Self = StObject.set(x, "resolvedComponentVersions", value.asInstanceOf[js.Any])
    
    inline def setResolvedComponentVersionsUndefined: Self = StObject.set(x, "resolvedComponentVersions", js.undefined)
    
    inline def setResolvedComponentVersionsVarargs(value: ResolvedComponentVersion*): Self = StObject.set(x, "resolvedComponentVersions", js.Array(value*))
  }
}
