package typings.awsSdk.clientsMediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Destination extends StObject {
  
  /**
    * The name of an S3 bucket within which harvested content will be exported
    */
  var BucketName: string
  
  /**
    * The key in the specified S3 bucket where the harvested top-level manifest will be placed.
    */
  var ManifestKey: string
  
  /**
    * The IAM role used to write to the specified S3 bucket
    */
  var RoleArn: string
}
object S3Destination {
  
  inline def apply(BucketName: string, ManifestKey: string, RoleArn: string): S3Destination = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], ManifestKey = ManifestKey.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Destination]
  }
  
  extension [Self <: S3Destination](x: Self) {
    
    inline def setBucketName(value: string): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setManifestKey(value: string): Self = StObject.set(x, "ManifestKey", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
