package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Directions
import typings.arcgisJsApi.esri.DirectionsConstructor
import typings.arcgisJsApi.esri.DirectionsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directionsMod extends Shortcut {
  
  @JSImport("esri/widgets/Directions", JSImport.Namespace)
  @js.native
  val ^ : DirectionsConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Directions", JSImport.Namespace)
  @js.native
  /**
    * The Directions Widget provides a way to build driving and walking directions using ArcGIS Online and custom Network Analysis Route services.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html)
    */
  class Class () extends Directions {
    def this(properties: DirectionsProperties) = this()
  }
  
  type _To = DirectionsConstructor
  
  /* This means you don't have to write `^`, but can instead just say `directionsMod.foo` */
  override def _to: DirectionsConstructor = ^
}
