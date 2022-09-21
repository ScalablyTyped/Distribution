package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.UniqueValueInfo
import typings.arcgisJsApi.esri.UniqueValueInfoConstructor
import typings.arcgisJsApi.esri.UniqueValueInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uniqueValueInfoMod extends Shortcut {
  
  @JSImport("esri/renderers/support/UniqueValueInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & UniqueValueInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/support/UniqueValueInfo", JSImport.Namespace)
  @js.native
  /**
    * Defines the symbols to use in a [UniqueValueRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueInfo.html)
    */
  open class Class ()
    extends StObject
       with UniqueValueInfo {
    def this(properties: UniqueValueInfoProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & UniqueValueInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `uniqueValueInfoMod.foo` */
  override def _to: js.Object & UniqueValueInfoConstructor = ^
}
