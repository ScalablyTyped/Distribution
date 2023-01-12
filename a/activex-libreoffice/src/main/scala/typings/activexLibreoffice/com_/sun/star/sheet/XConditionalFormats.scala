package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XConditionalFormats
  extends StObject
     with XInterface {
  
  val ConditionalFormats: SafeArray[XConditionalFormat]
  
  val Length: Double
  
  /** adds a conditional format to the existing list returns the id of the inserted conditional format */
  def createByRange(range: XSheetCellRanges): Double
  
  def getConditionalFormats(): SafeArray[XConditionalFormat]
  
  def getLength(): Double
  
  def removeByID(ID: Double): Unit
}
object XConditionalFormats {
  
  inline def apply(
    ConditionalFormats: SafeArray[XConditionalFormat],
    Length: Double,
    acquire: () => Unit,
    createByRange: XSheetCellRanges => Double,
    getConditionalFormats: () => SafeArray[XConditionalFormat],
    getLength: () => Double,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeByID: Double => Unit
  ): XConditionalFormats = {
    val __obj = js.Dynamic.literal(ConditionalFormats = ConditionalFormats.asInstanceOf[js.Any], Length = Length.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createByRange = js.Any.fromFunction1(createByRange), getConditionalFormats = js.Any.fromFunction0(getConditionalFormats), getLength = js.Any.fromFunction0(getLength), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByID = js.Any.fromFunction1(removeByID))
    __obj.asInstanceOf[XConditionalFormats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XConditionalFormats] (val x: Self) extends AnyVal {
    
    inline def setConditionalFormats(value: SafeArray[XConditionalFormat]): Self = StObject.set(x, "ConditionalFormats", value.asInstanceOf[js.Any])
    
    inline def setCreateByRange(value: XSheetCellRanges => Double): Self = StObject.set(x, "createByRange", js.Any.fromFunction1(value))
    
    inline def setGetConditionalFormats(value: () => SafeArray[XConditionalFormat]): Self = StObject.set(x, "getConditionalFormats", js.Any.fromFunction0(value))
    
    inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "Length", value.asInstanceOf[js.Any])
    
    inline def setRemoveByID(value: Double => Unit): Self = StObject.set(x, "removeByID", js.Any.fromFunction1(value))
  }
}
