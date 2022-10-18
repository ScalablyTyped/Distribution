package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeContent extends StObject {
  
  /**
    * Information about the Amazon S3 bucket that contains the application code.
    */
  var S3ContentLocation: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.S3ContentLocation] = js.undefined
  
  /**
    * The text-format code for a Flink-based Kinesis Data Analytics application.
    */
  var TextContent: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.TextContent] = js.undefined
  
  /**
    * The zip-format code for a Flink-based Kinesis Data Analytics application.
    */
  var ZipFileContent: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ZipFileContent] = js.undefined
}
object CodeContent {
  
  inline def apply(): CodeContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeContent]
  }
  
  extension [Self <: CodeContent](x: Self) {
    
    inline def setS3ContentLocation(value: S3ContentLocation): Self = StObject.set(x, "S3ContentLocation", value.asInstanceOf[js.Any])
    
    inline def setS3ContentLocationUndefined: Self = StObject.set(x, "S3ContentLocation", js.undefined)
    
    inline def setTextContent(value: TextContent): Self = StObject.set(x, "TextContent", value.asInstanceOf[js.Any])
    
    inline def setTextContentUndefined: Self = StObject.set(x, "TextContent", js.undefined)
    
    inline def setZipFileContent(value: ZipFileContent): Self = StObject.set(x, "ZipFileContent", value.asInstanceOf[js.Any])
    
    inline def setZipFileContentUndefined: Self = StObject.set(x, "ZipFileContent", js.undefined)
  }
}
