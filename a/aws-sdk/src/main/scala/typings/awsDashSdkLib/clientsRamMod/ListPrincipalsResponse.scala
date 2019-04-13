package typings
package awsDashSdkLib.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPrincipalsResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * The principals.
    */
  var principals: js.UndefOr[PrincipalList] = js.undefined
}

object ListPrincipalsResponse {
  @scala.inline
  def apply(nextToken: String = null, principals: PrincipalList = null): ListPrincipalsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (principals != null) __obj.updateDynamic("principals")(principals)
    __obj.asInstanceOf[ListPrincipalsResponse]
  }
}

