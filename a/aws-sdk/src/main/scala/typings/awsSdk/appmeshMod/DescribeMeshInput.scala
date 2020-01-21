package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMeshInput extends js.Object {
  /**
    * The name of the service mesh to describe.
    */
  var meshName: ResourceName = js.native
}

object DescribeMeshInput {
  @scala.inline
  def apply(meshName: ResourceName): DescribeMeshInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeMeshInput]
  }
}

