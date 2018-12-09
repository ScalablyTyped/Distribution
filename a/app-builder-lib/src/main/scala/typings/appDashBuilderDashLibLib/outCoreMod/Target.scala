package typings
package appDashBuilderDashLibLib.outCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/core", "Target")
@js.native
abstract class Target protected () extends js.Object {
  protected def this(name: java.lang.String) = this()
  protected def this(name: java.lang.String, isAsyncSupported: scala.Boolean) = this()
  val isAsyncSupported: scala.Boolean = js.native
  val name: java.lang.String = js.native
  val options: js.UndefOr[TargetSpecificOptions | scala.Null] = js.native
  val outDir: java.lang.String = js.native
  def build(appOutDir: java.lang.String, arch: builderDashUtilLib.outArchMod.Arch): js.Promise[_] = js.native
  def checkOptions(): js.Promise[_] = js.native
  def finishBuild(): js.Promise[_] = js.native
}

