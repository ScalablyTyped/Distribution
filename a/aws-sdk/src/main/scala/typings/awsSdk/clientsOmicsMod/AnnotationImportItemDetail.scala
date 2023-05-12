package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationImportItemDetail extends StObject {
  
  /**
    * The item's job status.
    */
  var jobStatus: JobStatus
  
  /**
    * The source file's location in Amazon S3.
    */
  var source: S3Uri
}
object AnnotationImportItemDetail {
  
  inline def apply(jobStatus: JobStatus, source: S3Uri): AnnotationImportItemDetail = {
    val __obj = js.Dynamic.literal(jobStatus = jobStatus.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationImportItemDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnnotationImportItemDetail] (val x: Self) extends AnyVal {
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "jobStatus", value.asInstanceOf[js.Any])
    
    inline def setSource(value: S3Uri): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
