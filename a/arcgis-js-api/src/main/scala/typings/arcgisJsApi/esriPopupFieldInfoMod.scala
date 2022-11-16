package typings.arcgisJsApi

import typings.arcgisJsApi.esri.FieldInfo
import typings.arcgisJsApi.esri.FieldInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriPopupFieldInfoMod {
  
  @JSImport("esri/popup/FieldInfo", JSImport.Namespace)
  @js.native
  /**
    * The `FieldInfo` class defines how a [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) participates, or in some cases, does not participate, in a [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html)
    */
  open class ^ ()
    extends StObject
       with FieldInfo {
    def this(properties: FieldInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/popup/FieldInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): FieldInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[FieldInfo]
}
