package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`default-curve-extension`
import typings.arcgisJsApi.arcgisJsApiStrings.`keep-end-attributes`
import typings.arcgisJsApi.arcgisJsApiStrings.`no-end-attributes`
import typings.arcgisJsApi.arcgisJsApiStrings.`no-extend-at-from`
import typings.arcgisJsApi.arcgisJsApiStrings.`no-extend-at-to`
import typings.arcgisJsApi.arcgisJsApiStrings.`relocate-ends`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrimExtendParameters
  extends Accessor
     with JSONSupport {
  /**
    * A flag used with the `trimExtend` operation.
    *
    * Possible Value | Description
    * ---------------|-------------
    * default-curve-extension | The extension considers both ends of the path. The old ends remain and new points are added to the extended ends. The new points have attributes that are extrapolated from existing adjacent segments.
    * relocate-ends | When an extension is performed at an end, relocate the end point to the new position.
    * keep-end-attributes | When an extension is performed at an end, do not extrapolate the end segments attributes for the new point. Instead, the attributes will be the same as the current end.
    * no-end-attributes | When an extension is performed at an end, do not extrapolate the end segments attributes for the new point. Instead the attributes will be empty.
    * no-extend-at-from | Do not extend the 'from' end of any path.
    * no-extend-at-to | Do not extend the 'to' end of any path.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-TrimExtendParameters.html#extendHow)
    *
    * @default "default-curve-extension"
    */
  var extendHow: `default-curve-extension` | `relocate-ends` | `keep-end-attributes` | `no-end-attributes` | `no-extend-at-from` | `no-extend-at-to` = js.native
  /**
    * The array of polylines to trim or extend. The structure of each geometry in the array is the same as the structure of the JSON polyline objects returned by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-TrimExtendParameters.html#polylines)
    */
  var polylines: js.Array[Polyline] = js.native
  /**
    * A polyline used as a guide for trimming or extending input polylines. The structure of the polyline is the same as the structure of the JSON polyline object returned by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-TrimExtendParameters.html#trimExtendTo)
    */
  var trimExtendTo: Polyline = js.native
}

