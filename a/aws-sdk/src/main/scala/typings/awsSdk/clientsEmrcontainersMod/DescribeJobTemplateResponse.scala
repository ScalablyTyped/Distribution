package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobTemplateResponse extends StObject {
  
  /**
    * This output displays information about the specified job template.
    */
  var jobTemplate: js.UndefOr[JobTemplate] = js.undefined
}
object DescribeJobTemplateResponse {
  
  inline def apply(): DescribeJobTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobTemplateResponse]
  }
  
  extension [Self <: DescribeJobTemplateResponse](x: Self) {
    
    inline def setJobTemplate(value: JobTemplate): Self = StObject.set(x, "jobTemplate", value.asInstanceOf[js.Any])
    
    inline def setJobTemplateUndefined: Self = StObject.set(x, "jobTemplate", js.undefined)
  }
}
