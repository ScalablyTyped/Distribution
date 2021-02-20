package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.com_.sun.star.lang.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains properties specifying the behavior of a {@link NumberFormatter} .
  * @see NumberFormatter
  */
@js.native
trait NumberFormatProperties extends StObject {
  
  /** contains a comment regarding the number format for display to the user. */
  var Comment: String = js.native
  
  /** contains the format string of the number format. */
  var FormatString: String = js.native
  
  /** contains the locale of the number format. */
  var Locale: typings.activexLibreoffice.com_.sun.star.lang.Locale = js.native
  
  /**
    * contains the type of the number format.
    * @see NumberFormat
    */
  var Type: Double = js.native
}
object NumberFormatProperties {
  
  @scala.inline
  def apply(Comment: String, FormatString: String, Locale: Locale, Type: Double): NumberFormatProperties = {
    val __obj = js.Dynamic.literal(Comment = Comment.asInstanceOf[js.Any], FormatString = FormatString.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatProperties]
  }
  
  @scala.inline
  implicit class NumberFormatPropertiesMutableBuilder[Self <: NumberFormatProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatString(value: String): Self = StObject.set(x, "FormatString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
