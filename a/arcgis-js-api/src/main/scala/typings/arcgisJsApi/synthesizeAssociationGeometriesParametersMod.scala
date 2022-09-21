package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SynthesizeAssociationGeometriesParameters
import typings.arcgisJsApi.esri.SynthesizeAssociationGeometriesParametersConstructor
import typings.arcgisJsApi.esri.SynthesizeAssociationGeometriesParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object synthesizeAssociationGeometriesParametersMod extends Shortcut {
  
  @JSImport("esri/rest/networks/support/SynthesizeAssociationGeometriesParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SynthesizeAssociationGeometriesParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/networks/support/SynthesizeAssociationGeometriesParameters", JSImport.Namespace)
  @js.native
  /**
    * This class describes the parameters required to execute the synthesizeAssociationGeometries function which synthesizes and returns the associations geometries in a given extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-SynthesizeAssociationGeometriesParameters.html)
    */
  open class Class ()
    extends StObject
       with SynthesizeAssociationGeometriesParameters {
    def this(properties: SynthesizeAssociationGeometriesParametersProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & SynthesizeAssociationGeometriesParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `synthesizeAssociationGeometriesParametersMod.foo` */
  override def _to: js.Object & SynthesizeAssociationGeometriesParametersConstructor = ^
}
