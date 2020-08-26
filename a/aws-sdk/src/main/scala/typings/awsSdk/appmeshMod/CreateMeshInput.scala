package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMeshInput extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
  request. Up to 36 letters, numbers, hyphens, and underscores are allowed.
    */
  var clientToken: js.UndefOr[String] = js.native
  /**
    * The name to use for the service mesh.
    */
  var meshName: ResourceName = js.native
  /**
    * The service mesh specification to apply.
    */
  var spec: js.UndefOr[MeshSpec] = js.native
  /**
    * Optional metadata that you can apply to the service mesh to assist with categorization
    and organization. Each tag consists of a key and an optional value, both of which you
    define. Tag keys can have a maximum character length of 128 characters, and tag values can have
    a maximum length of 256 characters.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateMeshInput {
  @scala.inline
  def apply(meshName: ResourceName): CreateMeshInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMeshInput]
  }
  @scala.inline
  implicit class CreateMeshInputOps[Self <: CreateMeshInput] (val x: Self) extends AnyVal {
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
    def setMeshName(value: ResourceName): Self = this.set("meshName", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientToken(value: String): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
    @scala.inline
    def setSpec(value: MeshSpec): Self = this.set("spec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpec: Self = this.set("spec", js.undefined)
    @scala.inline
    def setTagsVarargs(value: TagRef*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

