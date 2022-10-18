package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.StatisticDefinition
import typings.arcgisJsApi.esri.StatisticDefinitionConstructor
import typings.arcgisJsApi.esri.StatisticDefinitionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportStatisticDefinitionMod extends Shortcut {
  
  @JSImport("esri/rest/support/StatisticDefinition", JSImport.Namespace)
  @js.native
  val ^ : js.Object & StatisticDefinitionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/StatisticDefinition", JSImport.Namespace)
  @js.native
  /**
    * This class defines the parameters for querying a layer or layer view for statistics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-StatisticDefinition.html)
    */
  open class Class ()
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
  
  type _To = js.Object & StatisticDefinitionConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportStatisticDefinitionMod.foo` */
  override def _to: js.Object & StatisticDefinitionConstructor = ^
}
