package typings.atAngularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/resource_loader", JSImport.Namespace)
@js.native
object srcResourceUnderscoreLoaderMod extends js.Object {
  @js.native
  class ResourceLoader () extends js.Object {
    def get(url: String): js.Promise[String] | String = js.native
  }
  
}

