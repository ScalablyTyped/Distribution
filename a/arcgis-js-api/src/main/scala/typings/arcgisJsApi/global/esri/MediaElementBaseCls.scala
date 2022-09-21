package typings.arcgisJsApi.global.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.MediaElementBase")
@js.native
open class MediaElementBaseCls ()
  extends StObject
     with typings.arcgisJsApi.esri.MediaElementBase {
  
  /**
    * The geographic location of the image or video element to be placed on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MediaElementBase.html#georeference)
    */
  /* CompleteClass */
  var georeference: typings.arcgisJsApi.esri.ExtentAndRotationGeoreference | typings.arcgisJsApi.esri.CornersGeoreference = js.native
  
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
