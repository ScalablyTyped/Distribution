package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.IdentifyParameters
import typings.arcgisJsApi.esri.IdentifyParametersConstructor
import typings.arcgisJsApi.esri.IdentifyParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportIdentifyParametersMod extends Shortcut {
  
  @JSImport("esri/rest/support/IdentifyParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Object & IdentifyParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/IdentifyParameters", JSImport.Namespace)
  @js.native
  /**
    * Input parameters for the [identify](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-identify.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html)
    */
  open class Class ()
    extends StObject
       with IdentifyParameters {
    def this(properties: IdentifyParametersProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & IdentifyParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportIdentifyParametersMod.foo` */
  override def _to: js.Object & IdentifyParametersConstructor = ^
}
