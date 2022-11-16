package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.published
import typings.arcgisJsApi.arcgisJsApiStrings.publishing
import typings.arcgisJsApi.arcgisJsApiStrings.unavailable
import typings.arcgisJsApi.arcgisJsApiStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishingInfo
  extends StObject
     with Accessor {
  
  /**
    * Layer's publishing status while the layer is being published to the portal.
    *
    * @default "unknown"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PublishingInfo.html#status)
    */
  val status: unknown | unavailable | publishing | published = js.native
  
  /**
    * Indicates if the layer's status is still being updated.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PublishingInfo.html#updating)
    */
  val updating: Boolean = js.native
}
