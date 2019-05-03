package typings
package awsDashSdkLib.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAliasRequest extends js.Object {
  /**
    * The alias to be deleted. The alias name must begin with alias/ followed by the alias name, such as alias/ExampleAlias.
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

