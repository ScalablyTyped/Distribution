package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SunLighting
import typings.arcgisJsApi.esri.SunLightingConstructor
import typings.arcgisJsApi.esri.SunLightingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViews3dEnvironmentSunLightingMod extends Shortcut {
  
  @JSImport("esri/views/3d/environment/SunLighting", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SunLightingConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/3d/environment/SunLighting", JSImport.Namespace)
  @js.native
  /**
    * The SunLighting class allows you to change the lighting in the scene to sunlight.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SunLighting.html)
    */
  open class Class ()
    extends StObject
       with SunLighting {
    def this(properties: SunLightingProperties) = this()
  }
  
  type _To = js.Object & SunLightingConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViews3dEnvironmentSunLightingMod.foo` */
  override def _to: js.Object & SunLightingConstructor = ^
}
