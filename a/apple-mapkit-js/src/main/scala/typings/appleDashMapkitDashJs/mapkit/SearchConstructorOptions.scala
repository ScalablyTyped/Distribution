package typings.appleDashMapkitDashJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options that you may provide when creating a search object.
  */
trait SearchConstructorOptions extends js.Object {
  /**
    * A map coordinate that provides a hint for the geographic area to search.
    */
  var coordinate: js.UndefOr[Coordinate] = js.undefined
  /**
    * A Boolean value that indicates whether to limit the search results to the
    * user's current location, as determined by the web browser.
    */
  var getsUserLocation: js.UndefOr[Boolean] = js.undefined
  /**
    * A language ID that determines the language for the search result text.
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * A map region that provides a hint for the geographic area to search.
    */
  var region: js.UndefOr[CoordinateRegion] = js.undefined
}

object SearchConstructorOptions {
  @scala.inline
  def apply(
    coordinate: Coordinate = null,
    getsUserLocation: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    region: CoordinateRegion = null
  ): SearchConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (coordinate != null) __obj.updateDynamic("coordinate")(coordinate.asInstanceOf[js.Any])
    if (!js.isUndefined(getsUserLocation)) __obj.updateDynamic("getsUserLocation")(getsUserLocation.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchConstructorOptions]
  }
}

