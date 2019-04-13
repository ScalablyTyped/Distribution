package typings
package awsDashSdkLib.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutCorsPolicyInput extends js.Object {
  /**
    * The name of the container that you want to assign the CORS policy to.
    */
  var ContainerName: awsDashSdkLib.clientsMediastoreMod.ContainerName
  /**
    * The CORS policy to apply to the container. 
    */
  var CorsPolicy: awsDashSdkLib.clientsMediastoreMod.CorsPolicy
}

object PutCorsPolicyInput {
  @scala.inline
  def apply(ContainerName: ContainerName, CorsPolicy: CorsPolicy): PutCorsPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName, CorsPolicy = CorsPolicy)
  
    __obj.asInstanceOf[PutCorsPolicyInput]
  }
}

