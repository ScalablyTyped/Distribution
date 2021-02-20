package typings.aliApp.my

import typings.aliApp.aliAppStrings.md5
import typings.aliApp.aliAppStrings.sha1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFileInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 文件路径 */
  var apFilePath: String = js.native
  
  /** 摘要算法，支持md5和sha1，默认为md5 */
  var digestAlgorithm: js.UndefOr[md5 | sha1] = js.native
  
  @JSName("success")
  var success_GetFileInfoOptions: js.UndefOr[js.Function1[/* options */ GetFileInfoSuccess, Unit]] = js.native
}
object GetFileInfoOptions {
  
  @scala.inline
  def apply(apFilePath: String): GetFileInfoOptions = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileInfoOptions]
  }
  
  @scala.inline
  implicit class GetFileInfoOptionsMutableBuilder[Self <: GetFileInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApFilePath(value: String): Self = StObject.set(x, "apFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestAlgorithm(value: md5 | sha1): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestAlgorithmUndefined: Self = StObject.set(x, "digestAlgorithm", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* options */ GetFileInfoSuccess => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
