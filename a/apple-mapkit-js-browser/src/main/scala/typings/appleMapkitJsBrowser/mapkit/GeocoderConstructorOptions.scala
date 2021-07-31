package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Initialization options for geocoder objects.
  */
trait GeocoderConstructorOptions extends StObject {
  
  /**
    * A Boolean value that indicates whether the geocoder should return results
    * near the user's current location.
    */
  var getsUserLocation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value that indicates whether the geocoder should return results
    * near the user's current location.
    */
  var language: js.UndefOr[String] = js.undefined
}
object GeocoderConstructorOptions {
  
  @scala.inline
  def apply(): GeocoderConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocoderConstructorOptions]
  }
  
  @scala.inline
  implicit class GeocoderConstructorOptionsMutableBuilder[Self <: GeocoderConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetsUserLocation(value: Boolean): Self = StObject.set(x, "getsUserLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetsUserLocationUndefined: Self = StObject.set(x, "getsUserLocation", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
  }
}
