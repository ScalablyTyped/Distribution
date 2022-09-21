package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.OffsetParameters
import typings.arcgisJsApi.esri.OffsetParametersConstructor
import typings.arcgisJsApi.esri.OffsetParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object offsetParametersMod extends Shortcut {
  
  @JSImport("esri/rest/support/OffsetParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Object & OffsetParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/OffsetParameters", JSImport.Namespace)
  @js.native
  /**
    * Sets the offset distance, type and other parameters for the [geometryService.offset](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#offset) operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-OffsetParameters.html)
    */
  open class Class ()
    extends StObject
       with OffsetParameters {
    def this(properties: OffsetParametersProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & OffsetParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `offsetParametersMod.foo` */
  override def _to: js.Object & OffsetParametersConstructor = ^
}
