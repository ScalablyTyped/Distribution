package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentationVersion extends js.Object {
  /**
    * The date when the API documentation snapshot is created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  /**
    * The description of the API documentation snapshot.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The version identifier of the API documentation snapshot.
    */
  var version: js.UndefOr[String] = js.native
}

object DocumentationVersion {
  @scala.inline
  def apply(): DocumentationVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentationVersion]
  }
  @scala.inline
  implicit class DocumentationVersionOps[Self <: DocumentationVersion] (val x: Self) extends AnyVal {
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
    def setCreatedDate(value: Timestamp): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

