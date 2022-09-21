package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyData extends StObject {
  
  /** object etag contains ", e.g.: "5B3C1A2E053D763E1B002CC607C5A0FE" */
  var etag: String
  
  /** object last modified GMT string */
  var lastModified: String
}
object ModifyData {
  
  inline def apply(etag: String, lastModified: String): ModifyData = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyData]
  }
  
  extension [Self <: ModifyData](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
  }
}
