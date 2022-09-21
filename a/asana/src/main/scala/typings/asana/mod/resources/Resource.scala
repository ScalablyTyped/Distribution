package typings.asana.mod.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource
  extends StObject
     with AnonymousResource {
  
  var name: String
}
object Resource {
  
  @JSImport("asana", "resources.Resource")
  @js.native
  val ^ : ResourceStatic = js.native
  
  extension [Self <: Resource](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
