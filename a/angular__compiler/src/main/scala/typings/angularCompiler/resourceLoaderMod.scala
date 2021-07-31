package typings.angularCompiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceLoaderMod {
  
  @JSImport("@angular/compiler/src/resource_loader", "ResourceLoader")
  @js.native
  class ResourceLoader () extends StObject {
    
    def get(url: String): js.Promise[String] | String = js.native
  }
}
