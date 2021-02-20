package typings.antDesignPro

import typings.antd.gridColMod.ColProps
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object descriptionMod {
  
  @JSImport("ant-design-pro/lib/DescriptionList/Description", JSImport.Default)
  @js.native
  class default ()
    extends Component[DescriptionProps, js.Any, js.Any]
  
  type Description = Component[DescriptionProps, js.Any, js.Any]
  
  @js.native
  trait DescriptionProps extends ColProps {
    
    var column: js.UndefOr[Double] = js.native
    
    var key: js.UndefOr[String | Double] = js.native
    
    var term: js.UndefOr[ReactNode] = js.native
  }
  object DescriptionProps {
    
    @scala.inline
    def apply(): DescriptionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescriptionProps]
    }
    
    @scala.inline
    implicit class DescriptionPropsMutableBuilder[Self <: DescriptionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setTerm(value: ReactNode): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
    }
  }
}
