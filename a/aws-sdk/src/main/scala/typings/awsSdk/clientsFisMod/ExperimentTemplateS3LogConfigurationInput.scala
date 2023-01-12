package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentTemplateS3LogConfigurationInput extends StObject {
  
  /**
    * The name of the destination bucket.
    */
  var bucketName: S3BucketName
  
  /**
    * The bucket prefix.
    */
  var prefix: js.UndefOr[S3ObjectKey] = js.undefined
}
object ExperimentTemplateS3LogConfigurationInput {
  
  inline def apply(bucketName: S3BucketName): ExperimentTemplateS3LogConfigurationInput = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExperimentTemplateS3LogConfigurationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExperimentTemplateS3LogConfigurationInput] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: S3BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: S3ObjectKey): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
