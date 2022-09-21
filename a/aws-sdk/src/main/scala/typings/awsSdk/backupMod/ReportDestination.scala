package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportDestination extends StObject {
  
  /**
    * The unique name of the Amazon S3 bucket that receives your reports.
    */
  var S3BucketName: js.UndefOr[String] = js.undefined
  
  /**
    * The object key that uniquely identifies your reports in your S3 bucket.
    */
  var S3Keys: js.UndefOr[stringList] = js.undefined
}
object ReportDestination {
  
  inline def apply(): ReportDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportDestination]
  }
  
  extension [Self <: ReportDestination](x: Self) {
    
    inline def setS3BucketName(value: String): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    inline def setS3BucketNameUndefined: Self = StObject.set(x, "S3BucketName", js.undefined)
    
    inline def setS3Keys(value: stringList): Self = StObject.set(x, "S3Keys", value.asInstanceOf[js.Any])
    
    inline def setS3KeysUndefined: Self = StObject.set(x, "S3Keys", js.undefined)
    
    inline def setS3KeysVarargs(value: String*): Self = StObject.set(x, "S3Keys", js.Array(value*))
  }
}
