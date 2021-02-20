package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`coded-value`
import typings.arcgisJsApi.arcgisJsApiStrings.inherited
import typings.arcgisJsApi.arcgisJsApiStrings.range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Domain
  extends Accessor
     with JSONSupport {
  
  /**
    * The domain name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html#name)
    */
  var name: String = js.native
  
  /**
    * The domain type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html#type)
    */
  var `type`: range | `coded-value` | inherited = js.native
}
