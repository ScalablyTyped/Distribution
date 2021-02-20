package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Graphic
import typings.arcgisJsApi.esri.GraphicConstructor
import typings.arcgisJsApi.esri.GraphicProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphicMod extends Shortcut {
  
  @JSImport("esri/Graphic", JSImport.Namespace)
  @js.native
  val ^ : GraphicConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/Graphic", JSImport.Namespace)
  @js.native
  /**
    * A Graphic is a vector representation of real world geographic phenomena.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html)
    */
  class Class () extends Graphic {
    def this(properties: GraphicProperties) = this()
  }
  
  type _To = GraphicConstructor
  
  /* This means you don't have to write `^`, but can instead just say `graphicMod.foo` */
  override def _to: GraphicConstructor = ^
}
