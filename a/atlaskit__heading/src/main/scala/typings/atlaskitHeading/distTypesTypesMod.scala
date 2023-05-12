package typings.atlaskitHeading

import typings.atlaskitHeading.atlaskitHeadingStrings.default
import typings.atlaskitHeading.atlaskitHeadingStrings.div
import typings.atlaskitHeading.atlaskitHeadingStrings.h1
import typings.atlaskitHeading.atlaskitHeadingStrings.h100
import typings.atlaskitHeading.atlaskitHeadingStrings.h2
import typings.atlaskitHeading.atlaskitHeadingStrings.h200
import typings.atlaskitHeading.atlaskitHeadingStrings.h3
import typings.atlaskitHeading.atlaskitHeadingStrings.h300
import typings.atlaskitHeading.atlaskitHeadingStrings.h4
import typings.atlaskitHeading.atlaskitHeadingStrings.h400
import typings.atlaskitHeading.atlaskitHeadingStrings.h5
import typings.atlaskitHeading.atlaskitHeadingStrings.h500
import typings.atlaskitHeading.atlaskitHeadingStrings.h6
import typings.atlaskitHeading.atlaskitHeadingStrings.h600
import typings.atlaskitHeading.atlaskitHeadingStrings.h700
import typings.atlaskitHeading.atlaskitHeadingStrings.h800
import typings.atlaskitHeading.atlaskitHeadingStrings.h900
import typings.atlaskitHeading.atlaskitHeadingStrings.inverse
import typings.atlaskitHeading.atlaskitHeadingStrings.span
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  trait HeadingProps extends StObject {
    
    /**
      * Allows the component to be rendered as the specified DOM element, overriding a default element set by `level` prop.
      */
    var as: js.UndefOr[h1 | h2 | h3 | h4 | h5 | h6 | div | span] = js.undefined
    
    /**
      * The text of the heading.
      */
    var children: ReactNode
    
    /**
      * Text color of the heading. Use `"inverse"` option for a light text color over a dark background.
      * Defaults to `"default"`.
      */
    var color: js.UndefOr[inverse | default] = js.undefined
    
    /**
      * Unique identifier for the heading DOM element.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      The headling level as defined by the Atlasian Design [typography foundations](/foundations/typography/).
      
      The `level` prop affects the actual HTML element rendered in the DOM:
      
      ```
      const levelMap = {
      h900: 'h1',
      h800: 'h1',
      h700: 'h2',
      h600: 'h3',
      h500: 'h4',
      h400: 'h5',
      h300: 'h6',
      h200: 'div',
      h100: 'div',
      }
      ```
      
      It's important to note that the final DOM may be impacted by the parent heading level context because of inferred accessibility level correction.
      Therefore, it is recommended to check the final DOM to confirm the actual rendered HTML element.
      */
    var level: h900 | h800 | h700 | h600 | h500 | h400 | h300 | h200 | h100
    
    /**
      * A `testId` prop is provided for specified elements, which is a unique
      * string that appears as a data attribute `data-testid` in the rendered code,
      * serving as a hook for automated tests.
      */
    var testId: js.UndefOr[String] = js.undefined
  }
  object HeadingProps {
    
    inline def apply(level: h900 | h800 | h700 | h600 | h500 | h400 | h300 | h200 | h100): HeadingProps = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeadingProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeadingProps] (val x: Self) extends AnyVal {
      
      inline def setAs(value: h1 | h2 | h3 | h4 | h5 | h6 | div | span): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColor(value: inverse | default): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLevel(value: h900 | h800 | h700 | h600 | h500 | h400 | h300 | h200 | h100): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setTestId(value: String): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
      
      inline def setTestIdUndefined: Self = StObject.set(x, "testId", js.undefined)
    }
  }
}
