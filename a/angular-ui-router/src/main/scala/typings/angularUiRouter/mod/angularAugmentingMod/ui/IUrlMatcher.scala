package typings.angularUiRouter.mod.angularAugmentingMod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUrlMatcher extends js.Object {
  
  def concat(pattern: String): IUrlMatcher = js.native
  
  def exec(path: String): js.Object = js.native
  def exec(path: String, search: js.UndefOr[scala.Nothing], hash: js.UndefOr[scala.Nothing], options: js.Any): js.Object = js.native
  def exec(path: String, search: js.UndefOr[scala.Nothing], hash: String): js.Object = js.native
  def exec(path: String, search: js.UndefOr[scala.Nothing], hash: String, options: js.Any): js.Object = js.native
  def exec(path: String, search: js.Any): js.Object = js.native
  def exec(path: String, search: js.Any, hash: js.UndefOr[scala.Nothing], options: js.Any): js.Object = js.native
  def exec(path: String, search: js.Any, hash: String): js.Object = js.native
  def exec(path: String, search: js.Any, hash: String, options: js.Any): js.Object = js.native
  
  def format(values: js.Object): String = js.native
  
  def parameters(): js.Array[String] = js.native
}
