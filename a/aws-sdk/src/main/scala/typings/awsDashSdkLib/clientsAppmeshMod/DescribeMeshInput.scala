package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMeshInput extends js.Object {
  /**
    * The name of the service mesh to describe.
    */
  var meshName: ResourceName
}

object DescribeMeshInput {
  @scala.inline
  def apply(meshName: ResourceName): DescribeMeshInput = {
    val __obj = js.Dynamic.literal(meshName = meshName)
  
    __obj.asInstanceOf[DescribeMeshInput]
  }
}

