package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMeshesOutput extends js.Object {
  /**
    * The list of existing service meshes.
    */
  var meshes: MeshList = js.native
  /**
    * The nextToken value to include in a future ListMeshes request.
    When the results of a ListMeshes request exceed limit, you can
    use this value to retrieve the next page of results. This value is null when
    there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListMeshesOutput {
  @scala.inline
  def apply(meshes: MeshList, nextToken: String = null): ListMeshesOutput = {
    val __obj = js.Dynamic.literal(meshes = meshes.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMeshesOutput]
  }
}

