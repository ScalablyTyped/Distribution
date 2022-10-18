package typings.allPackageNames

import typings.allPackageNames.buildLoadMod.LoadOptions
import typings.allPackageNames.buildLoadMod.Save_
import typings.allPackageNames.buildSyncMod.SyncOptions
import typings.commander.mod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("all-package-names/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def load(): js.Promise[Save_] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")().asInstanceOf[js.Promise[Save_]]
  inline def load(options: LoadOptions): js.Promise[Save_] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Save_]]
  
  @JSImport("all-package-names/build", "savePath")
  @js.native
  val savePath: String = js.native
  
  inline def sync(): js.Promise[Save_] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[js.Promise[Save_]]
  inline def sync(hasOnDataOnStartOnEndMaxAge: SyncOptions): js.Promise[Save_] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(hasOnDataOnStartOnEndMaxAge.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Save_]]
  
  inline def syncAction(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("syncAction")().asInstanceOf[Unit]
  inline def syncAction(options: LoadOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("syncAction")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("all-package-names/build", "syncCommand")
  @js.native
  val syncCommand: Command = js.native
}
