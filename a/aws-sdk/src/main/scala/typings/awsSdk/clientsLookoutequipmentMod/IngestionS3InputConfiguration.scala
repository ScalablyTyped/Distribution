package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestionS3InputConfiguration extends StObject {
  
  /**
    * The name of the S3 bucket used for the input data for the data ingestion. 
    */
  var Bucket: S3Bucket
  
  /**
    *  Pattern for matching the Amazon S3 files which will be used for ingestion. If no KeyPattern is provided, we will use the default hierarchy file structure, which is same as KeyPattern {prefix}/{component_name}/ * 
    */
  var KeyPattern: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.KeyPattern] = js.undefined
  
  /**
    * The prefix for the S3 location being used for the input data for the data ingestion. 
    */
  var Prefix: js.UndefOr[S3Prefix] = js.undefined
}
object IngestionS3InputConfiguration {
  
  inline def apply(Bucket: S3Bucket): IngestionS3InputConfiguration = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestionS3InputConfiguration]
  }
  
  extension [Self <: IngestionS3InputConfiguration](x: Self) {
    
    inline def setBucket(value: S3Bucket): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setKeyPattern(value: KeyPattern): Self = StObject.set(x, "KeyPattern", value.asInstanceOf[js.Any])
    
    inline def setKeyPatternUndefined: Self = StObject.set(x, "KeyPattern", js.undefined)
    
    inline def setPrefix(value: S3Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
  }
}
