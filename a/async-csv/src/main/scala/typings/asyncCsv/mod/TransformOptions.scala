package typings.asyncCsv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformOptions extends js.Object {
  
  /**
    * In the absence of a consumer, like a `stream.Readable`, trigger the
    * consumption of the stream.
    */
  var consume: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of transformation callbacks to run in parallel; only apply
    * with asynchronous handlers; default to "100".
    */
  var parallel: js.UndefOr[Double] = js.native
  
  /**
    * Pass user defined parameters to the user handler as last argument.
    */
  var params: js.UndefOr[js.Any] = js.native
}
object TransformOptions {
  
  @scala.inline
  def apply(): TransformOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformOptions]
  }
  
  @scala.inline
  implicit class TransformOptionsOps[Self <: TransformOptions] (val x: Self) extends AnyVal {
    
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
    def setConsume(value: Boolean): Self = this.set("consume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsume: Self = this.set("consume", js.undefined)
    
    @scala.inline
    def setParallel(value: Double): Self = this.set("parallel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallel: Self = this.set("parallel", js.undefined)
    
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
}
