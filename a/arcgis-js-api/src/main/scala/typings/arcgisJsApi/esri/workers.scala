package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This module is a utility framework that simplifies the use of [Web Workers](https://developer.mozilla.org/en-US/docs/Web/API/Web_Workers_API/Using_web_workers) in the ArcGIS Maps SDK for JavaScript.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers.html)
  */
@js.native
trait workers extends StObject {
  
  /**
    * Opens a connection to workers and loads a script with the workers framework.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers.html#open)
    */
  def open(modulePath: String): js.Promise[Connection] = js.native
  def open(modulePath: String, options: workersOpenOptions): js.Promise[Connection] = js.native
}
