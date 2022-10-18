package typings.atomically

import typings.atomically.distTypesMod.Disposer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsTempMod {
  
  object default {
    
    @JSImport("atomically/dist/utils/temp", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(filePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def get(filePath: String, creator: js.Function1[/* filePath */ String, String]): js.Tuple2[String, Disposer] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(filePath.asInstanceOf[js.Any], creator.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String, Disposer]]
    inline def get(filePath: String, creator: js.Function1[/* filePath */ String, String], purge: Boolean): js.Tuple2[String, Disposer] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(filePath.asInstanceOf[js.Any], creator.asInstanceOf[js.Any], purge.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String, Disposer]]
    
    inline def purge(filePath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("purge")(filePath.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def purgeSync(filePath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("purgeSync")(filePath.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def purgeSyncAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("purgeSyncAll")().asInstanceOf[Unit]
    
    @JSImport("atomically/dist/utils/temp", "default.store")
    @js.native
    def store: Record[String, Boolean] = js.native
    inline def store_=(x: Record[String, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("store")(x.asInstanceOf[js.Any])
    
    inline def truncate(filePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
