package typings.atomically

import typings.atomically.typesMod.Disposer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tempMod {
  
  object default {
    
    @JSImport("atomically/dist/utils/temp", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("atomically/dist/utils/temp", "default.create")
    @js.native
    def create(filePath: String): String = js.native
    
    @JSImport("atomically/dist/utils/temp", "default.get")
    @js.native
    def get(filePath: String, creator: js.Function1[/* filePath */ String, String]): js.Tuple2[String, Disposer] = js.native
    @JSImport("atomically/dist/utils/temp", "default.get")
    @js.native
    def get(filePath: String, creator: js.Function1[/* filePath */ String, String], purge: Boolean): js.Tuple2[String, Disposer] = js.native
    
    @JSImport("atomically/dist/utils/temp", "default.purge")
    @js.native
    def purge(filePath: String): Unit = js.native
    
    @JSImport("atomically/dist/utils/temp", "default.purgeSync")
    @js.native
    def purgeSync(filePath: String): Unit = js.native
    
    @JSImport("atomically/dist/utils/temp", "default.purgeSyncAll")
    @js.native
    def purgeSyncAll(): Unit = js.native
    
    @JSImport("atomically/dist/utils/temp", "default.store")
    @js.native
    def store: Record[String, Boolean] = js.native
    @scala.inline
    def store_=(x: Record[String, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("store")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/temp", "default.truncate")
    @js.native
    def truncate(filePath: String): String = js.native
  }
}
