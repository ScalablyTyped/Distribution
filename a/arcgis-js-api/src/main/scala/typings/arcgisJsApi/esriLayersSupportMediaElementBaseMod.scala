package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.CornersGeoreference
import typings.arcgisJsApi.esri.ExtentAndRotationGeoreference
import typings.arcgisJsApi.esri.MediaElementBase
import typings.arcgisJsApi.esri.MediaElementBaseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportMediaElementBaseMod extends Shortcut {
  
  @JSImport("esri/layers/support/MediaElementBase", JSImport.Namespace)
  @js.native
  val ^ : MediaElementBaseConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/MediaElementBase", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with MediaElementBase {
    
    /**
      * The geographic location of the image or video element to be placed on the map.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MediaElementBase.html#georeference)
      */
    /* CompleteClass */
    var georeference: ExtentAndRotationGeoreference | CornersGeoreference = js.native
    
    /**
      * The opacity of the element.
      *
      * @default 1
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MediaElementBase.html#opacity)
      */
    /* CompleteClass */
    var opacity: Double = js.native
  }
  
  type _To = MediaElementBaseConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportMediaElementBaseMod.foo` */
  override def _to: MediaElementBaseConstructor = ^
}
