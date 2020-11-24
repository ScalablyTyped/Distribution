package typings.autocannon.mod

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackingOptions extends js.Object {
  
  /**
    * The stream to output to.
    * @default process.stderr
    */
  var outputStream: js.UndefOr[WritableStream] = js.native
  
  /**
    * A `String` defining the format of the progress display output. Must be valid input for the [progress bar module](https://www.npmjs.com/package/progress).
    * @default 'running [:bar] :percent'
    */
  var progressBarString: js.UndefOr[String] = js.native
  
  /**
    * A truthy value to enable the rendering of the advanced latency table.
    * @default false
    */
  var renderLatencyTable: js.UndefOr[Boolean] = js.native
  
  /**
    * A truthy value to enable the rendering of the progress bar.
    * @default true
    */
  var renderProgressBar: js.UndefOr[Boolean] = js.native
  
  /**
    * A truthy value to enable the rendering of the results table.
    * @default true
    */
  var renderResultsTable: js.UndefOr[Boolean] = js.native
}
object TrackingOptions {
  
  @scala.inline
  def apply(): TrackingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackingOptions]
  }
  
  @scala.inline
  implicit class TrackingOptionsOps[Self <: TrackingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOutputStream(value: WritableStream): Self = this.set("outputStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputStream: Self = this.set("outputStream", js.undefined)
    
    @scala.inline
    def setProgressBarString(value: String): Self = this.set("progressBarString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressBarString: Self = this.set("progressBarString", js.undefined)
    
    @scala.inline
    def setRenderLatencyTable(value: Boolean): Self = this.set("renderLatencyTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderLatencyTable: Self = this.set("renderLatencyTable", js.undefined)
    
    @scala.inline
    def setRenderProgressBar(value: Boolean): Self = this.set("renderProgressBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderProgressBar: Self = this.set("renderProgressBar", js.undefined)
    
    @scala.inline
    def setRenderResultsTable(value: Boolean): Self = this.set("renderResultsTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderResultsTable: Self = this.set("renderResultsTable", js.undefined)
  }
}
