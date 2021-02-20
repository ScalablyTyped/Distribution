package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ArcGISImageService
import typings.arcgisJsApi.esri.ArcGISImageServiceConstructor
import typings.arcgisJsApi.esri.ArcGISImageServiceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arcGISImageServiceMod extends Shortcut {
  
  @JSImport("esri/layers/mixins/ArcGISImageService", JSImport.Namespace)
  @js.native
  val ^ : ArcGISImageServiceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/mixins/ArcGISImageService", JSImport.Namespace)
  @js.native
  class Class () extends ArcGISImageService {
    def this(properties: ArcGISImageServiceProperties) = this()
  }
  
  type _To = ArcGISImageServiceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `arcGISImageServiceMod.foo` */
  override def _to: ArcGISImageServiceConstructor = ^
}
