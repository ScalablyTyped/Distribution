package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ArcGISMapService
import typings.arcgisJsApi.esri.ArcGISMapServiceConstructor
import typings.arcgisJsApi.esri.ArcGISMapServiceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arcGISMapServiceMod extends Shortcut {
  
  @JSImport("esri/layers/mixins/ArcGISMapService", JSImport.Namespace)
  @js.native
  val ^ : ArcGISMapServiceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/mixins/ArcGISMapService", JSImport.Namespace)
  @js.native
  class Class () extends ArcGISMapService {
    def this(properties: ArcGISMapServiceProperties) = this()
  }
  
  type _To = ArcGISMapServiceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `arcGISMapServiceMod.foo` */
  override def _to: ArcGISMapServiceConstructor = ^
}
