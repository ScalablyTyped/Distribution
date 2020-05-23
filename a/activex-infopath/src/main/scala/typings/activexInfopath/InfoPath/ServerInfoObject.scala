package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerInfoObject extends js.Object {
  @JSName("InfoPath.ServerInfoObject_typekey")
  var InfoPathDotServerInfoObject_typekey: ServerInfoObject
  val SharePointListUrl: String
  val SharePointServerRootUrl: String
  val SharePointSiteCollectionUrl: String
  val SharePointSiteUrl: String
}

object ServerInfoObject {
  @scala.inline
  def apply(
    InfoPathDotServerInfoObject_typekey: ServerInfoObject,
    SharePointListUrl: String,
    SharePointServerRootUrl: String,
    SharePointSiteCollectionUrl: String,
    SharePointSiteUrl: String
  ): ServerInfoObject = {
    val __obj = js.Dynamic.literal(SharePointListUrl = SharePointListUrl.asInstanceOf[js.Any], SharePointServerRootUrl = SharePointServerRootUrl.asInstanceOf[js.Any], SharePointSiteCollectionUrl = SharePointSiteCollectionUrl.asInstanceOf[js.Any], SharePointSiteUrl = SharePointSiteUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.ServerInfoObject_typekey")(InfoPathDotServerInfoObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerInfoObject]
  }
}

