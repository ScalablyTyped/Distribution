package typings.antDesignIconsVue

import typings.vue.optionsMod.Component
import typings.vue.optionsMod.DefaultComputed
import typings.vue.optionsMod.DefaultData
import typings.vue.optionsMod.DefaultMethods
import typings.vue.optionsMod.DefaultProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod {
  
  object default {
    
    @JSImport("@ant-design/icons-vue/lib/components/Icon", JSImport.Default)
    @js.native
    def apply(
      props: IconComponentProps,
      context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SetupContext */ js.Any
    ): js.Any = js.native
    @JSImport("@ant-design/icons-vue/lib/components/Icon", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/icons-vue/lib/components/Icon", "default.inheritAttrs")
    @js.native
    def inheritAttrs: Boolean = js.native
    @scala.inline
    def inheritAttrs_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inheritAttrs")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CustomIconComponentProps extends StObject {
    
    var fill: String = js.native
    
    var height: String | Double = js.native
    
    var viewBox: js.UndefOr[String] = js.native
    
    var width: String | Double = js.native
  }
  object CustomIconComponentProps {
    
    @scala.inline
    def apply(fill: String, height: String | Double, width: String | Double): CustomIconComponentProps = {
      val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomIconComponentProps]
    }
    
    @scala.inline
    implicit class CustomIconComponentPropsMutableBuilder[Self <: CustomIconComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HTMLAttributes * / any */ @js.native
  trait IconBaseProps extends StObject {
    
    var rotate: js.UndefOr[Double] = js.native
    
    var spin: js.UndefOr[Boolean] = js.native
  }
  object IconBaseProps {
    
    @scala.inline
    def apply(): IconBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconBaseProps]
    }
    
    @scala.inline
    implicit class IconBasePropsMutableBuilder[Self <: IconBaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setSpin(value: Boolean): Self = StObject.set(x, "spin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinUndefined: Self = StObject.set(x, "spin", js.undefined)
    }
  }
  
  @js.native
  trait IconComponentProps extends IconBaseProps {
    
    var ariaLabel: js.UndefOr[String] = js.native
    
    var component: js.UndefOr[
        Component[
          DefaultData[scala.Nothing], 
          DefaultMethods[scala.Nothing], 
          DefaultComputed, 
          DefaultProps
        ]
      ] = js.native
    
    var viewBox: js.UndefOr[String] = js.native
  }
  object IconComponentProps {
    
    @scala.inline
    def apply(): IconComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconComponentProps]
    }
    
    @scala.inline
    implicit class IconComponentPropsMutableBuilder[Self <: IconComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setComponent(
        value: Component[
              DefaultData[scala.Nothing], 
              DefaultMethods[scala.Nothing], 
              DefaultComputed, 
              DefaultProps
            ]
      ): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    }
  }
}
