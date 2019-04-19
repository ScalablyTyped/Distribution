package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextBufferFileBackend extends js.Object {
  /**
    *  A {Function} that invokes its callback argument
    *  when the file changes. The method should return a {Disposable} that
    *  can be used to prevent further calls to the callback.
    */
  var onDidChange: js.UndefOr[js.Function1[/* callback */ js.Function0[scala.Unit], Disposable]] = js.undefined
  /**
    *  A {Function} that invokes its callback argument
    *  when the file is deleted. The method should return a {Disposable} that
    *  can be used to prevent further calls to the callback.
    */
  var onDidDelete: js.UndefOr[js.Function1[/* callback */ js.Function0[scala.Unit], Disposable]] = js.undefined
  /**
    *  A {Function} that invokes its callback argument
    *  when the file is renamed. The method should return a {Disposable} that
    *  can be used to prevent further calls to the callback.
    */
  var onDidRename: js.UndefOr[js.Function1[/* callback */ js.Function0[scala.Unit], Disposable]] = js.undefined
  /**
    *  A {Function} that returns a `Readable` stream
    *  that can be used to load the file's content.
    */
  def createReadStream(): nodeLib.fsMod.ReadStream
  /**
    *  A {Function} that returns a `Writable` stream
    *  that can be used to save content to the file.
    */
  def createWriteStream(): nodeLib.fsMod.WriteStream
  /** A {Function} that returns a {Boolean}, true if the file exists, false otherwise. */
  def existsSync(): scala.Boolean
  /** A {Function} that returns the {String} path to the file. */
  def getPath(): java.lang.String
}

object TextBufferFileBackend {
  @scala.inline
  def apply(
    createReadStream: () => nodeLib.fsMod.ReadStream,
    createWriteStream: () => nodeLib.fsMod.WriteStream,
    existsSync: () => scala.Boolean,
    getPath: () => java.lang.String,
    onDidChange: /* callback */ js.Function0[scala.Unit] => Disposable = null,
    onDidDelete: /* callback */ js.Function0[scala.Unit] => Disposable = null,
    onDidRename: /* callback */ js.Function0[scala.Unit] => Disposable = null
  ): TextBufferFileBackend = {
    val __obj = js.Dynamic.literal(createReadStream = js.Any.fromFunction0(createReadStream), createWriteStream = js.Any.fromFunction0(createWriteStream), existsSync = js.Any.fromFunction0(existsSync), getPath = js.Any.fromFunction0(getPath))
    if (onDidChange != null) __obj.updateDynamic("onDidChange")(js.Any.fromFunction1(onDidChange))
    if (onDidDelete != null) __obj.updateDynamic("onDidDelete")(js.Any.fromFunction1(onDidDelete))
    if (onDidRename != null) __obj.updateDynamic("onDidRename")(js.Any.fromFunction1(onDidRename))
    __obj.asInstanceOf[TextBufferFileBackend]
  }
}

