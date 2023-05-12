package typings.atlaskitPrimitives.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Md extends StObject {
  
  val lg: /* template literal string: @media (max-width: ${number}px) */ String
  
  val md: /* template literal string: @media (max-width: ${number}px) */ String
  
  val sm: /* template literal string: @media (max-width: ${number}px) */ String
  
  val xl: /* template literal string: @media (max-width: ${number}px) */ String
  
  /**
    * A media query to target viewports below the min width of a given breakpoint.
    * Note that `media.below.xxs` is intentionally omitted as this would be `@media (max-width: 0px)`
    */
  val xs: /* template literal string: @media (max-width: ${number}px) */ String
  
  val xxl: /* template literal string: @media (max-width: ${number}px) */ String
}
object Md {
  
  inline def apply(
    lg: /* template literal string: @media (max-width: ${number}px) */ String,
    md: /* template literal string: @media (max-width: ${number}px) */ String,
    sm: /* template literal string: @media (max-width: ${number}px) */ String,
    xl: /* template literal string: @media (max-width: ${number}px) */ String,
    xs: /* template literal string: @media (max-width: ${number}px) */ String,
    xxl: /* template literal string: @media (max-width: ${number}px) */ String
  ): Md = {
    val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any], xxl = xxl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Md]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Md] (val x: Self) extends AnyVal {
    
    inline def setLg(value: /* template literal string: @media (max-width: ${number}px) */ String): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
    
    inline def setMd(value: /* template literal string: @media (max-width: ${number}px) */ String): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    
    inline def setSm(value: /* template literal string: @media (max-width: ${number}px) */ String): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
    
    inline def setXl(value: /* template literal string: @media (max-width: ${number}px) */ String): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
    
    inline def setXs(value: /* template literal string: @media (max-width: ${number}px) */ String): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
    
    inline def setXxl(value: /* template literal string: @media (max-width: ${number}px) */ String): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
  }
}
