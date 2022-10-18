package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateReportGroupInput extends StObject {
  
  /**
    *  The ARN of the report group to update. 
    */
  var arn: NonEmptyString
  
  /**
    *  Used to specify an updated export type. Valid values are:     S3: The report results are exported to an S3 bucket.     NO_EXPORT: The report results are not exported.   
    */
  var exportConfig: js.UndefOr[ReportExportConfig] = js.undefined
  
  /**
    *  An updated list of tag key and value pairs associated with this report group.  These tags are available for use by Amazon Web Services services that support CodeBuild report group tags.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object UpdateReportGroupInput {
  
  inline def apply(arn: NonEmptyString): UpdateReportGroupInput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateReportGroupInput]
  }
  
  extension [Self <: UpdateReportGroupInput](x: Self) {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setExportConfig(value: ReportExportConfig): Self = StObject.set(x, "exportConfig", value.asInstanceOf[js.Any])
    
    inline def setExportConfigUndefined: Self = StObject.set(x, "exportConfig", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
