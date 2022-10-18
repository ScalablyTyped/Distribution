package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ArcGISImageService
import typings.arcgisJsApi.esri.ArcGISImageServiceConstructor
import typings.arcgisJsApi.esri.ArcGISImageServiceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersMixinsArcGISImageServiceMod extends Shortcut {
  
  @JSImport("esri/layers/mixins/ArcGISImageService", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ArcGISImageServiceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/mixins/ArcGISImageService", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with ArcGISImageService {
    def this(properties: ArcGISImageServiceProperties) = this()
  }
  
  type _To = js.Object & ArcGISImageServiceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersMixinsArcGISImageServiceMod.foo` */
  override def _to: js.Object & ArcGISImageServiceConstructor = ^
}
