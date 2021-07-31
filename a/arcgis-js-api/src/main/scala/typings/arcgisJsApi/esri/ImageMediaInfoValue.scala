package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageMediaInfoValue
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * A string containing a URL to be launched in a browser when a user clicks the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ImageMediaInfoValue.html#linkURL)
    */
  var linkURL: String = js.native
  
  /**
    * A string containing the URL to the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-support-ImageMediaInfoValue.html#sourceURL)
    */
  var sourceURL: String = js.native
}
