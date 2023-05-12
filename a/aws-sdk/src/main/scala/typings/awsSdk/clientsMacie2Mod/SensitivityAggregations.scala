package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SensitivityAggregations extends StObject {
  
  /**
    * The total storage size, in bytes, of all the objects that Amazon Macie can analyze in the buckets. These objects use a supported storage class and have a file name extension for a supported file or storage format. If versioning is enabled for any of the buckets, this value is based on the size of the latest version of each applicable object in the buckets. This value doesn't reflect the storage size of all versions of all applicable objects in the buckets.
    */
  var classifiableSizeInBytes: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of buckets that are publicly accessible due to a combination of permissions settings for each bucket.
    */
  var publiclyAccessibleCount: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of buckets.
    */
  var totalCount: js.UndefOr[long] = js.undefined
  
  /**
    * The total storage size, in bytes, of the buckets. If versioning is enabled for any of the buckets, this value is based on the size of the latest version of each object in the buckets. This value doesn't reflect the storage size of all versions of the objects in the buckets.
    */
  var totalSizeInBytes: js.UndefOr[long] = js.undefined
}
object SensitivityAggregations {
  
  inline def apply(): SensitivityAggregations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SensitivityAggregations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SensitivityAggregations] (val x: Self) extends AnyVal {
    
    inline def setClassifiableSizeInBytes(value: long): Self = StObject.set(x, "classifiableSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setClassifiableSizeInBytesUndefined: Self = StObject.set(x, "classifiableSizeInBytes", js.undefined)
    
    inline def setPubliclyAccessibleCount(value: long): Self = StObject.set(x, "publiclyAccessibleCount", value.asInstanceOf[js.Any])
    
    inline def setPubliclyAccessibleCountUndefined: Self = StObject.set(x, "publiclyAccessibleCount", js.undefined)
    
    inline def setTotalCount(value: long): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
    
    inline def setTotalSizeInBytes(value: long): Self = StObject.set(x, "totalSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeInBytesUndefined: Self = StObject.set(x, "totalSizeInBytes", js.undefined)
  }
}
