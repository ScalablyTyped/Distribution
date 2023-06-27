package typings.arcgisJsApi

import typings.arcgisJsApi.esri.UniqueValueClass
import typings.arcgisJsApi.esri.UniqueValueClassProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRenderersSupportUniqueValueClassMod {
  
  @JSImport("esri/renderers/support/UniqueValueClass", JSImport.Namespace)
  @js.native
  /**
  		 * Defines a category within a [UniqueValueGroup](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueGroup.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueClass.html)
  		 */
  open class ^ ()
    extends StObject
       with UniqueValueClass {
    def this(properties: UniqueValueClassProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/renderers/support/UniqueValueClass", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): UniqueValueClass = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[UniqueValueClass]
}
