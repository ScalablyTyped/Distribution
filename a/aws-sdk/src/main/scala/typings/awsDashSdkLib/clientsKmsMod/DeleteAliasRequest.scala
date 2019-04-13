package typings
package awsDashSdkLib.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAliasRequest extends js.Object {
  /**
    * The alias to be deleted. The name must start with the word "alias" followed by a forward slash (alias/). Aliases that begin with "alias/aws" are reserved.
    */
  var AliasName: AliasNameType
}

object DeleteAliasRequest {
  @scala.inline
  def apply(AliasName: AliasNameType): DeleteAliasRequest = {
    val __obj = js.Dynamic.literal(AliasName = AliasName)
  
    __obj.asInstanceOf[DeleteAliasRequest]
  }
}

