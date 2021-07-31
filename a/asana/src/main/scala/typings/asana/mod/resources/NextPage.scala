package typings.asana.mod.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextPage extends StObject {
  
  var offset: String
  
  var path: String
  
  var uri: String
}
object NextPage {
  
  @scala.inline
  def apply(offset: String, path: String, uri: String): NextPage = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextPage]
  }
  
  @scala.inline
  implicit class NextPageMutableBuilder[Self <: NextPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
