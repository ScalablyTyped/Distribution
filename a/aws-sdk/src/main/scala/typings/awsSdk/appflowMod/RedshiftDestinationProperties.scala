package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedshiftDestinationProperties extends StObject {
  
  /**
    *  The object key for the bucket in which Amazon AppFlow places the destination files. 
    */
  var bucketPrefix: js.UndefOr[BucketPrefix] = js.undefined
  
  /**
    *  The settings that determine how Amazon AppFlow handles an error when placing data in the Amazon Redshift destination. For example, this setting would determine if the flow should fail after one insertion error, or continue and attempt to insert every record regardless of the initial failure. ErrorHandlingConfig is a part of the destination connector details. 
    */
  var errorHandlingConfig: js.UndefOr[ErrorHandlingConfig] = js.undefined
  
  /**
    *  The intermediate bucket that Amazon AppFlow uses when moving data into Amazon Redshift. 
    */
  var intermediateBucketName: BucketName
  
  /**
    *  The object specified in the Amazon Redshift flow destination. 
    */
  var `object`: Object
}
object RedshiftDestinationProperties {
  
  inline def apply(intermediateBucketName: BucketName, `object`: Object): RedshiftDestinationProperties = {
    val __obj = js.Dynamic.literal(intermediateBucketName = intermediateBucketName.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftDestinationProperties]
  }
  
  extension [Self <: RedshiftDestinationProperties](x: Self) {
    
    inline def setBucketPrefix(value: BucketPrefix): Self = StObject.set(x, "bucketPrefix", value.asInstanceOf[js.Any])
    
    inline def setBucketPrefixUndefined: Self = StObject.set(x, "bucketPrefix", js.undefined)
    
    inline def setErrorHandlingConfig(value: ErrorHandlingConfig): Self = StObject.set(x, "errorHandlingConfig", value.asInstanceOf[js.Any])
    
    inline def setErrorHandlingConfigUndefined: Self = StObject.set(x, "errorHandlingConfig", js.undefined)
    
    inline def setIntermediateBucketName(value: BucketName): Self = StObject.set(x, "intermediateBucketName", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
