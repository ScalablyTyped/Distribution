package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BufferParameters
import typings.arcgisJsApi.esri.BufferParametersConstructor
import typings.arcgisJsApi.esri.BufferParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferParametersMod extends Shortcut {
  
  @JSImport("esri/rest/support/BufferParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Object & BufferParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/BufferParameters", JSImport.Namespace)
  @js.native
  /**
    * Sets the distances, units, and other parameters for the [buffer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#buffer) method on the [geometryService](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BufferParameters.html)
    */
  open class Class ()
    extends StObject
       with BufferParameters {
    def this(properties: BufferParametersProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & BufferParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `bufferParametersMod.foo` */
  override def _to: js.Object & BufferParametersConstructor = ^
}
