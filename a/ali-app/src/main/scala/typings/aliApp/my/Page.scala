package typings.aliApp.my

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Page
  extends Component
     with /* key */ StringDictionary[js.Any] {
  
  /**
    * 强制更新
    */
  def forceUpdate(): Unit = js.native
  
  /**
    * 将页面滚动到目标位置。
    *
    * scrollTop 滚动到页面的目标位置（单位px）
    * [duration] 滚动动画的时长，默认300ms，单位 ms
    */
  def pageScrollTo(): Unit = js.native
  def pageScrollTo(option: PageScrollToOptions): Unit = js.native
  
  /**
    * 字段可以获取到当前页面的路径。
    */
  def route(): Unit = js.native
  
  /**
    * 更新
    */
  def update(): Unit = js.native
}
