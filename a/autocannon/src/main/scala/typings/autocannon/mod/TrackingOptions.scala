package typings.autocannon.mod

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackingOptions extends js.Object {
  /**
    * The stream to output to.
    * @default process.stderr
    */
  var outputStream: js.UndefOr[WritableStream] = js.undefined
  /**
    * A `String` defining the format of the progress display output. Must be valid input for the [progress bar module](https://www.npmjs.com/package/progress).
    * @default 'running [:bar] :percent'
    */
  var progressBarString: js.UndefOr[String] = js.undefined
  /**
    * A truthy value to enable the rendering of the advanced latency table.
    * @default false
    */
  var renderLatencyTable: js.UndefOr[Boolean] = js.undefined
  /**
    * A truthy value to enable the rendering of the progress bar.
    * @default true
    */
  var renderProgressBar: js.UndefOr[Boolean] = js.undefined
  /**
    * A truthy value to enable the rendering of the results table.
    * @default true
    */
  var renderResultsTable: js.UndefOr[Boolean] = js.undefined
}

object TrackingOptions {
  @scala.inline
  def apply(
    outputStream: WritableStream = null,
    progressBarString: String = null,
    renderLatencyTable: js.UndefOr[Boolean] = js.undefined,
    renderProgressBar: js.UndefOr[Boolean] = js.undefined,
    renderResultsTable: js.UndefOr[Boolean] = js.undefined
  ): TrackingOptions = {
    val __obj = js.Dynamic.literal()
    if (outputStream != null) __obj.updateDynamic("outputStream")(outputStream.asInstanceOf[js.Any])
    if (progressBarString != null) __obj.updateDynamic("progressBarString")(progressBarString.asInstanceOf[js.Any])
    if (!js.isUndefined(renderLatencyTable)) __obj.updateDynamic("renderLatencyTable")(renderLatencyTable.asInstanceOf[js.Any])
    if (!js.isUndefined(renderProgressBar)) __obj.updateDynamic("renderProgressBar")(renderProgressBar.asInstanceOf[js.Any])
    if (!js.isUndefined(renderResultsTable)) __obj.updateDynamic("renderResultsTable")(renderResultsTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackingOptions]
  }
}

