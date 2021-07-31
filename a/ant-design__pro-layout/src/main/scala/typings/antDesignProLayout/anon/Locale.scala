package typings.antDesignProLayout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locale extends StObject {
  
  var locale: js.UndefOr[Boolean] = js.undefined
}
object Locale {
  
  @scala.inline
  def apply(): Locale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Locale]
  }
  
  @scala.inline
  implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocale(value: Boolean): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
