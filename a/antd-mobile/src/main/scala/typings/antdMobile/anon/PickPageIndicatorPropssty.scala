package typings.antdMobile.anon

import typings.antdMobile.antdMobileStrings.`--active-dot-border-radius`
import typings.antdMobile.antdMobileStrings.`--active-dot-color`
import typings.antdMobile.antdMobileStrings.`--active-dot-size`
import typings.antdMobile.antdMobileStrings.`--dot-border-radius`
import typings.antdMobile.antdMobileStrings.`--dot-color`
import typings.antdMobile.antdMobileStrings.`--dot-size`
import typings.antdMobile.antdMobileStrings.`--dot-spacing`
import typings.antdMobile.antdMobileStrings.primary
import typings.antdMobile.antdMobileStrings.white
import typings.react.mod.CSSProperties
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<antd-mobile.antd-mobile/es/components/page-indicator.PageIndicatorProps, 'style' | 'className' | 'color'> */
trait PickPageIndicatorPropssty extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[primary | white] = js.undefined
  
  var style: js.UndefOr[
    CSSProperties & (Partial[
      Record[
        `--dot-color` | `--active-dot-color` | `--dot-size` | `--active-dot-size` | `--dot-border-radius` | `--active-dot-border-radius` | `--dot-spacing`, 
        String
      ]
    ])
  ] = js.undefined
}
object PickPageIndicatorPropssty {
  
  inline def apply(): PickPageIndicatorPropssty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickPageIndicatorPropssty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickPageIndicatorPropssty] (val x: Self) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: primary | white): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setStyle(
      value: CSSProperties & (Partial[
          Record[
            `--dot-color` | `--active-dot-color` | `--dot-size` | `--active-dot-size` | `--dot-border-radius` | `--active-dot-border-radius` | `--dot-spacing`, 
            String
          ]
        ])
    ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
