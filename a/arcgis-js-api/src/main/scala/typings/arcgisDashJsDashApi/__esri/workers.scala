package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This module is a utility framework that simplifies the use of [Web Workers](https://developer.mozilla.org/en-US/docs/Web/API/Web_Workers_API/Using_web_workers) in the ArcGIS API for JavaScript.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers.html)
  */
@js.native
trait workers extends js.Object {
  /**
    * Opens a connection to workers and loads a script with the workers framework.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers.html#open)
    *
    * @param modulePath A fully qualified URL to a script to execute with the workers framework.
    * @param options Worker options. See properties below for object specifications.
    * @param options.client The objects defining the API accessible from the module.
    * @param options.strategy Indicates how to load the module. See the table below for a list of possible values.
    * @param options.signal
    * [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) allows for cancelable asynchronous job. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * Possible Value | Description
    * ---------------|------------
    * distributed | The module is loaded in each available worker. Each call to [Connection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#invoke) will be targeting an available worker. Use this strategy if the module doesn't maintain information between invocations (stateless).
    * dedicated | The module is loaded in one worker. Each call to [Connection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#invoke) will be targeting a same worker. Use this strategy if the module maintains information from previous invocations or communication between main and worker threads needs to be stateful.
    * local | The module is loaded in the main thread. Use this strategy if when using the worker framework API while disabling the use of workers.
    *
    */
  def open(modulePath: String): js.Promise[Connection] = js.native
  def open(modulePath: String, options: workersOpenOptions): js.Promise[Connection] = js.native
}

@JSGlobal("__esri.workers")
@js.native
object workers extends TopLevel[workers]

