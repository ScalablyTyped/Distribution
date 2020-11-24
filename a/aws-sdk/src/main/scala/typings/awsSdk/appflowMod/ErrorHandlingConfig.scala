package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorHandlingConfig extends js.Object {
  
  /**
    *  Specifies the name of the Amazon S3 bucket. 
    */
  var bucketName: js.UndefOr[BucketName] = js.native
  
  /**
    *  Specifies the Amazon S3 bucket prefix. 
    */
  var bucketPrefix: js.UndefOr[BucketPrefix] = js.native
  
  /**
    *  Specifies if the flow should fail after the first instance of a failure when attempting to place data in the destination. 
    */
  var failOnFirstDestinationError: js.UndefOr[Boolean] = js.native
}
object ErrorHandlingConfig {
  
  @scala.inline
  def apply(): ErrorHandlingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorHandlingConfig]
  }
  
  @scala.inline
  implicit class ErrorHandlingConfigOps[Self <: ErrorHandlingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucketName(value: BucketName): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketName: Self = this.set("bucketName", js.undefined)
    
    @scala.inline
    def setBucketPrefix(value: BucketPrefix): Self = this.set("bucketPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketPrefix: Self = this.set("bucketPrefix", js.undefined)
    
    @scala.inline
    def setFailOnFirstDestinationError(value: Boolean): Self = this.set("failOnFirstDestinationError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailOnFirstDestinationError: Self = this.set("failOnFirstDestinationError", js.undefined)
  }
}
