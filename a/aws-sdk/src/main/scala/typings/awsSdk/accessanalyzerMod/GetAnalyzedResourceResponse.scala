package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAnalyzedResourceResponse extends js.Object {
  /**
    * An AnalyedResource object that contains information that Access Analyzer found when it analyzed the resource.
    */
  var resource: js.UndefOr[AnalyzedResource] = js.native
}

object GetAnalyzedResourceResponse {
  @scala.inline
  def apply(): GetAnalyzedResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAnalyzedResourceResponse]
  }
  @scala.inline
  implicit class GetAnalyzedResourceResponseOps[Self <: GetAnalyzedResourceResponse] (val x: Self) extends AnyVal {
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
    def setResource(value: AnalyzedResource): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
  
}

