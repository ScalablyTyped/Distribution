package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Abbreviate arbitrary strings.
  *
  * It is expected that there will be different implementations of this interface, that each expect strings conforming to a certain structure (e.g., URIs,
  * platform-specific file paths, or newsgroup names). The abbreviation algorithms will then take into account the structural information.
  * @see XStringWidth
  */
@js.native
trait XStringAbbreviation extends XInterface {
  
  /**
    * Abbreviate a string, so that the resulting abbreviated string is not wider than some given width.
    *
    * The width of a string is an abstract concept here, measured via an {@link XStringWidth} interface. Examples are the number of characters in the string
    * ( {@link XStringWidth} will measure the string's length), or the width in pixel when displayed with a specific font (which {@link XStringWidth} would
    * encapsulate).
    * @param xStringWidth The interface that makes concrete the abstract notion of string width.
    * @param nWidth The resulting abbreviated string's width will be no larger than this.
    * @param aString The string that is abbreviated.
    * @returns an abbreviated string.
    */
  def abbreviateString(xStringWidth: XStringWidth, nWidth: Double, aString: String): String = js.native
}
object XStringAbbreviation {
  
  @scala.inline
  def apply(
    abbreviateString: (XStringWidth, Double, String) => String,
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStringAbbreviation = {
    val __obj = js.Dynamic.literal(abbreviateString = js.Any.fromFunction3(abbreviateString), acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStringAbbreviation]
  }
  
  @scala.inline
  implicit class XStringAbbreviationMutableBuilder[Self <: XStringAbbreviation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbbreviateString(value: (XStringWidth, Double, String) => String): Self = StObject.set(x, "abbreviateString", js.Any.fromFunction3(value))
  }
}
