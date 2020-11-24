package typings.appleMapkitJsBrowser.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Initialization options for MapKit JS.
  */
@js.native
trait MapKitInitOptions extends js.Object {
  
  /**
    * A callback function that obtains a token.
    *
    * @param done A function that completes the MapKit JS token request. Called
    * after creating a new token.
    */
  def authorizationCallback(done: js.Function1[/* token */ String, Unit]): Unit = js.native
  
  /**
    * An ID that indicates the preferred language in which to display map
    * labels, controls, directions, and other text.
    */
  var language: js.UndefOr[String] = js.native
}
object MapKitInitOptions {
  
  @scala.inline
  def apply(authorizationCallback: js.Function1[/* token */ String, Unit] => Unit): MapKitInitOptions = {
    val __obj = js.Dynamic.literal(authorizationCallback = js.Any.fromFunction1(authorizationCallback))
    __obj.asInstanceOf[MapKitInitOptions]
  }
  
  @scala.inline
  implicit class MapKitInitOptionsOps[Self <: MapKitInitOptions] (val x: Self) extends AnyVal {
    
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
    def setAuthorizationCallback(value: js.Function1[/* token */ String, Unit] => Unit): Self = this.set("authorizationCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
  }
}
