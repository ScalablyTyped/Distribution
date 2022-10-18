package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.DirectLineMeasurement3D
import typings.arcgisJsApi.esri.DirectLineMeasurement3DConstructor
import typings.arcgisJsApi.esri.DirectLineMeasurement3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsDirectLineMeasurement3DMod extends Shortcut {
  
  @JSImport("esri/widgets/DirectLineMeasurement3D", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DirectLineMeasurement3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/DirectLineMeasurement3D", JSImport.Namespace)
  @js.native
  /**
    * The DirectLineMeasurement3D widget calculates and displays the 3D distance between two points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-DirectLineMeasurement3D.html)
    */
  open class Class ()
    extends StObject
       with DirectLineMeasurement3D {
    def this(properties: DirectLineMeasurement3DProperties) = this()
  }
  
  type _To = js.Object & DirectLineMeasurement3DConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsDirectLineMeasurement3DMod.foo` */
  override def _to: js.Object & DirectLineMeasurement3DConstructor = ^
}
