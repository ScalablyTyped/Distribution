package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionChecksum extends StObject {
  
  var checksum: String
  
  var revision: String
}
object CollectionChecksum {
  
  inline def apply(checksum: String, revision: String): CollectionChecksum = {
    val __obj = js.Dynamic.literal(checksum = checksum.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionChecksum]
  }
  
  extension [Self <: CollectionChecksum](x: Self) {
    
    inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
  }
}
