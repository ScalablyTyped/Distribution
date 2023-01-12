package typings.activexLibreoffice.com_.sun.star.chart2.data

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to sequences of data. With this interface data can only be read from.
  *
  * If the data stored consists only of floating point numbers (double values), the returned instances should also support the service
  * NumericalDataSequence.
  *
  * If the data stored consists only of strings, the returned instances should also support the service TextualDataSequence.
  */
trait XDataSource
  extends StObject
     with XInterface {
  
  /**
    * returns data sequences.
    * @returns a sequence of objects that support at least the service {@link DataSequence} .  If the data stored consist only of floating point numbers (double
    */
  val DataSequences: SafeArray[XLabeledDataSequence]
  
  /**
    * returns data sequences.
    * @returns a sequence of objects that support at least the service {@link DataSequence} .  If the data stored consist only of floating point numbers (double
    */
  def getDataSequences(): SafeArray[XLabeledDataSequence]
}
object XDataSource {
  
  inline def apply(
    DataSequences: SafeArray[XLabeledDataSequence],
    acquire: () => Unit,
    getDataSequences: () => SafeArray[XLabeledDataSequence],
    queryInterface: `type` => Any,
    release: () => Unit
  ): XDataSource = {
    val __obj = js.Dynamic.literal(DataSequences = DataSequences.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDataSequences = js.Any.fromFunction0(getDataSequences), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDataSource] (val x: Self) extends AnyVal {
    
    inline def setDataSequences(value: SafeArray[XLabeledDataSequence]): Self = StObject.set(x, "DataSequences", value.asInstanceOf[js.Any])
    
    inline def setGetDataSequences(value: () => SafeArray[XLabeledDataSequence]): Self = StObject.set(x, "getDataSequences", js.Any.fromFunction0(value))
  }
}
