package typings.atlaskitPrimitives.anon

import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.div
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.ol
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.span
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.ul
import typings.atlaskitPrimitives.distTypesComponentsInlineMod.AlignBlock
import typings.atlaskitPrimitives.distTypesComponentsInlineMod.AlignInline
import typings.atlaskitPrimitives.distTypesComponentsInlineMod.Grow
import typings.atlaskitPrimitives.distTypesComponentsInlineMod.Spread
import typings.atlaskitPrimitives.distTypesXcssStyleMapsDotpartialMod.Space
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@atlaskit/primitives.@atlaskit/primitives/dist/types/components/inline.InlineProps<react.react.ElementType<any>>, 'as' | 'children' | 'testId' | 'alignInline' | 'alignBlock' | 'shouldWrap' | 'spread' | 'grow' | 'space' | 'rowSpace' | 'separator'> & react.react.RefAttributes<any> */
trait PickInlinePropsElementTyp extends StObject {
  
  var alignBlock: js.UndefOr[AlignBlock] = js.undefined
  
  var alignInline: js.UndefOr[AlignInline] = js.undefined
  
  var as: js.UndefOr[div | span | ul | ol] = js.undefined
  
  var children: ReactNode
  
  var grow: js.UndefOr[Grow] = js.undefined
  
  var key: js.UndefOr[Key | Null] = js.undefined
  
  /**
    * Allows getting a ref to the component instance.
    * Once the component unmounts, React will set `ref.current` to `null` (or call the ref with `null` if you passed a callback ref).
    * @see https://react.dev/learn/referencing-values-with-refs#refs-and-the-dom
    */
  var ref: js.UndefOr[Ref[Any]] = js.undefined
  
  var rowSpace: js.UndefOr[Space] = js.undefined
  
  var separator: js.UndefOr[String] = js.undefined
  
  var shouldWrap: js.UndefOr[Boolean] = js.undefined
  
  var space: js.UndefOr[Space] = js.undefined
  
  var spread: js.UndefOr[Spread] = js.undefined
  
  var testId: js.UndefOr[String] = js.undefined
}
object PickInlinePropsElementTyp {
  
  inline def apply(): PickInlinePropsElementTyp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickInlinePropsElementTyp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickInlinePropsElementTyp] (val x: Self) extends AnyVal {
    
    inline def setAlignBlock(value: AlignBlock): Self = StObject.set(x, "alignBlock", value.asInstanceOf[js.Any])
    
    inline def setAlignBlockUndefined: Self = StObject.set(x, "alignBlock", js.undefined)
    
    inline def setAlignInline(value: AlignInline): Self = StObject.set(x, "alignInline", value.asInstanceOf[js.Any])
    
    inline def setAlignInlineUndefined: Self = StObject.set(x, "alignInline", js.undefined)
    
    inline def setAs(value: div | span | ul | ol): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setGrow(value: Grow): Self = StObject.set(x, "grow", value.asInstanceOf[js.Any])
    
    inline def setGrowUndefined: Self = StObject.set(x, "grow", js.undefined)
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRowSpace(value: Space): Self = StObject.set(x, "rowSpace", value.asInstanceOf[js.Any])
    
    inline def setRowSpaceUndefined: Self = StObject.set(x, "rowSpace", js.undefined)
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setShouldWrap(value: Boolean): Self = StObject.set(x, "shouldWrap", value.asInstanceOf[js.Any])
    
    inline def setShouldWrapUndefined: Self = StObject.set(x, "shouldWrap", js.undefined)
    
    inline def setSpace(value: Space): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    inline def setSpread(value: Spread): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
    
    inline def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
    
    inline def setTestId(value: String): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
    
    inline def setTestIdUndefined: Self = StObject.set(x, "testId", js.undefined)
  }
}
