package typings.atom.mod

import typings.node.fsMod.ReadStream
import typings.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextBufferFileBackend extends StObject {
  
  /**
    *  A {Function} that returns a `Readable` stream
    *  that can be used to load the file's content.
    */
  def createReadStream(): ReadStream = js.native
  
  /**
    *  A {Function} that returns a `Writable` stream
    *  that can be used to save content to the file.
    */
  def createWriteStream(): WriteStream = js.native
  
  /** A {Function} that returns a {Boolean}, true if the file exists, false otherwise. */
  def existsSync(): Boolean = js.native
  
  /** A {Function} that returns the {String} path to the file. */
  def getPath(): String = js.native
  
  /**
    *  A {Function} that invokes its callback argument
    *  when the file changes. The method should return a {Disposable} that
    *  can be used to prevent further calls to the callback.
    */
  var onDidChange: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Disposable]] = js.native
  
  /**
    *  A {Function} that invokes its callback argument
    *  when the file is deleted. The method should return a {Disposable} that
    *  can be used to prevent further calls to the callback.
    */
  var onDidDelete: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Disposable]] = js.native
  
  /**
    *  A {Function} that invokes its callback argument
    *  when the file is renamed. The method should return a {Disposable} that
    *  can be used to prevent further calls to the callback.
    */
  var onDidRename: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], Disposable]] = js.native
}
object TextBufferFileBackend {
  
  @scala.inline
  def apply(
    createReadStream: () => ReadStream,
    createWriteStream: () => WriteStream,
    existsSync: () => Boolean,
    getPath: () => String
  ): TextBufferFileBackend = {
    val __obj = js.Dynamic.literal(createReadStream = js.Any.fromFunction0(createReadStream), createWriteStream = js.Any.fromFunction0(createWriteStream), existsSync = js.Any.fromFunction0(existsSync), getPath = js.Any.fromFunction0(getPath))
    __obj.asInstanceOf[TextBufferFileBackend]
  }
  
  @scala.inline
  implicit class TextBufferFileBackendMutableBuilder[Self <: TextBufferFileBackend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateReadStream(value: () => ReadStream): Self = StObject.set(x, "createReadStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateWriteStream(value: () => WriteStream): Self = StObject.set(x, "createWriteStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExistsSync(value: () => Boolean): Self = StObject.set(x, "existsSync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPath(value: () => String): Self = StObject.set(x, "getPath", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDidChange(value: /* callback */ js.Function0[Unit] => Disposable): Self = StObject.set(x, "onDidChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidChangeUndefined: Self = StObject.set(x, "onDidChange", js.undefined)
    
    @scala.inline
    def setOnDidDelete(value: /* callback */ js.Function0[Unit] => Disposable): Self = StObject.set(x, "onDidDelete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidDeleteUndefined: Self = StObject.set(x, "onDidDelete", js.undefined)
    
    @scala.inline
    def setOnDidRename(value: /* callback */ js.Function0[Unit] => Disposable): Self = StObject.set(x, "onDidRename", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidRenameUndefined: Self = StObject.set(x, "onDidRename", js.undefined)
  }
}
