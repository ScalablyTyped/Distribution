package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListArtifactsResult extends js.Object {
  /**
    *  A list of artifacts. 
    */
  var artifacts: Artifacts = js.native
  /**
    *  A pagination token. If a non-null pagination token is returned in a result, pass its value in another request to retrieve more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListArtifactsResult {
  @scala.inline
  def apply(artifacts: Artifacts): ListArtifactsResult = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListArtifactsResult]
  }
  @scala.inline
  implicit class ListArtifactsResultOps[Self <: ListArtifactsResult] (val x: Self) extends AnyVal {
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
    def setArtifactsVarargs(value: Artifact*): Self = this.set("artifacts", js.Array(value :_*))
    @scala.inline
    def setArtifacts(value: Artifacts): Self = this.set("artifacts", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

