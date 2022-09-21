package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.HeightModelInfo
import typings.arcgisJsApi.esri.HeightModelInfoConstructor
import typings.arcgisJsApi.esri.HeightModelInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heightModelInfoMod extends Shortcut {
  
  @JSImport("esri/geometry/HeightModelInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & HeightModelInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/HeightModelInfo", JSImport.Namespace)
  @js.native
  /**
    * The height model info defines the characteristics of a vertical coordinate system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html)
    */
  open class Class ()
    extends StObject
       with HeightModelInfo {
    def this(properties: HeightModelInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & HeightModelInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `heightModelInfoMod.foo` */
  override def _to: js.Object & HeightModelInfoConstructor = ^
}
