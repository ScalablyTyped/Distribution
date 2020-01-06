package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNamespaceResponse extends js.Object {
  /**
    * The ARN of the namespace.
    */
  var namespaceArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the namespace.
    */
  var namespaceName: js.UndefOr[NamespaceName] = js.native
  /**
    * The version of the user's namespace to describe.
    */
  var namespaceVersion: js.UndefOr[Version] = js.native
  /**
    * The name of the public namespace that the latest namespace version is tracking.
    */
  var trackingNamespaceName: js.UndefOr[NamespaceName] = js.native
  /**
    * The version of the public namespace that the latest version is tracking.
    */
  var trackingNamespaceVersion: js.UndefOr[Version] = js.native
}

object DescribeNamespaceResponse {
  @scala.inline
  def apply(
    namespaceArn: Arn = null,
    namespaceName: NamespaceName = null,
    namespaceVersion: Int | Double = null,
    trackingNamespaceName: NamespaceName = null,
    trackingNamespaceVersion: Int | Double = null
  ): DescribeNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    if (namespaceArn != null) __obj.updateDynamic("namespaceArn")(namespaceArn.asInstanceOf[js.Any])
    if (namespaceName != null) __obj.updateDynamic("namespaceName")(namespaceName.asInstanceOf[js.Any])
    if (namespaceVersion != null) __obj.updateDynamic("namespaceVersion")(namespaceVersion.asInstanceOf[js.Any])
    if (trackingNamespaceName != null) __obj.updateDynamic("trackingNamespaceName")(trackingNamespaceName.asInstanceOf[js.Any])
    if (trackingNamespaceVersion != null) __obj.updateDynamic("trackingNamespaceVersion")(trackingNamespaceVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNamespaceResponse]
  }
}

