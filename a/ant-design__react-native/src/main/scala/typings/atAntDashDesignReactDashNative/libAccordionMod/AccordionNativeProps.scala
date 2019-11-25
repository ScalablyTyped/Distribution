package typings.atAntDashDesignReactDashNative.libAccordionMod

import typings.atAntDashDesignReactDashNative.libAccordionStyleMod.AccordionStyle
import typings.atAntDashDesignReactDashNative.libStyleMod.WithThemeStyles
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AccordionProps<T> * / any ]:? / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AccordionProps<T> * / any[P]} */ trait AccordionNativeProps[T] extends WithThemeStyles[AccordionStyle] {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object AccordionNativeProps {
  @scala.inline
  def apply[T](style: StyleProp[ViewStyle] = null, styles: Partial[AccordionStyle] = null): AccordionNativeProps[T] = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionNativeProps[T]]
  }
}

