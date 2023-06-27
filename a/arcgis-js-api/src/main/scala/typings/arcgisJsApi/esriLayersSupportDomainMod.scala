package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Domain
import typings.arcgisJsApi.esri.DomainProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersSupportDomainMod {
  
  @JSImport("esri/layers/support/Domain", JSImport.Namespace)
  @js.native
  /**
  		 * Domains define constraints on a [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html)
  		 */
  open class ^ ()
    extends StObject
       with Domain {
    def this(properties: DomainProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/layers/support/Domain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): Domain = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Domain]
}
