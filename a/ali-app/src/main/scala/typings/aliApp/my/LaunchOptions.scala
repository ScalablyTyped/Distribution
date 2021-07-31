package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchOptions extends StObject {
  
  /**
    * 打开小程序的路径
    */
  var path: String
  
  /**
    * 打开小程序的query
    */
  var query: js.Object
  
  /**
    * 当场景为由从另一个小程序或公众号或App打开时，返回此字段
    */
  var referrerInfo: js.Object
  
  /**
    * 来源小程序或公众号或App的 appId，详见下方说明
    */
  @JSName("referrerInfo.appId")
  var referrerInfoDotappId: String
  
  /**
    * 来源小程序传过来的数据，scene=1037或1038时支持
    */
  @JSName("referrerInfo.extraData")
  var referrerInfoDotextraData: js.Object
  
  /**
    * 打开小程序的[场景值]
    */
  var scene: Double
  
  /**
    * shareTicket，详见 获取更多[转发信息]
    */
  var shareTicket: String
}
object LaunchOptions {
  
  @scala.inline
  def apply(
    path: String,
    query: js.Object,
    referrerInfo: js.Object,
    referrerInfoDotappId: String,
    referrerInfoDotextraData: js.Object,
    scene: Double,
    shareTicket: String
  ): LaunchOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], referrerInfo = referrerInfo.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], shareTicket = shareTicket.asInstanceOf[js.Any])
    __obj.updateDynamic("referrerInfo.appId")(referrerInfoDotappId.asInstanceOf[js.Any])
    __obj.updateDynamic("referrerInfo.extraData")(referrerInfoDotextraData.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchOptions]
  }
  
  @scala.inline
  implicit class LaunchOptionsMutableBuilder[Self <: LaunchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerInfo(value: js.Object): Self = StObject.set(x, "referrerInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerInfoDotappId(value: String): Self = StObject.set(x, "referrerInfo.appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerInfoDotextraData(value: js.Object): Self = StObject.set(x, "referrerInfo.extraData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScene(value: Double): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareTicket(value: String): Self = StObject.set(x, "shareTicket", value.asInstanceOf[js.Any])
  }
}
