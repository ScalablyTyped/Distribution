package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeReference
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Indicates if the source time zone respects day light savings.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeReference.html#respectsDaylightSaving)
    */
  var respectsDaylightSaving: Boolean = js.native
  
  /**
    * The timezone of the source data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeReference.html#timezone)
    */
  var timezone: String = js.native
}
