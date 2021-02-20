package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TablesMixin
import typings.arcgisJsApi.esri.TablesMixinConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tablesMixinMod extends Shortcut {
  
  @JSImport("esri/support/TablesMixin", JSImport.Namespace)
  @js.native
  val ^ : TablesMixinConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/support/TablesMixin", JSImport.Namespace)
  @js.native
  class Class () extends TablesMixin
  
  type _To = TablesMixinConstructor
  
  /* This means you don't have to write `^`, but can instead just say `tablesMixinMod.foo` */
  override def _to: TablesMixinConstructor = ^
}
