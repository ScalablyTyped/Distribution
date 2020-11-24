package typings.appBuilderLib.coreMod

import typings.builderUtil.archMod.Arch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/core", "Target")
@js.native
abstract class Target protected () extends js.Object {
  protected def this(name: String) = this()
  protected def this(name: String, isAsyncSupported: Boolean) = this()
  
  def build(appOutDir: String, arch: Arch): js.Promise[_] = js.native
  
  def checkOptions(): js.Promise[_] = js.native
  
  def finishBuild(): js.Promise[_] = js.native
  
  val isAsyncSupported: Boolean = js.native
  
  val name: String = js.native
  
  val options: js.UndefOr[TargetSpecificOptions | Null] = js.native
  
  val outDir: String = js.native
}
