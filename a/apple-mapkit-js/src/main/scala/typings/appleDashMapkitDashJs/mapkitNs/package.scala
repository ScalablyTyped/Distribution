package typings.appleDashMapkitDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mapkitNs {
  import typings.std.Error

  type AutoCompleteCallback = js.Function0[Unit]
  type GeocoderLookupCallback = js.Function2[/* error */ Error, /* data */ GeocoderResponse, Unit]
  /* Rewritten from type alias, can be one of: 
    - typings.appleDashMapkitDashJs.mapkitNs.Annotation
    - typings.appleDashMapkitDashJs.mapkitNs.Overlay
    - js.Array[
  typings.appleDashMapkitDashJs.mapkitNs.Annotation | typings.appleDashMapkitDashJs.mapkitNs.Overlay]
  */
  type ItemType = _ItemType | (js.Array[Annotation | Overlay])
  type SearchCallback = js.Function0[Unit]
  type TileCallbackFunction = js.Function5[
    /* x */ Double, 
    /* y */ Double, 
    /* z */ Double, 
    /* scale */ Double, 
    /* data */ js.Any, 
    String
  ]
}
