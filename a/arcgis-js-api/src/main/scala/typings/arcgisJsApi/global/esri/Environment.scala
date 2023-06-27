package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.EnvironmentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Environment")
@js.native
/**
		 * Represents settings that affect the environment in which the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html) is displayed (such as lighting).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html)
		 */
open class Environment ()
  extends StObject
     with typings.arcgisJsApi.esri.Environment {
  def this(properties: EnvironmentProperties) = this()
}
