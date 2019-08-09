package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataLakePrincipal extends js.Object {
  /**
    * An identifier for the AWS Lake Formation principal.
    */
  var DataLakePrincipalIdentifier: js.UndefOr[DataLakePrincipalString] = js.undefined
}

object DataLakePrincipal {
  @scala.inline
  def apply(DataLakePrincipalIdentifier: DataLakePrincipalString = null): DataLakePrincipal = {
    val __obj = js.Dynamic.literal()
    if (DataLakePrincipalIdentifier != null) __obj.updateDynamic("DataLakePrincipalIdentifier")(DataLakePrincipalIdentifier)
    __obj.asInstanceOf[DataLakePrincipal]
  }
}

