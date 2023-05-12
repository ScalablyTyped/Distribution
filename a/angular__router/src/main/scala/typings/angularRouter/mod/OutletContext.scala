package typings.angularRouter.mod

import typings.angularCore.mod.ComponentRef
import typings.angularCore.mod.EnvironmentInjector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "OutletContext")
@js.native
open class OutletContext () extends StObject {
  
  var attachRef: ComponentRef[Any] | Null = js.native
  
  var children: ChildrenOutletContexts = js.native
  
  var injector: EnvironmentInjector | Null = js.native
  
  var outlet: RouterOutletContract | Null = js.native
  
  var route: ActivatedRoute | Null = js.native
}
