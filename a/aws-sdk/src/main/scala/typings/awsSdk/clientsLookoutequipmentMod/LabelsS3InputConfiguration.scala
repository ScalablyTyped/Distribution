package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelsS3InputConfiguration extends StObject {
  
  /**
    * The name of the S3 bucket holding the label data. 
    */
  var Bucket: S3Bucket
  
  /**
    *  The prefix for the S3 bucket used for the label data. 
    */
  var Prefix: js.UndefOr[S3Prefix] = js.undefined
}
object LabelsS3InputConfiguration {
  
  inline def apply(Bucket: S3Bucket): LabelsS3InputConfiguration = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelsS3InputConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelsS3InputConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: S3Bucket): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: S3Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
  }
}
