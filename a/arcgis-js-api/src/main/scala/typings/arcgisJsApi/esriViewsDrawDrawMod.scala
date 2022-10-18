package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Draw
import typings.arcgisJsApi.esri.DrawConstructor
import typings.arcgisJsApi.esri.DrawProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViewsDrawDrawMod extends Shortcut {
  
  @JSImport("esri/views/draw/Draw", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DrawConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/draw/Draw", JSImport.Namespace)
  @js.native
  /**
    * The Draw class provides advanced drawing capabilities for developers who need complete control over creating temporary graphics with different geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html)
    */
  open class Class ()
    extends StObject
       with Draw {
    def this(properties: DrawProperties) = this()
  }
  
  type _To = js.Object & DrawConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViewsDrawDrawMod.foo` */
  override def _to: js.Object & DrawConstructor = ^
}
