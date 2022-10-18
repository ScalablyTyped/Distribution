package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LocatorSearchSource
import typings.arcgisJsApi.esri.LocatorSearchSourceConstructor
import typings.arcgisJsApi.esri.LocatorSearchSourceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSearchLocatorSearchSourceMod extends Shortcut {
  
  @JSImport("esri/widgets/Search/LocatorSearchSource", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LocatorSearchSourceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Search/LocatorSearchSource", JSImport.Namespace)
  @js.native
  /**
    * The following properties define a [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#sources) pointing to a [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html#url) that represents a locator service, which may be used to geocode locations with a [Search](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html) widget instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-LocatorSearchSource.html)
    */
  open class Class ()
    extends StObject
       with LocatorSearchSource {
    def this(properties: LocatorSearchSourceProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & LocatorSearchSourceConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSearchLocatorSearchSourceMod.foo` */
  override def _to: js.Object & LocatorSearchSourceConstructor = ^
}
