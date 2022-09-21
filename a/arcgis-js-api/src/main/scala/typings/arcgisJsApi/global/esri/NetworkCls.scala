package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.NetworkProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.Network")
@js.native
/**
  * Class defining high level properties that describes utility networks and trace networks.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html)
  */
open class NetworkCls ()
  extends StObject
     with typings.arcgisJsApi.esri.Network {
  def this(properties: NetworkProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
