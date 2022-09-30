package typings.aliApp.my

import typings.aliApp.aliAppInts.`0`
import typings.aliApp.aliAppInts.`1`
import typings.aliApp.aliAppInts.`2`
import typings.aliApp.aliAppInts.`3`
import typings.aliApp.aliAppInts.`4`
import typings.aliApp.anon.ApFilePaths
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompressImageOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 要压缩的图片地址数组
    */
  var apFilePaths: js.Array[String]
  
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
  var compressLevel: js.UndefOr[`0` | `1` | `2` | `3` | `4`] = js.undefined
  
  @JSName("success")
  var success_CompressImageOptions: js.UndefOr[js.Function1[/* res */ ApFilePaths, Unit]] = js.undefined
}
object CompressImageOptions {
  
  inline def apply(apFilePaths: js.Array[String]): CompressImageOptions = {
    val __obj = js.Dynamic.literal(apFilePaths = apFilePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressImageOptions]
  }
  
  extension [Self <: CompressImageOptions](x: Self) {
    
    inline def setApFilePaths(value: js.Array[String]): Self = StObject.set(x, "apFilePaths", value.asInstanceOf[js.Any])
    
    inline def setApFilePathsVarargs(value: String*): Self = StObject.set(x, "apFilePaths", js.Array(value*))
    
    inline def setCompressLevel(value: `0` | `1` | `2` | `3` | `4`): Self = StObject.set(x, "compressLevel", value.asInstanceOf[js.Any])
    
    inline def setCompressLevelUndefined: Self = StObject.set(x, "compressLevel", js.undefined)
    
    inline def setSuccess(value: /* res */ ApFilePaths => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
