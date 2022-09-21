package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TimeExtent
import typings.arcgisJsApi.esri.TimeExtentConstructor
import typings.arcgisJsApi.esri.TimeExtentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeExtentMod extends Shortcut {
  
  @JSImport("esri/TimeExtent", JSImport.Namespace)
  @js.native
  val ^ : js.Object & TimeExtentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/TimeExtent", JSImport.Namespace)
  @js.native
  /**
    * A period of time with a definitive [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#start) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#end) date.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html)
    */
  open class Class ()
    extends StObject
       with TimeExtent {
    def this(properties: TimeExtentProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & TimeExtentConstructor
  
  /* This means you don't have to write `^`, but can instead just say `timeExtentMod.foo` */
  override def _to: js.Object & TimeExtentConstructor = ^
}
