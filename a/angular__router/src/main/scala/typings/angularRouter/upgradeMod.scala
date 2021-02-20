package typings.angularRouter

import typings.angularCore.mod.ComponentRef
import typings.angularCore.mod.InjectionToken
import typings.angularRouter.angularRouterStrings.hash
import typings.angularRouter.angularRouterStrings.path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object upgradeMod {
  
  object RouterUpgradeInitializer {
    
    @JSImport("@angular/router/upgrade", "RouterUpgradeInitializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/router/upgrade", "RouterUpgradeInitializer.deps")
    @js.native
    def deps: js.Array[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UpgradeModule */ js.Any
      ] = js.native
    @scala.inline
    def deps_=(
      x: js.Array[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UpgradeModule */ js.Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deps")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/router/upgrade", "RouterUpgradeInitializer.multi")
    @js.native
    def multi: Boolean = js.native
    @scala.inline
    def multi_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multi")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/router/upgrade", "RouterUpgradeInitializer.provide")
    @js.native
    def provide: InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[js.Any], Unit]]] = js.native
    @scala.inline
    def provide_=(x: InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[js.Any], Unit]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("provide")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/router/upgrade", "RouterUpgradeInitializer.useFactory")
    @js.native
    def useFactory(
      ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ js.Any
    ): js.Function0[Unit] = js.native
  }
  
  @JSImport("@angular/router/upgrade", "setUpLocationSync")
  @js.native
  def setUpLocationSync(
    ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ js.Any
  ): Unit = js.native
  @JSImport("@angular/router/upgrade", "setUpLocationSync")
  @js.native
  def setUpLocationSync_hash(
    ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ js.Any,
    urlType: hash
  ): Unit = js.native
  @JSImport("@angular/router/upgrade", "setUpLocationSync")
  @js.native
  def setUpLocationSync_path(
    ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ js.Any,
    urlType: path
  ): Unit = js.native
}
