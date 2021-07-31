package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "NgModuleFactoryLoader")
@js.native
abstract class NgModuleFactoryLoader () extends StObject {
  
  def load(path: String): js.Promise[NgModuleFactory[js.Any]] = js.native
}
