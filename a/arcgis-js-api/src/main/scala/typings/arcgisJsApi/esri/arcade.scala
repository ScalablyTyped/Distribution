package typings.arcgisJsApi.esri

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
}
object arcade {
  
  inline def apply(createArcadeExecutor: (String, Profile) => js.Promise[ArcadeExecutor]): arcade = {
    val __obj = js.Dynamic.literal(createArcadeExecutor = js.Any.fromFunction2(createArcadeExecutor))
    __obj.asInstanceOf[arcade]
  }
  
  extension [Self <: arcade](x: Self) {
    
    inline def setCreateArcadeExecutor(value: (String, Profile) => js.Promise[ArcadeExecutor]): Self = StObject.set(x, "createArcadeExecutor", js.Any.fromFunction2(value))
  }
}
