package typings
package awsDashSdkLib.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeNamespaceRequest extends js.Object {
  /**
    * The name of the user's namespace. Set this to aws to get the public namespace.
    */
  var namespaceName: js.UndefOr[NamespaceName] = js.undefined
}

object DescribeNamespaceRequest {
  @scala.inline
  def apply(namespaceName: NamespaceName = null): DescribeNamespaceRequest = {
    val __obj = js.Dynamic.literal()
    if (namespaceName != null) __obj.updateDynamic("namespaceName")(namespaceName)
    __obj.asInstanceOf[DescribeNamespaceRequest]
  }
}

