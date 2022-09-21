package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LineStylePattern3D
import typings.arcgisJsApi.esri.LineStylePattern3DConstructor
import typings.arcgisJsApi.esri.LineStylePattern3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineStylePattern3DMod extends Shortcut {
  
  @JSImport("esri/symbols/patterns/LineStylePattern3D", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LineStylePattern3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/patterns/LineStylePattern3D", JSImport.Namespace)
  @js.native
  /**
    * Renders lines with predefined style patterns.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-patterns-LineStylePattern3D.html)
    */
  open class Class ()
    extends StObject
       with LineStylePattern3D {
    def this(properties: LineStylePattern3DProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & LineStylePattern3DConstructor
  
  /* This means you don't have to write `^`, but can instead just say `lineStylePattern3DMod.foo` */
  override def _to: js.Object & LineStylePattern3DConstructor = ^
}
