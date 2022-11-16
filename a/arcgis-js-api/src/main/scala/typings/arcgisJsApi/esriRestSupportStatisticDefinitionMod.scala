package typings.arcgisJsApi

import typings.arcgisJsApi.esri.StatisticDefinition
import typings.arcgisJsApi.esri.StatisticDefinitionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportStatisticDefinitionMod {
  
  @JSImport("esri/rest/support/StatisticDefinition", JSImport.Namespace)
  @js.native
  /**
    * This class defines the parameters for querying a layer or layer view for statistics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-StatisticDefinition.html)
    */
  open class ^ ()
    extends StObject
       with StatisticDefinition {
    def this(properties: StatisticDefinitionProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/StatisticDefinition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): StatisticDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[StatisticDefinition]
}
