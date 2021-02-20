package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.com_.sun.star.lang.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A name that is valid for a specified locale.
  * @see com.sun.star.sheet.XCompatibilityNames
  */
@js.native
trait LocalizedName extends StObject {
  
  /** The locale for which this name is valid. */
  var Locale: typings.activexLibreoffice.com_.sun.star.lang.Locale = js.native
  
  /** The name itself. */
  var Name: String = js.native
}
object LocalizedName {
  
  @scala.inline
  def apply(Locale: Locale, Name: String): LocalizedName = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizedName]
  }
  
  @scala.inline
  implicit class LocalizedNameMutableBuilder[Self <: LocalizedName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
