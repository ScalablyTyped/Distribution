package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.GeotriggersInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.GeotriggersInfo")
@js.native
/**
  * Information relating to a list of Geotriggers.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-GeotriggersInfo.html)
  */
open class GeotriggersInfoCls ()
  extends StObject
     with typings.arcgisJsApi.esri.GeotriggersInfo {
  def this(properties: GeotriggersInfoProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
