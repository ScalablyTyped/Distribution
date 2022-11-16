package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryAssociationsResult
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * List of [associations](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-Association.html) returned filtered based on the input parameters in [QueryAssociationsParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-QueryAssociationsParameters.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-QueryAssociationsResult.html#associations)
    */
  var associations: js.Array[Association] = js.native
}
