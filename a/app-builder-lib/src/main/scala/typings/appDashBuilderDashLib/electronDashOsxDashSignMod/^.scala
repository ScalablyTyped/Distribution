package typings.appDashBuilderDashLib.electronDashOsxDashSignMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/electron-osx-sign", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def flat(opts: FlatOptions, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  def flatAsync(opts: FlatOptions): js.Promise[_] = js.native
  def sign(opts: SignOptions, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  def signAsync(opts: SignOptions): js.Promise[_] = js.native
}

