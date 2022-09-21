package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyVersionid extends StObject {
  
  var etag: String
  
  var key: String
  
  var `version-id`: String
}
object KeyVersionid {
  
  inline def apply(etag: String, key: String, `version-id`: String): KeyVersionid = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("version-id")(`version-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyVersionid]
  }
  
  extension [Self <: KeyVersionid](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def `setVersion-id`(value: String): Self = StObject.set(x, "version-id", value.asInstanceOf[js.Any])
  }
}
