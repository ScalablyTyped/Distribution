package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3InputFormatConfig extends StObject {
  
  /**
    *  The file type that Amazon AppFlow gets from your Amazon S3 bucket. 
    */
  var s3InputFileType: js.UndefOr[S3InputFileType] = js.undefined
}
object S3InputFormatConfig {
  
  inline def apply(): S3InputFormatConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3InputFormatConfig]
  }
  
  extension [Self <: S3InputFormatConfig](x: Self) {
    
    inline def setS3InputFileType(value: S3InputFileType): Self = StObject.set(x, "s3InputFileType", value.asInstanceOf[js.Any])
    
    inline def setS3InputFileTypeUndefined: Self = StObject.set(x, "s3InputFileType", js.undefined)
  }
}
