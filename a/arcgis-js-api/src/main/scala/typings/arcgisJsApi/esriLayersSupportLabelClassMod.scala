package typings.arcgisJsApi

import typings.arcgisJsApi.esri.LabelClass
import typings.arcgisJsApi.esri.LabelClassProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersSupportLabelClassMod {
  
  @JSImport("esri/layers/support/LabelClass", JSImport.Namespace)
  @js.native
  /**
    * Defines label expressions, symbols, scale ranges, label priorities, and label placement options for labels on a layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html)
    */
  open class ^ ()
    extends StObject
       with LabelClass {
    def this(properties: LabelClassProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/layers/support/LabelClass", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): LabelClass = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[LabelClass]
}
