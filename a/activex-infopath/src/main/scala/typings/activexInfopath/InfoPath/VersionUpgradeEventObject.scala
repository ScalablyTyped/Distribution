package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionUpgradeEventObject extends js.Object {
  val DocumentVersion: String
  @JSName("InfoPath.VersionUpgradeEventObject_typekey")
  var InfoPathDotVersionUpgradeEventObject_typekey: VersionUpgradeEventObject
  var ReturnStatus: Boolean
  val SolutionVersion: String
  val XDocument: _XDocument
}

object VersionUpgradeEventObject {
  @scala.inline
  def apply(
    DocumentVersion: String,
    InfoPathDotVersionUpgradeEventObject_typekey: VersionUpgradeEventObject,
    ReturnStatus: Boolean,
    SolutionVersion: String,
    XDocument: _XDocument
  ): VersionUpgradeEventObject = {
    val __obj = js.Dynamic.literal(DocumentVersion = DocumentVersion.asInstanceOf[js.Any], ReturnStatus = ReturnStatus.asInstanceOf[js.Any], SolutionVersion = SolutionVersion.asInstanceOf[js.Any], XDocument = XDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.VersionUpgradeEventObject_typekey")(InfoPathDotVersionUpgradeEventObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionUpgradeEventObject]
  }
}

