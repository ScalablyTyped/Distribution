package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SearchSource
import typings.arcgisJsApi.esri.SearchSourceConstructor
import typings.arcgisJsApi.esri.SearchSourceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSearchSearchSourceMod extends Shortcut {
  
  @JSImport("esri/widgets/Search/SearchSource", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SearchSourceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Search/SearchSource", JSImport.Namespace)
  @js.native
  /**
    * The following properties define generic [sources](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#sources) properties for use in the [Search](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html)
    */
  open class Class ()
    extends StObject
       with SearchSource {
    def this(properties: SearchSourceProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & SearchSourceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSearchSearchSourceMod.foo` */
  override def _to: js.Object & SearchSourceConstructor = ^
}
