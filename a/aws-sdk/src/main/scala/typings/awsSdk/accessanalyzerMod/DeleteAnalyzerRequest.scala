package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAnalyzerRequest extends js.Object {
  /**
    * The name of the analyzer to delete.
    */
  var analyzerName: Name = js.native
  /**
    * A client token.
    */
  var clientToken: js.UndefOr[String] = js.native
}

object DeleteAnalyzerRequest {
  @scala.inline
  def apply(analyzerName: Name): DeleteAnalyzerRequest = {
    val __obj = js.Dynamic.literal(analyzerName = analyzerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnalyzerRequest]
  }
  @scala.inline
  implicit class DeleteAnalyzerRequestOps[Self <: DeleteAnalyzerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnalyzerName(value: Name): Self = this.set("analyzerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientToken(value: String): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
  }
  
}

