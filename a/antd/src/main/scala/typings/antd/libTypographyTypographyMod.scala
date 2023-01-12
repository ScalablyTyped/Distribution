package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libConfigProviderContextMod.DirectionType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypographyTypographyMod extends Shortcut {
  
  @JSImport("antd/lib/typography/Typography", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[
    (InternalTypographyProps[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typings.antd.antdStrings.a, typings.antd.antdStrings.abbr, typings.antd.antdStrings.address */ Any
    ]) & RefAttributes[HTMLElement]
  ] = js.native
  
  trait InternalTypographyProps[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typings.antd.antdStrings.a, typings.antd.antdStrings.abbr, typings.antd.antdStrings.address */ Any */]
    extends StObject
       with TypographyProps[C] {
    
    /** @deprecated Use `ref` directly if using React 16 */
    var setContentRef: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  }
  object InternalTypographyProps {
    
    inline def apply[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typings.antd.antdStrings.a, typings.antd.antdStrings.abbr, typings.antd.antdStrings.address */ Any */](): InternalTypographyProps[C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternalTypographyProps[C]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalTypographyProps[?], C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typings.antd.antdStrings.a, typings.antd.antdStrings.abbr, typings.antd.antdStrings.address */ Any */] (val x: Self & InternalTypographyProps[C]) extends AnyVal {
      
      inline def setSetContentRef(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "setContentRef", js.Any.fromFunction1(value))
      
      inline def setSetContentRefUndefined: Self = StObject.set(x, "setContentRef", js.undefined)
    }
  }
  
  trait TypographyProps[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typings.antd.antdStrings.a, typings.antd.antdStrings.abbr, typings.antd.antdStrings.address */ Any */]
    extends StObject
       with HTMLAttributes[HTMLElement] {
    
    var direction: js.UndefOr[DirectionType] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object TypographyProps {
    
    inline def apply[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typings.antd.antdStrings.a, typings.antd.antdStrings.abbr, typings.antd.antdStrings.address */ Any */](): TypographyProps[C] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypographyProps[C]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypographyProps[?], C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typings.antd.antdStrings.a, typings.antd.antdStrings.abbr, typings.antd.antdStrings.address */ Any */] (val x: Self & TypographyProps[C]) extends AnyVal {
      
      inline def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[
    (InternalTypographyProps[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typings.antd.antdStrings.a, typings.antd.antdStrings.abbr, typings.antd.antdStrings.address */ Any
    ]) & RefAttributes[HTMLElement]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `libTypographyTypographyMod.foo` */
  override def _to: ForwardRefExoticComponent[
    (InternalTypographyProps[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typings.antd.antdStrings.a, typings.antd.antdStrings.abbr, typings.antd.antdStrings.address */ Any
    ]) & RefAttributes[HTMLElement]
  ] = default
}
