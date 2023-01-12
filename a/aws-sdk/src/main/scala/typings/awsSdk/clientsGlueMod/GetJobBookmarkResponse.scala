package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobBookmarkResponse extends StObject {
  
  /**
    * A structure that defines a point that a job can resume processing.
    */
  var JobBookmarkEntry: js.UndefOr[typings.awsSdk.clientsGlueMod.JobBookmarkEntry] = js.undefined
}
object GetJobBookmarkResponse {
  
  inline def apply(): GetJobBookmarkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobBookmarkResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetJobBookmarkResponse] (val x: Self) extends AnyVal {
    
    inline def setJobBookmarkEntry(value: JobBookmarkEntry): Self = StObject.set(x, "JobBookmarkEntry", value.asInstanceOf[js.Any])
    
    inline def setJobBookmarkEntryUndefined: Self = StObject.set(x, "JobBookmarkEntry", js.undefined)
  }
}
