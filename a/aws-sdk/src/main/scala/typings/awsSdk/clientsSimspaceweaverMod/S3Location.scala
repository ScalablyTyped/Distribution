package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Location extends StObject {
  
  /**
    * The name of an Amazon S3 bucket. For more information about buckets, see Creating, configuring, and working with Amazon S3 buckets in the Amazon Simple Storage Service User Guide.
    */
  var BucketName: js.UndefOr[typings.awsSdk.clientsSimspaceweaverMod.BucketName] = js.undefined
  
  /**
    * The key name of an object in Amazon S3. For more information about Amazon S3 objects and object keys, see Uploading, downloading, and working with objects in Amazon S3 in the Amazon Simple Storage Service User Guide.
    */
  var ObjectKey: js.UndefOr[typings.awsSdk.clientsSimspaceweaverMod.ObjectKey] = js.undefined
}
object S3Location {
  
  inline def apply(): S3Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Location]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3Location] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "BucketName", js.undefined)
    
    inline def setObjectKey(value: ObjectKey): Self = StObject.set(x, "ObjectKey", value.asInstanceOf[js.Any])
    
    inline def setObjectKeyUndefined: Self = StObject.set(x, "ObjectKey", js.undefined)
  }
}
