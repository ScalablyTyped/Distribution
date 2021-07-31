package typings.awsSdk.appflowMod

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
  
  @scala.inline
  def apply(): ErrorHandlingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorHandlingConfig]
  }
  
  @scala.inline
  implicit class ErrorHandlingConfigMutableBuilder[Self <: ErrorHandlingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    @scala.inline
    def setBucketPrefix(value: BucketPrefix): Self = StObject.set(x, "bucketPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketPrefixUndefined: Self = StObject.set(x, "bucketPrefix", js.undefined)
    
    @scala.inline
    def setFailOnFirstDestinationError(value: Boolean): Self = StObject.set(x, "failOnFirstDestinationError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailOnFirstDestinationErrorUndefined: Self = StObject.set(x, "failOnFirstDestinationError", js.undefined)
  }
}
