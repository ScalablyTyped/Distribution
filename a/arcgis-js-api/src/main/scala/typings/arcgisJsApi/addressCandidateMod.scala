package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.AddressCandidate
import typings.arcgisJsApi.esri.AddressCandidateConstructor
import typings.arcgisJsApi.esri.AddressCandidateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addressCandidateMod extends Shortcut {
  
  @JSImport("esri/rest/support/AddressCandidate", JSImport.Namespace)
  @js.native
  val ^ : js.Object & AddressCandidateConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/AddressCandidate", JSImport.Namespace)
  @js.native
  /**
    * Represents the result of a geocode service operation as a list of address candidates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AddressCandidate.html)
    */
  open class Class ()
    extends StObject
       with AddressCandidate {
    def this(properties: AddressCandidateProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & AddressCandidateConstructor
  
  /* This means you don't have to write `^`, but can instead just say `addressCandidateMod.foo` */
  override def _to: js.Object & AddressCandidateConstructor = ^
}
