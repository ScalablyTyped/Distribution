package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ImageServiceIdentifyParameters
import typings.arcgisJsApi.esri.ImageServiceIdentifyParametersConstructor
import typings.arcgisJsApi.esri.ImageServiceIdentifyParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageServiceIdentifyParametersMod extends Shortcut {
  
  @JSImport("esri/tasks/support/ImageServiceIdentifyParameters", JSImport.Namespace)
  @js.native
  val ^ : ImageServiceIdentifyParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/ImageServiceIdentifyParameters", JSImport.Namespace)
  @js.native
  class Class () extends ImageServiceIdentifyParameters {
    def this(properties: ImageServiceIdentifyParametersProperties) = this()
  }
  
  type _To = ImageServiceIdentifyParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `imageServiceIdentifyParametersMod.foo` */
  override def _to: ImageServiceIdentifyParametersConstructor = ^
}
