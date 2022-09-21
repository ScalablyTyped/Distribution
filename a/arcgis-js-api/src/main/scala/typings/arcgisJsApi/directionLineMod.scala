package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.DirectionLine
import typings.arcgisJsApi.esri.DirectionLineConstructor
import typings.arcgisJsApi.esri.DirectionLineProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directionLineMod extends Shortcut {
  
  @JSImport("esri/rest/support/DirectionLine", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DirectionLineConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/DirectionLine", JSImport.Namespace)
  @js.native
  /**
    * The DirectionLine represents polylines associated with individual direction items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionLine.html)
    */
  open class Class ()
    extends StObject
       with DirectionLine {
    def this(properties: DirectionLineProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & DirectionLineConstructor
  
  /* This means you don't have to write `^`, but can instead just say `directionLineMod.foo` */
  override def _to: js.Object & DirectionLineConstructor = ^
}
