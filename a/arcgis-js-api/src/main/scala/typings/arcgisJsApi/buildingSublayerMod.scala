package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BuildingSublayer
import typings.arcgisJsApi.esri.BuildingSublayerConstructor
import typings.arcgisJsApi.esri.BuildingSublayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildingSublayerMod extends Shortcut {
  
  @JSImport("esri/layers/buildingSublayers/BuildingSublayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BuildingSublayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/buildingSublayers/BuildingSublayer", JSImport.Namespace)
  @js.native
  /**
    * BuildingSublayer is the base class for sublayers of a BuildingSceneLayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingSublayer.html)
    */
  open class Class ()
    extends StObject
       with BuildingSublayer {
    def this(properties: BuildingSublayerProperties) = this()
  }
  
  type _To = js.Object & BuildingSublayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `buildingSublayerMod.foo` */
  override def _to: js.Object & BuildingSublayerConstructor = ^
}
