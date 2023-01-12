package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionReport extends StObject {
  
  /**
    * The name of the bucket.
    */
  var Bucket: js.UndefOr[BucketName] = js.undefined
  
  /**
    * The name of the Region.
    */
  var Region: js.UndefOr[RegionName] = js.undefined
}
object RegionReport {
  
  inline def apply(): RegionReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionReport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegionReport] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    inline def setRegion(value: RegionName): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
  }
}
