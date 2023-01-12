package typings.awsSdk.clientsImportexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobsInput extends StObject {
  
  var APIVersion: js.UndefOr[APIVersion_] = js.undefined
  
  var Marker: js.UndefOr[typings.awsSdk.clientsImportexportMod.Marker] = js.undefined
  
  var MaxJobs: js.UndefOr[typings.awsSdk.clientsImportexportMod.MaxJobs] = js.undefined
}
object ListJobsInput {
  
  inline def apply(): ListJobsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListJobsInput] (val x: Self) extends AnyVal {
    
    inline def setAPIVersion(value: APIVersion_): Self = StObject.set(x, "APIVersion", value.asInstanceOf[js.Any])
    
    inline def setAPIVersionUndefined: Self = StObject.set(x, "APIVersion", js.undefined)
    
    inline def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxJobs(value: MaxJobs): Self = StObject.set(x, "MaxJobs", value.asInstanceOf[js.Any])
    
    inline def setMaxJobsUndefined: Self = StObject.set(x, "MaxJobs", js.undefined)
  }
}
