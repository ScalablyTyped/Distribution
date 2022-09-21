package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Extent
import typings.arcgisJsApi.esri.ExtentConstructor
import typings.arcgisJsApi.esri.ExtentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extentMod extends Shortcut {
  
  @JSImport("esri/geometry/Extent", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ExtentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/Extent", JSImport.Namespace)
  @js.native
  /**
    * The minimum and maximum X and Y coordinates of a bounding box.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html)
    */
  open class Class ()
    extends StObject
       with Extent {
    def this(properties: ExtentProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ExtentConstructor
  
  /* This means you don't have to write `^`, but can instead just say `extentMod.foo` */
  override def _to: js.Object & ExtentConstructor = ^
}
