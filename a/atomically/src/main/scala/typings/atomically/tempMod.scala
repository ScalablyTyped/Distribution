package typings.atomically

import typings.atomically.typesMod.Disposer
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atomically/dist/utils/temp", JSImport.Namespace)
@js.native
object tempMod extends js.Object {
  @js.native
  object default extends js.Object {
    var store: Record[String, Boolean] = js.native
    def create(filePath: String): String = js.native
    def get(filePath: String, creator: js.Function1[/* filePath */ String, String]): js.Tuple2[String, Disposer] = js.native
    def get(filePath: String, creator: js.Function1[/* filePath */ String, String], purge: Boolean): js.Tuple2[String, Disposer] = js.native
    def purge(filePath: String): Unit = js.native
    def purgeSync(filePath: String): Unit = js.native
    def purgeSyncAll(): Unit = js.native
    def truncate(filePath: String): String = js.native
  }
  
}

