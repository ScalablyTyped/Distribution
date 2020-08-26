package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyzedResource extends js.Object {
  /**
    * The actions that an external principal is granted permission to use by the policy that generated the finding.
    */
  var actions: js.UndefOr[ActionList] = js.native
  /**
    * The time at which the resource was analyzed.
    */
  var analyzedAt: Timestamp = js.native
  /**
    * The time at which the finding was created.
    */
  var createdAt: Timestamp = js.native
  /**
    * An error message.
    */
  var error: js.UndefOr[String] = js.native
  /**
    * Indicates whether the policy that generated the finding grants public access to the resource.
    */
  var isPublic: Boolean = js.native
  /**
    * The ARN of the resource that was analyzed.
    */
  var resourceArn: ResourceArn = js.native
  /**
    * The AWS account ID that owns the resource.
    */
  var resourceOwnerAccount: String = js.native
  /**
    * The type of the resource that was analyzed.
    */
  var resourceType: ResourceType = js.native
  /**
    * Indicates how the access that generated the finding is granted. This is populated for Amazon S3 bucket findings.
    */
  var sharedVia: js.UndefOr[SharedViaList] = js.native
  /**
    * The current status of the finding generated from the analyzed resource.
    */
  var status: js.UndefOr[FindingStatus] = js.native
  /**
    * The time at which the finding was updated.
    */
  var updatedAt: Timestamp = js.native
}

object AnalyzedResource {
  @scala.inline
  def apply(
    analyzedAt: Timestamp,
    createdAt: Timestamp,
    isPublic: Boolean,
    resourceArn: ResourceArn,
    resourceOwnerAccount: String,
    resourceType: ResourceType,
    updatedAt: Timestamp
  ): AnalyzedResource = {
    val __obj = js.Dynamic.literal(analyzedAt = analyzedAt.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], isPublic = isPublic.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], resourceOwnerAccount = resourceOwnerAccount.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzedResource]
  }
  @scala.inline
  implicit class AnalyzedResourceOps[Self <: AnalyzedResource] (val x: Self) extends AnyVal {
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
    def setAnalyzedAt(value: Timestamp): Self = this.set("analyzedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPublic(value: Boolean): Self = this.set("isPublic", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceOwnerAccount(value: String): Self = this.set("resourceOwnerAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionsVarargs(value: String*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: ActionList): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setSharedViaVarargs(value: String*): Self = this.set("sharedVia", js.Array(value :_*))
    @scala.inline
    def setSharedVia(value: SharedViaList): Self = this.set("sharedVia", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedVia: Self = this.set("sharedVia", js.undefined)
    @scala.inline
    def setStatus(value: FindingStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

