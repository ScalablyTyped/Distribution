package typings.atlaskitPrimitives.anon

import typings.emotionUtils.mod.SerializedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Omit<std.Partial<std.Record<@atlaskit/primitives.@atlaskit/primitives/dist/types/helpers/responsive/types.Breakpoint, @emotion/react.@emotion/react.SerializedStyles>>, 'xxs'>> */
trait RequiredOmitPartialRecord extends StObject {
  
  var lg: SerializedStyles
  
  var md: SerializedStyles
  
  var sm: SerializedStyles
  
  var xl: SerializedStyles
  
  var xs: SerializedStyles
  
  var xxl: SerializedStyles
}
object RequiredOmitPartialRecord {
  
  inline def apply(
    lg: SerializedStyles,
    md: SerializedStyles,
    sm: SerializedStyles,
    xl: SerializedStyles,
    xs: SerializedStyles,
    xxl: SerializedStyles
  ): RequiredOmitPartialRecord = {
    val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any], xxl = xxl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredOmitPartialRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequiredOmitPartialRecord] (val x: Self) extends AnyVal {
    
    inline def setLg(value: SerializedStyles): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
    
    inline def setMd(value: SerializedStyles): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    
    inline def setSm(value: SerializedStyles): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
    
    inline def setXl(value: SerializedStyles): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
    
    inline def setXs(value: SerializedStyles): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
    
    inline def setXxl(value: SerializedStyles): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
  }
}
