package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ImageParameters
import typings.arcgisJsApi.esri.ImageParametersConstructor
import typings.arcgisJsApi.esri.ImageParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageParametersMod extends Shortcut {
  
  @JSImport("esri/layers/support/ImageParameters", JSImport.Namespace)
  @js.native
  val ^ : ImageParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/ImageParameters", JSImport.Namespace)
  @js.native
  class Class () extends ImageParameters {
    def this(properties: ImageParametersProperties) = this()
  }
  
  type _To = ImageParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `imageParametersMod.foo` */
  override def _to: ImageParametersConstructor = ^
}
