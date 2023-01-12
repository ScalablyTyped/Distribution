package typings.awsGreengrassCoreSdk.streamManagerDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTTPConfigMap
  extends StObject
     with StreamConfigBaseMap {
  
  var exportFormat: js.UndefOr[ExportFormatMap] = js.undefined
  
  var uri: js.UndefOr[String | Null] = js.undefined
}
object HTTPConfigMap {
  
  inline def apply(): HTTPConfigMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTTPConfigMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HTTPConfigMap] (val x: Self) extends AnyVal {
    
    inline def setExportFormat(value: ExportFormatMap): Self = StObject.set(x, "exportFormat", value.asInstanceOf[js.Any])
    
    inline def setExportFormatUndefined: Self = StObject.set(x, "exportFormat", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
