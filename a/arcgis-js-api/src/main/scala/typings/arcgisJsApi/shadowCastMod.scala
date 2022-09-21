package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ShadowCast
import typings.arcgisJsApi.esri.ShadowCastConstructor
import typings.arcgisJsApi.esri.ShadowCastProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shadowCastMod extends Shortcut {
  
  @JSImport("esri/widgets/ShadowCast", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ShadowCastConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/ShadowCast", JSImport.Namespace)
  @js.native
  /**
    * The ShadowCast widget displays the cumulative shadows of 3D features in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast.html)
    */
  open class Class ()
    extends StObject
       with ShadowCast {
    def this(properties: ShadowCastProperties) = this()
  }
  
  type _To = js.Object & ShadowCastConstructor
  
  /* This means you don't have to write `^`, but can instead just say `shadowCastMod.foo` */
  override def _to: js.Object & ShadowCastConstructor = ^
}
