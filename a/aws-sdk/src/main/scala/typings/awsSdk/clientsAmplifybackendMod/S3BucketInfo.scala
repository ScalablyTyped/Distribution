package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3BucketInfo extends StObject {
  
  /**
    * The creation date of the S3 bucket.
    */
  var CreationDate: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the S3 bucket.
    */
  var Name: js.UndefOr[string] = js.undefined
}
object S3BucketInfo {
  
  inline def apply(): S3BucketInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3BucketInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3BucketInfo] (val x: Self) extends AnyVal {
    
    inline def setCreationDate(value: string): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
