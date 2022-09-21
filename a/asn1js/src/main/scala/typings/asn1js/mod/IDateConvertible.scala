package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDateConvertible extends StObject {
  
  /**
    * Creates a class object from the JavaScript Date object
    * @param date Date object
    */
  def fromDate(date: js.Date): Unit
  
  /**
    * Converts a class object into the JavaScrip Date Object
    * @returns Date object
    */
  def toDate(): js.Date
}
object IDateConvertible {
  
  inline def apply(fromDate: js.Date => Unit, toDate: () => js.Date): IDateConvertible = {
    val __obj = js.Dynamic.literal(fromDate = js.Any.fromFunction1(fromDate), toDate = js.Any.fromFunction0(toDate))
    __obj.asInstanceOf[IDateConvertible]
  }
  
  extension [Self <: IDateConvertible](x: Self) {
    
    inline def setFromDate(value: js.Date => Unit): Self = StObject.set(x, "fromDate", js.Any.fromFunction1(value))
    
    inline def setToDate(value: () => js.Date): Self = StObject.set(x, "toDate", js.Any.fromFunction0(value))
  }
}
