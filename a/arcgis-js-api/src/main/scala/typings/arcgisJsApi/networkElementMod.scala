package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.NetworkElement
import typings.arcgisJsApi.esri.NetworkElementConstructor
import typings.arcgisJsApi.esri.NetworkElementProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkElementMod extends Shortcut {
  
  @JSImport("esri/rest/networks/support/NetworkElement", JSImport.Namespace)
  @js.native
  val ^ : js.Object & NetworkElementConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/networks/support/NetworkElement", JSImport.Namespace)
  @js.native
  /**
    * The network element is a representation of how the network topology defines its graph.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-NetworkElement.html)
    */
  open class Class ()
    extends StObject
       with NetworkElement {
    def this(properties: NetworkElementProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & NetworkElementConstructor
  
  /* This means you don't have to write `^`, but can instead just say `networkElementMod.foo` */
  override def _to: js.Object & NetworkElementConstructor = ^
}
