package typings.appleMapkitJsBrowser.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options that constrain geocoder lookup results to a specific area or set a
  * language for results.
  */
@js.native
trait GeocoderLookupOptions extends js.Object {
  
  /**
    * Coordinates used to constrain the lookup results.
    */
  var coordinate: js.UndefOr[Coordinate] = js.native
  
  /**
    * The language in which to display the lookup results.
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * A list of countries in which to constrain the lookup results.
    */
  var limitToCountries: js.UndefOr[String] = js.native
  
  /**
    * A region in which to constrain lookup results.
    */
  var region: js.UndefOr[CoordinateRegion] = js.native
}
object GeocoderLookupOptions {
  
  @scala.inline
  def apply(): GeocoderLookupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocoderLookupOptions]
  }
  
  @scala.inline
  implicit class GeocoderLookupOptionsOps[Self <: GeocoderLookupOptions] (val x: Self) extends AnyVal {
    
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
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLimitToCountries(value: String): Self = this.set("limitToCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitToCountries: Self = this.set("limitToCountries", js.undefined)
    
    @scala.inline
    def setRegion(value: CoordinateRegion): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
}
