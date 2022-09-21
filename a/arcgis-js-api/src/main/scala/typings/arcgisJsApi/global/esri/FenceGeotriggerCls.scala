package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.FenceGeotriggerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.FenceGeotrigger")
@js.native
/**
  * A condition which monitors the dynamic elements of the geotrigger feed for enter/exit against the fences defined by the Fence Parameters.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-FenceGeotrigger.html)
  */
open class FenceGeotriggerCls ()
  extends StObject
     with typings.arcgisJsApi.esri.FenceGeotrigger {
  def this(properties: FenceGeotriggerProperties) = this()
}
