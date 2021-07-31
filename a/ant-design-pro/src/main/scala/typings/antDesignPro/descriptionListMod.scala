package typings.antDesignPro

import org.scalablytyped.runtime.Instantiable0
import typings.antDesignPro.antDesignProStrings.horizontal
import typings.antDesignPro.antDesignProStrings.large
import typings.antDesignPro.antDesignProStrings.small
import typings.antDesignPro.antDesignProStrings.vertical
import typings.antDesignPro.descriptionMod.DescriptionProps
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object descriptionListMod {
  
  @JSImport("ant-design-pro/lib/DescriptionList", JSImport.Default)
  @js.native
  class default ()
    extends Component[DescriptionListProps, js.Any, js.Any]
  /* static members */
  object default {
    
    @JSImport("ant-design-pro/lib/DescriptionList", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ant-design-pro/lib/DescriptionList", "default.Description")
    @js.native
    def Description: Instantiable0[typings.antDesignPro.descriptionMod.default] = js.native
    @scala.inline
    def Description_=(x: Instantiable0[typings.antDesignPro.descriptionMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Description")(x.asInstanceOf[js.Any])
  }
  
  type DescriptionList = Component[DescriptionListProps, js.Any, js.Any]
  
  trait DescriptionListProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var col: js.UndefOr[Double] = js.undefined
    
    var description: js.UndefOr[js.Array[DescriptionProps]] = js.undefined
    
    var gutter: js.UndefOr[Double] = js.undefined
    
    var layout: js.UndefOr[horizontal | vertical] = js.undefined
    
    var size: js.UndefOr[large | small] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object DescriptionListProps {
    
    @scala.inline
    def apply(): DescriptionListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescriptionListProps]
    }
    
    @scala.inline
    implicit class DescriptionListPropsMutableBuilder[Self <: DescriptionListProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColUndefined: Self = StObject.set(x, "col", js.undefined)
      
      @scala.inline
      def setDescription(value: js.Array[DescriptionProps]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDescriptionVarargs(value: DescriptionProps*): Self = StObject.set(x, "description", js.Array(value :_*))
      
      @scala.inline
      def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      @scala.inline
      def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setSize(value: large | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
