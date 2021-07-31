package typings.antd

import typings.antd.anon.Avatar
import typings.antd.anon.Call
import typings.antd.anon.CallDefaultProps
import typings.antd.anon.DefaultProps
import typings.antd.antdStrings.circle
import typings.antd.antdStrings.default
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.antd.antdStrings.square
import typings.antd.paragraphMod.SkeletonParagraphProps
import typings.antd.skeletonImageMod.SkeletonImageProps
import typings.antd.titleMod.SkeletonTitleProps
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonSkeletonMod {
  
  object default {
    
    @scala.inline
    def apply(props: SkeletonProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("antd/lib/skeleton/Skeleton", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/skeleton/Skeleton", "default.Avatar")
    @js.native
    def Avatar: DefaultProps = js.native
    @scala.inline
    def Avatar_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Avatar")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/skeleton/Skeleton", "default.Button")
    @js.native
    def Button: Call = js.native
    @scala.inline
    def Button_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Button")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Image(props: SkeletonImageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Image")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("antd/lib/skeleton/Skeleton", "default.Input")
    @js.native
    def Input: CallDefaultProps = js.native
    @scala.inline
    def Input_=(x: CallDefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Input")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/skeleton/Skeleton", "default.defaultProps")
    @js.native
    def defaultProps: Avatar = js.native
    @scala.inline
    def defaultProps_=(x: Avatar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined parent std.Omit<antd.antd/lib/skeleton/Avatar.AvatarProps, 'active'> */
  trait SkeletonAvatarProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var shape: js.UndefOr[circle | square] = js.undefined
    
    var size: js.UndefOr[large | small | default | Double] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object SkeletonAvatarProps {
    
    @scala.inline
    def apply(): SkeletonAvatarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonAvatarProps]
    }
    
    @scala.inline
    implicit class SkeletonAvatarPropsMutableBuilder[Self <: SkeletonAvatarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setShape(value: circle | square): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: large | small | default | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait SkeletonProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var avatar: js.UndefOr[SkeletonAvatarProps | Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var paragraph: js.UndefOr[SkeletonParagraphProps | Boolean] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var round: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[SkeletonTitleProps | Boolean] = js.undefined
  }
  object SkeletonProps {
    
    @scala.inline
    def apply(): SkeletonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonProps]
    }
    
    @scala.inline
    implicit class SkeletonPropsMutableBuilder[Self <: SkeletonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAvatar(value: SkeletonAvatarProps | Boolean): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setParagraph(value: SkeletonParagraphProps | Boolean): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      @scala.inline
      def setTitle(value: SkeletonTitleProps | Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
