package typings
package appleDashMapkitDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mapkitNs {
  type AutoCompleteCallback = js.Function0[scala.Unit]
  type GeocoderLookupCallback = js.Function2[/* error */ stdLib.Error, /* data */ GeocoderResponse, scala.Unit]
  /* Rewritten from type alias, can be one of: 
    - Annotation
    - Overlay
    - js.Array[Annotation]
    - js.Array[Overlay]
  */
  type ItemType = _ItemType | js.Array[Annotation] | js.Array[Overlay]
  type SearchCallback = js.Function0[scala.Unit]
  type TileCallbackFunction = js.Function5[
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    /* z */ scala.Double, 
    /* scale */ scala.Double, 
    /* data */ js.Any, 
    java.lang.String
  ]
}
