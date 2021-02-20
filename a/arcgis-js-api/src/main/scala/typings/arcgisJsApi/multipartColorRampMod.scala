package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.MultipartColorRamp
import typings.arcgisJsApi.esri.MultipartColorRampConstructor
import typings.arcgisJsApi.esri.MultipartColorRampProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multipartColorRampMod extends Shortcut {
  
  @JSImport("esri/tasks/support/MultipartColorRamp", JSImport.Namespace)
  @js.native
  val ^ : MultipartColorRampConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/MultipartColorRamp", JSImport.Namespace)
  @js.native
  class Class () extends MultipartColorRamp {
    def this(properties: MultipartColorRampProperties) = this()
  }
  
  type _To = MultipartColorRampConstructor
  
  /* This means you don't have to write `^`, but can instead just say `multipartColorRampMod.foo` */
  override def _to: MultipartColorRampConstructor = ^
}
