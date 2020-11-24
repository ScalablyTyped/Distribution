package typings.aliApp.my

import typings.aliApp.aliAppNumbers.`0`
import typings.aliApp.aliAppNumbers.`1`
import typings.aliApp.aliAppNumbers.`2`
import typings.aliApp.aliAppNumbers.`3`
import typings.aliApp.aliAppNumbers.`4`
import typings.aliApp.anon.ApFilePaths
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompressImageOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 要压缩的图片地址数组
    */
  var apFilePaths: js.Array[String] = js.native
  
  /**
    * 压缩级别，支持 0 ~ 4 的整数，默认 4。详见「compressLevel表 说明表」
    * compressLevel表
    * compressLevel | 说明
    * --------------|-----
    * 0 | 低质量
    * 1 | 中等质量
    * 2 | 高质量
    * 3 | 不压缩
    * 4 | 根据网络适应
    */
  var compressLevel: js.UndefOr[`0` | `1` | `2` | `3` | `4`] = js.native
  
  @JSName("success")
  var success_CompressImageOptions: js.UndefOr[js.Function1[/* res */ ApFilePaths, Unit]] = js.native
}
object CompressImageOptions {
  
  @scala.inline
  def apply(apFilePaths: js.Array[String]): CompressImageOptions = {
    val __obj = js.Dynamic.literal(apFilePaths = apFilePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressImageOptions]
  }
  
  @scala.inline
  implicit class CompressImageOptionsOps[Self <: CompressImageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApFilePathsVarargs(value: String*): Self = this.set("apFilePaths", js.Array(value :_*))
    
    @scala.inline
    def setApFilePaths(value: js.Array[String]): Self = this.set("apFilePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressLevel(value: `0` | `1` | `2` | `3` | `4`): Self = this.set("compressLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompressLevel: Self = this.set("compressLevel", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ ApFilePaths => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
