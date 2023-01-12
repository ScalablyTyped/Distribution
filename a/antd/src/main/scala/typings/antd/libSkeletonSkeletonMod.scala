package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.antdStrings.circle
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.antd.antdStrings.square
import typings.antd.libSkeletonAvatarMod.AvatarProps
import typings.antd.libSkeletonButtonMod.SkeletonButtonProps
import typings.antd.libSkeletonImageMod.SkeletonImageProps
import typings.antd.libSkeletonInputMod.SkeletonInputProps
import typings.antd.libSkeletonNodeMod.SkeletonNodeProps
import typings.antd.libSkeletonParagraphMod.SkeletonParagraphProps
import typings.antd.libSkeletonTitleMod.SkeletonTitleProps
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSkeletonSkeletonMod extends Shortcut {
  
  @JSImport("antd/lib/skeleton/Skeleton", JSImport.Default)
  @js.native
  val default: FC[SkeletonProps] & CompoundedComponent = js.native
  
  trait CompoundedComponent extends StObject {
    
    var Avatar: FC[AvatarProps]
    
    var Button: FC[SkeletonButtonProps]
    
    var Image: FC[SkeletonImageProps]
    
    var Input: FC[SkeletonInputProps]
    
    var Node: FC[SkeletonNodeProps]
  }
  object CompoundedComponent {
    
    inline def apply(
      Avatar: FC[AvatarProps],
      Button: FC[SkeletonButtonProps],
      Image: FC[SkeletonImageProps],
      Input: FC[SkeletonInputProps],
      Node: FC[SkeletonNodeProps]
    ): CompoundedComponent = {
      val __obj = js.Dynamic.literal(Avatar = Avatar.asInstanceOf[js.Any], Button = Button.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], Input = Input.asInstanceOf[js.Any], Node = Node.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompoundedComponent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompoundedComponent] (val x: Self) extends AnyVal {
      
      inline def setAvatar(value: FC[AvatarProps]): Self = StObject.set(x, "Avatar", value.asInstanceOf[js.Any])
      
      inline def setButton(value: FC[SkeletonButtonProps]): Self = StObject.set(x, "Button", value.asInstanceOf[js.Any])
      
      inline def setImage(value: FC[SkeletonImageProps]): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
      
      inline def setInput(value: FC[SkeletonInputProps]): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
      
      inline def setNode(value: FC[SkeletonNodeProps]): Self = StObject.set(x, "Node", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Omit<antd.antd/lib/skeleton/Avatar.AvatarProps, 'active'> */
  trait SkeletonAvatarProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var shape: js.UndefOr[circle | square] = js.undefined
    
    var size: js.UndefOr[large | small | typings.antd.antdStrings.default | Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object SkeletonAvatarProps {
    
    inline def apply(): SkeletonAvatarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonAvatarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SkeletonAvatarProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setShape(value: circle | square): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: large | small | typings.antd.antdStrings.default | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
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
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[SkeletonTitleProps | Boolean] = js.undefined
  }
  object SkeletonProps {
    
    inline def apply(): SkeletonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SkeletonProps] (val x: Self) extends AnyVal {
      
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
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: SkeletonTitleProps | Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = FC[SkeletonProps] & CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `libSkeletonSkeletonMod.foo` */
  override def _to: FC[SkeletonProps] & CompoundedComponent = default
}
