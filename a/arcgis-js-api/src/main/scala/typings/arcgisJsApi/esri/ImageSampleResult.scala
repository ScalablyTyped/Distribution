package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageSampleResult
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * An array of image sample results returned in response to [ImageryLayer.getSamples()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#getSamples) method.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleResult.html#samples)
  		 */
  var samples: js.Array[ImageSample] = js.native
}
