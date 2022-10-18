package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LineCallout3D
import typings.arcgisJsApi.esri.LineCallout3DConstructor
import typings.arcgisJsApi.esri.LineCallout3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSymbolsCalloutsLineCallout3DMod extends Shortcut {
  
  @JSImport("esri/symbols/callouts/LineCallout3D", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LineCallout3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/callouts/LineCallout3D", JSImport.Namespace)
  @js.native
  /**
    * This type of callout displays a line to connect a symbol or a label with its actual location in the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html)
    */
  open class Class ()
    extends StObject
       with LineCallout3D {
    def this(properties: LineCallout3DProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & LineCallout3DConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriSymbolsCalloutsLineCallout3DMod.foo` */
  override def _to: js.Object & LineCallout3DConstructor = ^
}
