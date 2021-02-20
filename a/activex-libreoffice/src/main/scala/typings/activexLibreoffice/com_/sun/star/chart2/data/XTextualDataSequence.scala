package typings.activexLibreoffice.com_.sun.star.chart2.data

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows access to a one-dimensional sequence of strings. */
@js.native
trait XTextualDataSequence extends XInterface {
  
  /** retrieves the data as strings */
  val TextualData: SafeArray[String] = js.native
  
  /** retrieves the data as strings */
  def getTextualData(): SafeArray[String] = js.native
}
object XTextualDataSequence {
  
  @scala.inline
  def apply(
    TextualData: SafeArray[String],
    acquire: () => Unit,
    getTextualData: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextualDataSequence = {
    val __obj = js.Dynamic.literal(TextualData = TextualData.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTextualData = js.Any.fromFunction0(getTextualData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextualDataSequence]
  }
  
  @scala.inline
  implicit class XTextualDataSequenceMutableBuilder[Self <: XTextualDataSequence] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetTextualData(value: () => SafeArray[String]): Self = StObject.set(x, "getTextualData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTextualData(value: SafeArray[String]): Self = StObject.set(x, "TextualData", value.asInstanceOf[js.Any])
  }
}
