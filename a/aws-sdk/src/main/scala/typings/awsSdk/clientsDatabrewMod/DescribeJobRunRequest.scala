package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobRunRequest extends StObject {
  
  /**
    * The name of the job being processed during this run.
    */
  var Name: JobName
  
  /**
    * The unique identifier of the job run.
    */
  var RunId: JobRunId
}
object DescribeJobRunRequest {
  
  inline def apply(Name: JobName, RunId: JobRunId): DescribeJobRunRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobRunRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeJobRunRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: JobName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRunId(value: JobRunId): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
  }
}
