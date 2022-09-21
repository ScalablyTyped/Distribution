package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "ResourceLoader")
@js.native
abstract class ResourceLoader () extends StObject {
  
  def get(url: String): js.Promise[String] | String = js.native
}
