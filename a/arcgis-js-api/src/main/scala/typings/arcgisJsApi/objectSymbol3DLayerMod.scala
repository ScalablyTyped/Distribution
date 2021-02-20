package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ObjectSymbol3DLayer
import typings.arcgisJsApi.esri.ObjectSymbol3DLayerConstructor
import typings.arcgisJsApi.esri.ObjectSymbol3DLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectSymbol3DLayerMod extends Shortcut {
  
  @JSImport("esri/symbols/ObjectSymbol3DLayer", JSImport.Namespace)
  @js.native
  val ^ : ObjectSymbol3DLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/ObjectSymbol3DLayer", JSImport.Namespace)
  @js.native
  /**
    * ObjectSymbol3DLayer is used to render [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries using a volumetric 3D shape (e.g., a sphere or cylinder) with a [PointSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html) in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html)
    */
  class Class () extends ObjectSymbol3DLayer {
    def this(properties: ObjectSymbol3DLayerProperties) = this()
  }
  
  type _To = ObjectSymbol3DLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `objectSymbol3DLayerMod.foo` */
  override def _to: ObjectSymbol3DLayerConstructor = ^
}
