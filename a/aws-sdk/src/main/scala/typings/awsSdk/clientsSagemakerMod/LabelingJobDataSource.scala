package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelingJobDataSource extends StObject {
  
  /**
    * The Amazon S3 location of the input data objects.
    */
  var S3DataSource: js.UndefOr[LabelingJobS3DataSource] = js.undefined
  
  /**
    * An Amazon SNS data source used for streaming labeling jobs. To learn more, see Send Data to a Streaming Labeling Job. 
    */
  var SnsDataSource: js.UndefOr[LabelingJobSnsDataSource] = js.undefined
}
object LabelingJobDataSource {
  
  inline def apply(): LabelingJobDataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelingJobDataSource]
  }
  
  extension [Self <: LabelingJobDataSource](x: Self) {
    
    inline def setS3DataSource(value: LabelingJobS3DataSource): Self = StObject.set(x, "S3DataSource", value.asInstanceOf[js.Any])
    
    inline def setS3DataSourceUndefined: Self = StObject.set(x, "S3DataSource", js.undefined)
    
    inline def setSnsDataSource(value: LabelingJobSnsDataSource): Self = StObject.set(x, "SnsDataSource", value.asInstanceOf[js.Any])
    
    inline def setSnsDataSourceUndefined: Self = StObject.set(x, "SnsDataSource", js.undefined)
  }
}
