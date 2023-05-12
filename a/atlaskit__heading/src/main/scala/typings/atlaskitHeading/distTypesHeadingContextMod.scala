package typings.atlaskitHeading

import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHeadingContextMod {
  
  @JSImport("@atlaskit/heading/dist/types/heading-context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * __Heading context__
    *
    * The HeadingContext
    *
    * @example
    * ```tsx
    * // Will correctly infer the heading level
    * <HeadingContext value={1}>
    *  <Heading>H1</Heading>
    *  <HeadingContext>
    *    <Heading>H2</Heading>
    *  </HeadingContext>
    * </HeadingContext>
    * ```
    */
  @JSImport("@atlaskit/heading/dist/types/heading-context", JSImport.Default)
  @js.native
  val default: FC[HeadingContextProps] = js.native
  
  inline def useHeadingElement(): HeadingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("useHeadingElement")().asInstanceOf[HeadingElement]
  
  trait HeadingContextProps extends StObject {
    
    var children: ReactNode
    
    /**
      * Optional - only apply this value if the intent is to reset the heading context outside the normal content flow, for example inside a `section`.
      */
    var value: js.UndefOr[HeadingElement] = js.undefined
  }
  object HeadingContextProps {
    
    inline def apply(): HeadingContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeadingContextProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeadingContextProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setValue(value: HeadingElement): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atlaskitHeading.atlaskitHeadingInts.`1`
    - typings.atlaskitHeading.atlaskitHeadingInts.`2`
    - typings.atlaskitHeading.atlaskitHeadingInts.`3`
    - typings.atlaskitHeading.atlaskitHeadingInts.`4`
    - typings.atlaskitHeading.atlaskitHeadingInts.`5`
    - typings.atlaskitHeading.atlaskitHeadingInts.`6`
  */
  trait HeadingElement extends StObject
  object HeadingElement {
    
    inline def `1`: typings.atlaskitHeading.atlaskitHeadingInts.`1` = 1.asInstanceOf[typings.atlaskitHeading.atlaskitHeadingInts.`1`]
    
    inline def `2`: typings.atlaskitHeading.atlaskitHeadingInts.`2` = 2.asInstanceOf[typings.atlaskitHeading.atlaskitHeadingInts.`2`]
    
    inline def `3`: typings.atlaskitHeading.atlaskitHeadingInts.`3` = 3.asInstanceOf[typings.atlaskitHeading.atlaskitHeadingInts.`3`]
    
    inline def `4`: typings.atlaskitHeading.atlaskitHeadingInts.`4` = 4.asInstanceOf[typings.atlaskitHeading.atlaskitHeadingInts.`4`]
    
    inline def `5`: typings.atlaskitHeading.atlaskitHeadingInts.`5` = 5.asInstanceOf[typings.atlaskitHeading.atlaskitHeadingInts.`5`]
    
    inline def `6`: typings.atlaskitHeading.atlaskitHeadingInts.`6` = 6.asInstanceOf[typings.atlaskitHeading.atlaskitHeadingInts.`6`]
  }
}
