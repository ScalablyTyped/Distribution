package typings.antd

import typings.antd.anon.Content
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typographyUtilMod {
  
  @JSImport("antd/lib/typography/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    originEle: HTMLElement,
    option: Option,
    content: ReactNode,
    fixedContent: js.Array[ReactNode],
    ellipsisStr: String
  ): Content = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(originEle.asInstanceOf[js.Any], option.asInstanceOf[js.Any], content.asInstanceOf[js.Any], fixedContent.asInstanceOf[js.Any], ellipsisStr.asInstanceOf[js.Any])).asInstanceOf[Content]
  
  trait Option extends StObject {
    
    var rows: Double
    
    var suffix: js.UndefOr[String] = js.undefined
  }
  object Option {
    
    inline def apply(rows: Double): Option = {
      val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
}
