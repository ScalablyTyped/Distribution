package typings.angularRouter

import typings.angularCore.mod.ComponentRef
import typings.angularCore.mod.InjectionToken
import typings.angularRouter.angularRouterStrings.hash
import typings.angularRouter.angularRouterStrings.path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router/upgrade", JSImport.Namespace)
@js.native
object upgradeMod extends js.Object {
  
  def setUpLocationSync(
    ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ js.Any
  ): Unit = js.native
  @JSName("setUpLocationSync")
  def setUpLocationSync_hash(
    ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ js.Any,
    urlType: hash
  ): Unit = js.native
  @JSName("setUpLocationSync")
  def setUpLocationSync_path(
    ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ js.Any,
    urlType: path
  ): Unit = js.native
  
  @js.native
  object RouterUpgradeInitializer extends js.Object {
    
    var deps: js.Array[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UpgradeModule */ _
      ] = js.native
    
    var multi: Boolean = js.native
    
    var provide: InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[_], Unit]]] = js.native
    
    def useFactory(
      ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ js.Any
    ): js.Function0[Unit] = js.native
  }
}
