package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerInfoObject extends StObject {
  
  @JSName("InfoPath.ServerInfoObject_typekey")
  var InfoPathDotServerInfoObject_typekey: ServerInfoObject = js.native
  
  val SharePointListUrl: String = js.native
  
  val SharePointServerRootUrl: String = js.native
  
  val SharePointSiteCollectionUrl: String = js.native
  
  val SharePointSiteUrl: String = js.native
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
  
  @scala.inline
  implicit class ServerInfoObjectMutableBuilder[Self <: ServerInfoObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoPathDotServerInfoObject_typekey(value: ServerInfoObject): Self = StObject.set(x, "InfoPath.ServerInfoObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharePointListUrl(value: String): Self = StObject.set(x, "SharePointListUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharePointServerRootUrl(value: String): Self = StObject.set(x, "SharePointServerRootUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharePointSiteCollectionUrl(value: String): Self = StObject.set(x, "SharePointSiteCollectionUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharePointSiteUrl(value: String): Self = StObject.set(x, "SharePointSiteUrl", value.asInstanceOf[js.Any])
  }
}
