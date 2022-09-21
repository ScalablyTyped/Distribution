package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Viewpoint
import typings.arcgisJsApi.esri.ViewpointConstructor
import typings.arcgisJsApi.esri.ViewpointProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewpointMod extends Shortcut {
  
  @JSImport("esri/Viewpoint", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ViewpointConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/Viewpoint", JSImport.Namespace)
  @js.native
  /**
    * Describes a point of view for a 2D or 3D view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html)
    */
  open class Class ()
    extends StObject
       with Viewpoint {
    def this(properties: ViewpointProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ViewpointConstructor
  
  /* This means you don't have to write `^`, but can instead just say `viewpointMod.foo` */
  override def _to: js.Object & ViewpointConstructor = ^
}
