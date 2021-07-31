package typings.antDesignPro

import typings.antDesignPro.antDesignProStrings.error
import typings.antDesignPro.antDesignProStrings.success
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resultMod {
  
  @JSImport("ant-design-pro/lib/Result", JSImport.Default)
  @js.native
  class default ()
    extends Component[ResultProps, js.Any, js.Any]
  
  type Result = Component[ResultProps, js.Any, js.Any]
  
  trait ResultProps extends StObject {
    
    var actions: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[ReactNode] = js.undefined
    
    var extra: js.UndefOr[ReactNode] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    var `type`: success | error
  }
  object ResultProps {
    
    @scala.inline
    def apply(`type`: success | error): ResultProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultProps]
    }
    
    @scala.inline
    implicit class ResultPropsMutableBuilder[Self <: ResultProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: ReactNode): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDescription(value: ReactNode): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: success | error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
