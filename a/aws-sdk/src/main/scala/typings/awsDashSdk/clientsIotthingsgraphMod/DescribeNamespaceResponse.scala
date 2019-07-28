package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeNamespaceResponse extends js.Object {
  /**
    * The ARN of the namespace.
    */
  var namespaceArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of the namespace.
    */
  var namespaceName: js.UndefOr[NamespaceName] = js.undefined
  /**
    * The version of the user's namespace to describe.
    */
  var namespaceVersion: js.UndefOr[Version] = js.undefined
  /**
    * The name of the public namespace that the latest namespace version is tracking.
    */
  var trackingNamespaceName: js.UndefOr[NamespaceName] = js.undefined
  /**
    * The version of the public namespace that the latest version is tracking.
    */
  var trackingNamespaceVersion: js.UndefOr[Version] = js.undefined
}

object DescribeNamespaceResponse {
  @scala.inline
  def apply(
    namespaceArn: Arn = null,
    namespaceName: NamespaceName = null,
    namespaceVersion: js.UndefOr[Version] = js.undefined,
    trackingNamespaceName: NamespaceName = null,
    trackingNamespaceVersion: js.UndefOr[Version] = js.undefined
  ): DescribeNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    if (namespaceArn != null) __obj.updateDynamic("namespaceArn")(namespaceArn)
    if (namespaceName != null) __obj.updateDynamic("namespaceName")(namespaceName)
    if (!js.isUndefined(namespaceVersion)) __obj.updateDynamic("namespaceVersion")(namespaceVersion)
    if (trackingNamespaceName != null) __obj.updateDynamic("trackingNamespaceName")(trackingNamespaceName)
    if (!js.isUndefined(trackingNamespaceVersion)) __obj.updateDynamic("trackingNamespaceVersion")(trackingNamespaceVersion)
    __obj.asInstanceOf[DescribeNamespaceResponse]
  }
}

