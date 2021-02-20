package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FindResult
import typings.arcgisJsApi.esri.FindResultConstructor
import typings.arcgisJsApi.esri.FindResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findResultMod extends Shortcut {
  
  @JSImport("esri/tasks/support/FindResult", JSImport.Namespace)
  @js.native
  val ^ : FindResultConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/FindResult", JSImport.Namespace)
  @js.native
  class Class () extends FindResult {
    def this(properties: FindResultProperties) = this()
  }
  
  type _To = FindResultConstructor
  
  /* This means you don't have to write `^`, but can instead just say `findResultMod.foo` */
  override def _to: FindResultConstructor = ^
}
