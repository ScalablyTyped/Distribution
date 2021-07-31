package typings.arangodb.Foxx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetDefinition extends StObject {
  
  var gzip: js.UndefOr[Boolean] = js.undefined
  
  var path: String
  
  var `type`: js.UndefOr[String] = js.undefined
}
object AssetDefinition {
  
  @scala.inline
  def apply(path: String): AssetDefinition = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetDefinition]
  }
  
  @scala.inline
  implicit class AssetDefinitionMutableBuilder[Self <: AssetDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
