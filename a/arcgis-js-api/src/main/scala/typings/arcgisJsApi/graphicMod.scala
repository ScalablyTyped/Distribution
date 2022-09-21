package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Graphic
import typings.arcgisJsApi.esri.GraphicConstructor
import typings.arcgisJsApi.esri.GraphicProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphicMod extends Shortcut {
  
  @JSImport("esri/Graphic", JSImport.Namespace)
  @js.native
  val ^ : js.Object & GraphicConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/Graphic", JSImport.Namespace)
  @js.native
  /**
    * A Graphic is a vector representation of real world geographic phenomena.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html)
    */
  open class Class ()
    extends StObject
       with Graphic {
    def this(properties: GraphicProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & GraphicConstructor
  
  /* This means you don't have to write `^`, but can instead just say `graphicMod.foo` */
  override def _to: js.Object & GraphicConstructor = ^
}
