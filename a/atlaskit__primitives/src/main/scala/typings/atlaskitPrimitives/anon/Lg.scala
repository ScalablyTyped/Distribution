package typings.atlaskitPrimitives.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lg extends StObject {
  
  val lg: /* template literal string: @media (min-width: ${number}px) */ String
  
  val md: /* template literal string: @media (min-width: ${number}px) */ String
  
  val sm: /* template literal string: @media (min-width: ${number}px) */ String
  
  val xl: /* template literal string: @media (min-width: ${number}px) */ String
  
  val xs: /* template literal string: @media (min-width: ${number}px) */ String
  
  val xxl: /* template literal string: @media (min-width: ${number}px) */ String
  
  /**
    * `above.xxs` is redundant and no media query should be used, but it's included for programatic purposes…
    *
    * Eg. this is `@media (min-width: 0px)`
    */
  val xxs: /* template literal string: @media (min-width: ${number}px) */ String
}
object Lg {
  
  inline def apply(
    lg: /* template literal string: @media (min-width: ${number}px) */ String,
    md: /* template literal string: @media (min-width: ${number}px) */ String,
    sm: /* template literal string: @media (min-width: ${number}px) */ String,
    xl: /* template literal string: @media (min-width: ${number}px) */ String,
    xs: /* template literal string: @media (min-width: ${number}px) */ String,
    xxl: /* template literal string: @media (min-width: ${number}px) */ String,
    xxs: /* template literal string: @media (min-width: ${number}px) */ String
  ): Lg = {
    val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], sm = sm.asInstanceOf[js.Any], xl = xl.asInstanceOf[js.Any], xs = xs.asInstanceOf[js.Any], xxl = xxl.asInstanceOf[js.Any], xxs = xxs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lg] (val x: Self) extends AnyVal {
    
    inline def setLg(value: /* template literal string: @media (min-width: ${number}px) */ String): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
    
    inline def setMd(value: /* template literal string: @media (min-width: ${number}px) */ String): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    
    inline def setSm(value: /* template literal string: @media (min-width: ${number}px) */ String): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
    
    inline def setXl(value: /* template literal string: @media (min-width: ${number}px) */ String): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
    
    inline def setXs(value: /* template literal string: @media (min-width: ${number}px) */ String): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
    
    inline def setXxl(value: /* template literal string: @media (min-width: ${number}px) */ String): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
    
    inline def setXxs(value: /* template literal string: @media (min-width: ${number}px) */ String): Self = StObject.set(x, "xxs", value.asInstanceOf[js.Any])
  }
}
