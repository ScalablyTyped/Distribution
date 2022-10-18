package typings.admZip.anon

import typings.node.NodeJS.ErrnoException
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofmkdir extends StObject {
  
  def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
  def apply(
    path: PathLike,
    options: Null,
    callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: Null, callback: NoParamCallback): Unit = js.native
  def apply(
    path: PathLike,
    options: Unit,
    callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: Unit, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, options: MakeDirectoryOptionsrecurMode, callback: NoParamCallback): Unit = js.native
  def apply(
    path: PathLike,
    options: MakeDirectoryOptionsrecur,
    callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: MakeDirectoryOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: Mode,
    callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def apply(path: PathLike, options: Mode, callback: NoParamCallback): Unit = js.native
}
