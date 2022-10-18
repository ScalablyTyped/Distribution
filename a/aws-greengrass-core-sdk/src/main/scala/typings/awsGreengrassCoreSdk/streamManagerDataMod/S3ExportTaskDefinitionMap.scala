package typings.awsGreengrassCoreSdk.streamManagerDataMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ExportTaskDefinitionMap extends StObject {
  
  var bucket: js.UndefOr[String] = js.undefined
  
  var inputUrl: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var userMetadata: js.UndefOr[(Record[String, Any]) | Null] = js.undefined
}
object S3ExportTaskDefinitionMap {
  
  inline def apply(): S3ExportTaskDefinitionMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ExportTaskDefinitionMap]
  }
  
  extension [Self <: S3ExportTaskDefinitionMap](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setInputUrl(value: String): Self = StObject.set(x, "inputUrl", value.asInstanceOf[js.Any])
    
    inline def setInputUrlUndefined: Self = StObject.set(x, "inputUrl", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setUserMetadata(value: Record[String, Any]): Self = StObject.set(x, "userMetadata", value.asInstanceOf[js.Any])
    
    inline def setUserMetadataNull: Self = StObject.set(x, "userMetadata", null)
    
    inline def setUserMetadataUndefined: Self = StObject.set(x, "userMetadata", js.undefined)
  }
}
