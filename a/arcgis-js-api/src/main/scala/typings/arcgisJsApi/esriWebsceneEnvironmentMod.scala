package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Environment
import typings.arcgisJsApi.esri.EnvironmentConstructor
import typings.arcgisJsApi.esri.EnvironmentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWebsceneEnvironmentMod extends Shortcut {
  
  @JSImport("esri/webscene/Environment", JSImport.Namespace)
  @js.native
  val ^ : js.Object & EnvironmentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webscene/Environment", JSImport.Namespace)
  @js.native
  /**
    * Represents settings that affect the environment in which the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html) is displayed (such as lighting).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html)
    */
  open class Class ()
    extends StObject
       with Environment {
    def this(properties: EnvironmentProperties) = this()
  }
  
  type _To = js.Object & EnvironmentConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWebsceneEnvironmentMod.foo` */
  override def _to: js.Object & EnvironmentConstructor = ^
}
