package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Geotrigger
import typings.arcgisJsApi.esri.GeotriggerConstructor
import typings.arcgisJsApi.esri.GeotriggerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geotriggerMod extends Shortcut {
  
  @JSImport("esri/webdoc/geotriggersInfo/Geotrigger", JSImport.Namespace)
  @js.native
  val ^ : js.Object & GeotriggerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webdoc/geotriggersInfo/Geotrigger", JSImport.Namespace)
  @js.native
  /**
    * A Geotrigger is a condition that will be monitored against dynamic GIS data - for example using a spatial operation to check for enter/exit.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-Geotrigger.html)
    */
  open class Class ()
    extends StObject
       with Geotrigger {
    def this(properties: GeotriggerProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & GeotriggerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `geotriggerMod.foo` */
  override def _to: js.Object & GeotriggerConstructor = ^
}
