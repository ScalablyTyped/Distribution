package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteNamespaceResponse extends js.Object {
  /**
    * The ARN of the namespace to be deleted.
    */
  var namespaceArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of the namespace to be deleted.
    */
  var namespaceName: js.UndefOr[NamespaceName] = js.undefined
}

object DeleteNamespaceResponse {
  @scala.inline
  def apply(namespaceArn: Arn = null, namespaceName: NamespaceName = null): DeleteNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    if (namespaceArn != null) __obj.updateDynamic("namespaceArn")(namespaceArn)
    if (namespaceName != null) __obj.updateDynamic("namespaceName")(namespaceName)
    __obj.asInstanceOf[DeleteNamespaceResponse]
  }
}

