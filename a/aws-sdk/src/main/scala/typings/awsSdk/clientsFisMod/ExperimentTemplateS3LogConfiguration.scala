package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentTemplateS3LogConfiguration extends StObject {
  
  /**
    * The name of the destination bucket.
    */
  var bucketName: js.UndefOr[S3BucketName] = js.undefined
  
  /**
    * The bucket prefix.
    */
  var prefix: js.UndefOr[S3ObjectKey] = js.undefined
}
object ExperimentTemplateS3LogConfiguration {
  
  inline def apply(): ExperimentTemplateS3LogConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentTemplateS3LogConfiguration]
  }
  
  extension [Self <: ExperimentTemplateS3LogConfiguration](x: Self) {
    
    inline def setBucketName(value: S3BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setPrefix(value: S3ObjectKey): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
