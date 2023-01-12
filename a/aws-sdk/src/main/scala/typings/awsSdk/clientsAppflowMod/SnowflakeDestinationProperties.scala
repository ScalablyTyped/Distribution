package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnowflakeDestinationProperties extends StObject {
  
  /**
    *  The object key for the destination bucket in which Amazon AppFlow places the files. 
    */
  var bucketPrefix: js.UndefOr[BucketPrefix] = js.undefined
  
  /**
    *  The settings that determine how Amazon AppFlow handles an error when placing data in the Snowflake destination. For example, this setting would determine if the flow should fail after one insertion error, or continue and attempt to insert every record regardless of the initial failure. ErrorHandlingConfig is a part of the destination connector details. 
    */
  var errorHandlingConfig: js.UndefOr[ErrorHandlingConfig] = js.undefined
  
  /**
    *  The intermediate bucket that Amazon AppFlow uses when moving data into Snowflake. 
    */
  var intermediateBucketName: BucketName
  
  /**
    *  The object specified in the Snowflake flow destination. 
    */
  var `object`: Object
}
object SnowflakeDestinationProperties {
  
  inline def apply(intermediateBucketName: BucketName, `object`: Object): SnowflakeDestinationProperties = {
    val __obj = js.Dynamic.literal(intermediateBucketName = intermediateBucketName.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnowflakeDestinationProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnowflakeDestinationProperties] (val x: Self) extends AnyVal {
    
    inline def setBucketPrefix(value: BucketPrefix): Self = StObject.set(x, "bucketPrefix", value.asInstanceOf[js.Any])
    
    inline def setBucketPrefixUndefined: Self = StObject.set(x, "bucketPrefix", js.undefined)
    
    inline def setErrorHandlingConfig(value: ErrorHandlingConfig): Self = StObject.set(x, "errorHandlingConfig", value.asInstanceOf[js.Any])
    
    inline def setErrorHandlingConfigUndefined: Self = StObject.set(x, "errorHandlingConfig", js.undefined)
    
    inline def setIntermediateBucketName(value: BucketName): Self = StObject.set(x, "intermediateBucketName", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
