package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Environment
import typings.arcgisJsApi.esri.EnvironmentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebsceneEnvironmentMod {
  
  @JSImport("esri/webscene/Environment", JSImport.Namespace)
  @js.native
  /**
    * Represents settings that affect the environment in which the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html) is displayed (such as lighting).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html)
    */
  open class ^ ()
    extends StObject
       with Environment {
    def this(properties: EnvironmentProperties) = this()
  }
}
