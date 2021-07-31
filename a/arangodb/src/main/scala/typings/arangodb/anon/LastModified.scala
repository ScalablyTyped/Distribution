package typings.arangodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastModified extends StObject {
  
  var lastModified: Boolean
}
object LastModified {
  
  @scala.inline
  def apply(lastModified: Boolean): LastModified = {
    val __obj = js.Dynamic.literal(lastModified = lastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastModified]
  }
  
  @scala.inline
  implicit class LastModifiedMutableBuilder[Self <: LastModified] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastModified(value: Boolean): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
  }
}
