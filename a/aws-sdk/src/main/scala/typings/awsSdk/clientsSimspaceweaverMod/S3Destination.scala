package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Destination extends StObject {
  
  /**
    * The name of an Amazon S3 bucket. For more information about buckets, see Creating, configuring, and working with Amazon S3 buckets in the Amazon Simple Storage Service User Guide.
    */
  var BucketName: js.UndefOr[typings.awsSdk.clientsSimspaceweaverMod.BucketName] = js.undefined
  
  /**
    * A string prefix for an Amazon S3 object key. It's usually a folder name. For more information about folders in Amazon S3, see Organizing objects in the Amazon S3 console using folders in the Amazon Simple Storage Service User Guide.
    */
  var ObjectKeyPrefix: js.UndefOr[typings.awsSdk.clientsSimspaceweaverMod.ObjectKeyPrefix] = js.undefined
}
object S3Destination {
  
  inline def apply(): S3Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Destination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3Destination] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "BucketName", js.undefined)
    
    inline def setObjectKeyPrefix(value: ObjectKeyPrefix): Self = StObject.set(x, "ObjectKeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setObjectKeyPrefixUndefined: Self = StObject.set(x, "ObjectKeyPrefix", js.undefined)
  }
}
