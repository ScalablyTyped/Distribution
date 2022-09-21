package typings.angularRouter.mod

import typings.angularCore.mod.ComponentFactoryResolver
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
  
  /**
    * @deprecated Passing a resolver to retrieve a component factory is not required and is
    *     deprecated since v14.
    */
  var resolver: ComponentFactoryResolver | Null = js.native
  
  var route: ActivatedRoute | Null = js.native
}
