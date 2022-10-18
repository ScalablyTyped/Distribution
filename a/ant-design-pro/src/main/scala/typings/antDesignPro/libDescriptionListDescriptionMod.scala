package typings.antDesignPro

import typings.antd.libGridColMod.ColProps
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDescriptionListDescriptionMod {
  
  @JSImport("ant-design-pro/lib/DescriptionList/Description", JSImport.Default)
  @js.native
  open class default () extends Component[DescriptionProps, Any, Any]
  
  type Description = Component[DescriptionProps, Any, Any]
  
  trait DescriptionProps
    extends StObject
       with ColProps {
    
    var column: js.UndefOr[Double] = js.undefined
    
    var key: js.UndefOr[String | Double] = js.undefined
    
    var term: js.UndefOr[ReactNode] = js.undefined
  }
  object DescriptionProps {
    
    inline def apply(): DescriptionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescriptionProps]
    }
    
    extension [Self <: DescriptionProps](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setTerm(value: ReactNode): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
      
      inline def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
    }
  }
}
