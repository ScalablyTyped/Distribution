package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobResult extends StObject {
  
  /**
    * Information about a specific job, including shipping information, job status, and other important metadata.
    */
  var JobMetadata: js.UndefOr[typings.awsSdk.clientsSnowballMod.JobMetadata] = js.undefined
  
  /**
    * Information about a specific job part (in the case of an export job), including shipping information, job status, and other important metadata.
    */
  var SubJobMetadata: js.UndefOr[JobMetadataList] = js.undefined
}
object DescribeJobResult {
  
  inline def apply(): DescribeJobResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeJobResult] (val x: Self) extends AnyVal {
    
    inline def setJobMetadata(value: JobMetadata): Self = StObject.set(x, "JobMetadata", value.asInstanceOf[js.Any])
    
    inline def setJobMetadataUndefined: Self = StObject.set(x, "JobMetadata", js.undefined)
    
    inline def setSubJobMetadata(value: JobMetadataList): Self = StObject.set(x, "SubJobMetadata", value.asInstanceOf[js.Any])
    
    inline def setSubJobMetadataUndefined: Self = StObject.set(x, "SubJobMetadata", js.undefined)
    
    inline def setSubJobMetadataVarargs(value: JobMetadata*): Self = StObject.set(x, "SubJobMetadata", js.Array(value*))
  }
}
