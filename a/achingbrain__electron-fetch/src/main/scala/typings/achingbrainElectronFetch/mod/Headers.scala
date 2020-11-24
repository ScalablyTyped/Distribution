package typings.achingbrainElectronFetch.mod

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@achingbrain/electron-fetch", "Headers")
@js.native
class Headers () extends js.Object {
  def this(init: HeadersInit) = this()
  
  def apply(): IterableIterator[js.Tuple2[String, String]] = js.native
  
  def append(name: String, value: String): Unit = js.native
  
  def delete(name: String): Unit = js.native
  
  // WebIDL pair iterator: iterable<ByteString, ByteString>
  def entries(): IterableIterator[js.Tuple2[String, String]] = js.native
  
  def forEach(callback: js.Function3[/* value */ String, /* name */ String, /* headers */ this.type, Unit]): Unit = js.native
  def forEach(
    callback: js.Function3[/* value */ String, /* name */ String, /* headers */ this.type, Unit],
    thisArg: js.Any
  ): Unit = js.native
  
  def get(name: String): String | Null = js.native
  
  def has(name: String): Boolean = js.native
  
  def keys(): IterableIterator[String] = js.native
  
  def set(name: String, value: String): Unit = js.native
  
  def values(): /* import warning: importer.ImportType#apply Failed type conversion: std.IterableIterator<string>[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Symbol.iterator * / any] */ js.Any = js.native
}
