package typings.arcgisJsApi

import typings.arcgisJsApi.esri.UniqueValueGroup
import typings.arcgisJsApi.esri.UniqueValueGroupProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRenderersSupportUniqueValueGroupMod {
  
  @JSImport("esri/renderers/support/UniqueValueGroup", JSImport.Namespace)
  @js.native
  /**
  		 * UniqueValueGroup represents a group of [unique value classes](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueClass.html) (i.e.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueGroup.html)
  		 */
  open class ^ ()
    extends StObject
       with UniqueValueGroup {
    def this(properties: UniqueValueGroupProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/renderers/support/UniqueValueGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): UniqueValueGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[UniqueValueGroup]
}
