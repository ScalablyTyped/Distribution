package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options that you may provide when creating a search object.
  */
@js.native
trait SearchConstructorOptions extends js.Object {
  /**
    * A map coordinate that provides a hint for the geographic area to search.
    */
  var coordinate: js.UndefOr[Coordinate] = js.native
  /**
    * A Boolean value that indicates whether to limit the search results to the
    * user's current location, as determined by the web browser.
    */
  var getsUserLocation: js.UndefOr[Boolean] = js.native
  /**
    * A language ID that determines the language for the search result text.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * A map region that provides a hint for the geographic area to search.
    */
  var region: js.UndefOr[CoordinateRegion] = js.native
}

object SearchConstructorOptions {
  @scala.inline
  def apply(): SearchConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchConstructorOptions]
  }
  @scala.inline
  implicit class SearchConstructorOptionsOps[Self <: SearchConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCoordinate(value: Coordinate): Self = this.set("coordinate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoordinate: Self = this.set("coordinate", js.undefined)
    @scala.inline
    def setGetsUserLocation(value: Boolean): Self = this.set("getsUserLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetsUserLocation: Self = this.set("getsUserLocation", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setRegion(value: CoordinateRegion): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
  
}

