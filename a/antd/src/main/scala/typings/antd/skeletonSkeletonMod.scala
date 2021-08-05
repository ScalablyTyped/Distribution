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
    
    inline def apply(props: SkeletonProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("antd/lib/skeleton/Skeleton", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/skeleton/Skeleton", "default.Avatar")
    @js.native
    def Avatar: DefaultProps = js.native
    inline def Avatar_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Avatar")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/skeleton/Skeleton", "default.Button")
    @js.native
    def Button: Call = js.native
    inline def Button_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Button")(x.asInstanceOf[js.Any])
    
    inline def Image(props: SkeletonImageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Image")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("antd/lib/skeleton/Skeleton", "default.Input")
    @js.native
    def Input: CallDefaultProps = js.native
    inline def Input_=(x: CallDefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Input")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/skeleton/Skeleton", "default.defaultProps")
    @js.native
    def defaultProps: Avatar = js.native
    inline def defaultProps_=(x: Avatar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
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
    
    inline def apply(): SkeletonAvatarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonAvatarProps]
    }
    
    extension [Self <: SkeletonAvatarProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setShape(value: circle | square): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: large | small | default | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
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
    
    inline def apply(): SkeletonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonProps]
    }
    
    extension [Self <: SkeletonProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAvatar(value: SkeletonAvatarProps | Boolean): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setParagraph(value: SkeletonParagraphProps | Boolean): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
      
      inline def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setTitle(value: SkeletonTitleProps | Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
