package typings.angularRouter

import typings.angularCore.mod.ComponentRef
import typings.angularCore.mod.InjectionToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object upgradeMod {
  
  @JSImport("@angular/router/upgrade", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object RouterUpgradeInitializer {
    
    @JSImport("@angular/router/upgrade", "RouterUpgradeInitializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/router/upgrade", "RouterUpgradeInitializer.deps")
    @js.native
    def deps: js.Array[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UpgradeModule */ Any
      ] = js.native
    inline def deps_=(
      x: js.Array[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof UpgradeModule */ Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deps")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/router/upgrade", "RouterUpgradeInitializer.multi")
    @js.native
    def multi: Boolean = js.native
    inline def multi_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("multi")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/router/upgrade", "RouterUpgradeInitializer.provide")
    @js.native
    def provide: InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[Any], Unit]]] = js.native
    inline def provide_=(x: InjectionToken[js.Array[js.Function1[/* compRef */ ComponentRef[Any], Unit]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("provide")(x.asInstanceOf[js.Any])
    
    inline def useFactory(
      ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ Any
    ): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFactory")(ngUpgrade.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  }
  
  inline def setUpLocationSync(
    ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUpLocationSync")(ngUpgrade.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.annotation.targetName("setUpLocationSync_path_hash")
  inline def setUpLocationSync(
    ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ Any,
    urlType: "path" | "hash"
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUpLocationSync")(ngUpgrade.asInstanceOf[js.Any], urlType.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
