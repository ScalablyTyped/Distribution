package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ImageServiceIdentifyResult
import typings.arcgisJsApi.esri.ImageServiceIdentifyResultConstructor
import typings.arcgisJsApi.esri.ImageServiceIdentifyResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageServiceIdentifyResultMod extends Shortcut {
  
  @JSImport("esri/tasks/support/ImageServiceIdentifyResult", JSImport.Namespace)
  @js.native
  val ^ : ImageServiceIdentifyResultConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/ImageServiceIdentifyResult", JSImport.Namespace)
  @js.native
  class Class () extends ImageServiceIdentifyResult {
    def this(properties: ImageServiceIdentifyResultProperties) = this()
  }
  
  type _To = ImageServiceIdentifyResultConstructor
  
  /* This means you don't have to write `^`, but can instead just say `imageServiceIdentifyResultMod.foo` */
  override def _to: ImageServiceIdentifyResultConstructor = ^
}
