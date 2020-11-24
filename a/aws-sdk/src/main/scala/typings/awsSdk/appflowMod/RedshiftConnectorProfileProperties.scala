package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedshiftConnectorProfileProperties extends js.Object {
  
  /**
    *  A name for the associated Amazon S3 bucket. 
    */
  var bucketName: BucketName = js.native
  
  /**
    *  The object key for the destination bucket in which Amazon AppFlow places the files. 
    */
  var bucketPrefix: js.UndefOr[BucketPrefix] = js.native
  
  /**
    *  The JDBC URL of the Amazon Redshift cluster. 
    */
  var databaseUrl: DatabaseUrl = js.native
  
  /**
    *  The Amazon Resource Name (ARN) of the IAM role. 
    */
  var roleArn: RoleArn = js.native
}
object RedshiftConnectorProfileProperties {
  
  @scala.inline
  def apply(bucketName: BucketName, databaseUrl: DatabaseUrl, roleArn: RoleArn): RedshiftConnectorProfileProperties = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], databaseUrl = databaseUrl.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftConnectorProfileProperties]
  }
  
  @scala.inline
  implicit class RedshiftConnectorProfilePropertiesOps[Self <: RedshiftConnectorProfileProperties] (val x: Self) extends AnyVal {
    
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
    def setDatabaseUrl(value: DatabaseUrl): Self = this.set("databaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketPrefix(value: BucketPrefix): Self = this.set("bucketPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketPrefix: Self = this.set("bucketPrefix", js.undefined)
  }
}
