package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaContentConstructor
  extends StObject
     with /**
  * A `MediaContent` popup element contains an individual or array of chart and/or image media elements to display within a popup's content.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html)
  */
Instantiable0[MediaContent]
     with Instantiable1[/* properties */ MediaContentProperties, MediaContent] {
  
  def fromJSON(json: js.Any): MediaContent = js.native
}
