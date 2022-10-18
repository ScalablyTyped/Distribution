package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorHandlingConfig extends StObject {
  
  /**
    *  Specifies the name of the Amazon S3 bucket. 
    */
  var bucketName: js.UndefOr[BucketName] = js.undefined
  
  /**
    *  Specifies the Amazon S3 bucket prefix. 
    */
  var bucketPrefix: js.UndefOr[BucketPrefix] = js.undefined
  
  /**
    *  Specifies if the flow should fail after the first instance of a failure when attempting to place data in the destination. 
    */
  var failOnFirstDestinationError: js.UndefOr[Boolean] = js.undefined
}
object ErrorHandlingConfig {
  
  inline def apply(): ErrorHandlingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorHandlingConfig]
  }
  
  extension [Self <: ErrorHandlingConfig](x: Self) {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setBucketPrefix(value: BucketPrefix): Self = StObject.set(x, "bucketPrefix", value.asInstanceOf[js.Any])
    
    inline def setBucketPrefixUndefined: Self = StObject.set(x, "bucketPrefix", js.undefined)
    
    inline def setFailOnFirstDestinationError(value: Boolean): Self = StObject.set(x, "failOnFirstDestinationError", value.asInstanceOf[js.Any])
    
    inline def setFailOnFirstDestinationErrorUndefined: Self = StObject.set(x, "failOnFirstDestinationError", js.undefined)
  }
}
