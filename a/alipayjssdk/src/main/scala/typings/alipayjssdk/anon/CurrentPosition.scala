package typings.alipayjssdk.anon

import typings.alipayjssdk.alipayjssdkInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentPosition extends StObject {
  
  /** 当前播放位置，单位秒 */
  var currentPosition: Double
  
  /** 缓冲百分比 */
  var downloadPercent: Double
  
  /** 音乐总时长，单位秒 */
  var duration: Double
  
  /** 音乐播放状态（2：没有音乐在播放，1：播放中，0：暂停中） */
  var status: typings.alipayjssdk.alipayjssdkInts.`0` | typings.alipayjssdk.alipayjssdkInts.`1` | `2`
  
  /** 音乐链接地址 */
  var url: String
}
object CurrentPosition {
  
  inline def apply(
    currentPosition: Double,
    downloadPercent: Double,
    duration: Double,
    status: typings.alipayjssdk.alipayjssdkInts.`0` | typings.alipayjssdk.alipayjssdkInts.`1` | `2`,
    url: String
  ): CurrentPosition = {
    val __obj = js.Dynamic.literal(currentPosition = currentPosition.asInstanceOf[js.Any], downloadPercent = downloadPercent.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentPosition]
  }
  
  extension [Self <: CurrentPosition](x: Self) {
    
    inline def setCurrentPosition(value: Double): Self = StObject.set(x, "currentPosition", value.asInstanceOf[js.Any])
    
    inline def setDownloadPercent(value: Double): Self = StObject.set(x, "downloadPercent", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: typings.alipayjssdk.alipayjssdkInts.`0` | typings.alipayjssdk.alipayjssdkInts.`1` | `2`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
