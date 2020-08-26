package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options you can provide when performing a search.
  */
@js.native
trait SearchOptions extends js.Object {
  /**
    * A map coordinate that provides a hint for the geographic area to search.
    */
  var coordinate: Coordinate = js.native
  /**
    * A language ID that determines the language for the search result text.
    */
  var language: String = js.native
  /**
    * A map region that provides a hint for the geographic area to search.
    */
  var region: CoordinateRegion = js.native
}

object SearchOptions {
  @scala.inline
  def apply(coordinate: Coordinate, language: String, region: CoordinateRegion): SearchOptions = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
  @scala.inline
  implicit class SearchOptionsOps[Self <: SearchOptions] (val x: Self) extends AnyVal {
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
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: CoordinateRegion): Self = this.set("region", value.asInstanceOf[js.Any])
  }
  
}

