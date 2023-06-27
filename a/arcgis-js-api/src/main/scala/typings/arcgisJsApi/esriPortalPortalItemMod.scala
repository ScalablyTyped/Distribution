package typings.arcgisJsApi

import typings.arcgisJsApi.esri.PortalItem
import typings.arcgisJsApi.esri.PortalItemProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriPortalPortalItemMod {
  
  @JSImport("esri/portal/PortalItem", JSImport.Namespace)
  @js.native
  /**
  		 * An item (a unit of content) in the Portal.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html)
  		 */
  open class ^ ()
    extends StObject
       with PortalItem {
    def this(properties: PortalItemProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/portal/PortalItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): PortalItem = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[PortalItem]
}
