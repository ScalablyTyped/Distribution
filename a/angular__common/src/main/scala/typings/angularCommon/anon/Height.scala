package typings.angularCommon.anon

import typings.angularCommon.angularCommonStrings.height
import typings.angularCommon.angularCommonStrings.loading
import typings.angularCommon.angularCommonStrings.ngSrc
import typings.angularCommon.angularCommonStrings.ngSrcset
import typings.angularCommon.angularCommonStrings.priority
import typings.angularCommon.angularCommonStrings.rawSrc
import typings.angularCommon.angularCommonStrings.src
import typings.angularCommon.angularCommonStrings.srcset
import typings.angularCommon.angularCommonStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height extends StObject {
  
  var height: typings.angularCommon.angularCommonStrings.height
  
  var loading: typings.angularCommon.angularCommonStrings.loading
  
  var ngSrc: typings.angularCommon.angularCommonStrings.ngSrc
  
  var ngSrcset: typings.angularCommon.angularCommonStrings.ngSrcset
  
  var priority: typings.angularCommon.angularCommonStrings.priority
  
  var rawSrc: typings.angularCommon.angularCommonStrings.rawSrc
  
  var src: typings.angularCommon.angularCommonStrings.src
  
  var srcset: typings.angularCommon.angularCommonStrings.srcset
  
  var width: typings.angularCommon.angularCommonStrings.width
}
object Height {
  
  inline def apply(): Height = {
    val __obj = js.Dynamic.literal(height = "height", loading = "loading", ngSrc = "ngSrc", ngSrcset = "ngSrcset", priority = "priority", rawSrc = "rawSrc", src = "src", srcset = "srcset", width = "width")
    __obj.asInstanceOf[Height]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: height): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLoading(value: loading): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setNgSrc(value: ngSrc): Self = StObject.set(x, "ngSrc", value.asInstanceOf[js.Any])
    
    inline def setNgSrcset(value: ngSrcset): Self = StObject.set(x, "ngSrcset", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: priority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setRawSrc(value: rawSrc): Self = StObject.set(x, "rawSrc", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: src): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcset(value: srcset): Self = StObject.set(x, "srcset", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: width): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
