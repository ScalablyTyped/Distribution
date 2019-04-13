package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTapesOutput extends js.Object {
  /**
    * An opaque string which can be used as part of a subsequent DescribeTapes call to retrieve the next page of results. If a response does not contain a marker, then there are no more results to be retrieved.
    */
  var Marker: js.UndefOr[Marker] = js.undefined
  /**
    * An array of virtual tape descriptions.
    */
  var Tapes: js.UndefOr[Tapes] = js.undefined
}

object DescribeTapesOutput {
  @scala.inline
  def apply(Marker: Marker = null, Tapes: Tapes = null): DescribeTapesOutput = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (Tapes != null) __obj.updateDynamic("Tapes")(Tapes)
    __obj.asInstanceOf[DescribeTapesOutput]
  }
}

