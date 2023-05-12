package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`feature-reduction-popup-element`
import typings.arcgisJsApi.arcgisJsApiStrings.`feature-reduction-popup`
import typings.arcgisJsApi.arcgisJsApiStrings.`feature-z`
import typings.arcgisJsApi.arcgisJsApiStrings.`field-calculation`
import typings.arcgisJsApi.arcgisJsApiStrings.`form-calculation`
import typings.arcgisJsApi.arcgisJsApiStrings.`form-constraint`
import typings.arcgisJsApi.arcgisJsApiStrings.`popup-element`
import typings.arcgisJsApi.arcgisJsApiStrings.labeling
import typings.arcgisJsApi.arcgisJsApiStrings.popup
import typings.arcgisJsApi.arcgisJsApiStrings.visualization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This module allows you to evaluate [Arcade expressions](https://developers.arcgis.com/javascript/latest/arcade/) outside traditional ArcGIS Arcade [profiles](https://developers.arcgis.com/javascript/latest/arcade/#where-can-i-use-arcade).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-arcade.html)
  */
trait arcade extends StObject {
  
  /**
    * Compiles an Arcade expression and its profile into an executor.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-arcade.html#createArcadeExecutor)
    */
  def createArcadeExecutor(script: String, profile: Profile): js.Promise[ArcadeExecutor]
  
  /**
    * Creates a [Profile](https://developers.arcgis.com/javascript/latest/api-reference/esri-arcade.html#Profile) definition for an Arcade profile implemented in the ArcGIS Maps SDK for JavaScript.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-arcade.html#createArcadeProfile)
    */
  def createArcadeProfile(
    profileName: `form-constraint` | `feature-z` | `field-calculation` | `form-calculation` | labeling | popup | `popup-element` | `feature-reduction-popup` | `feature-reduction-popup-element` | visualization
  ): Profile
}
object arcade {
  
  inline def apply(
    createArcadeExecutor: (String, Profile) => js.Promise[ArcadeExecutor],
    createArcadeProfile: `form-constraint` | `feature-z` | `field-calculation` | `form-calculation` | labeling | popup | `popup-element` | `feature-reduction-popup` | `feature-reduction-popup-element` | visualization => Profile
  ): arcade = {
    val __obj = js.Dynamic.literal(createArcadeExecutor = js.Any.fromFunction2(createArcadeExecutor), createArcadeProfile = js.Any.fromFunction1(createArcadeProfile))
    __obj.asInstanceOf[arcade]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: arcade] (val x: Self) extends AnyVal {
    
    inline def setCreateArcadeExecutor(value: (String, Profile) => js.Promise[ArcadeExecutor]): Self = StObject.set(x, "createArcadeExecutor", js.Any.fromFunction2(value))
    
    inline def setCreateArcadeProfile(
      value: `form-constraint` | `feature-z` | `field-calculation` | `form-calculation` | labeling | popup | `popup-element` | `feature-reduction-popup` | `feature-reduction-popup-element` | visualization => Profile
    ): Self = StObject.set(x, "createArcadeProfile", js.Any.fromFunction1(value))
  }
}
