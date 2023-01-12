package typings.activexLibreoffice.com_.sun.star.chart2.data

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is a container for sequences of data. With this interface data can only be written to.
  *
  * If you want to be able to also read the data set here, your component must also implement {@link XDataSource} .
  */
trait XDataSink
  extends StObject
     with XInterface {
  
  /**
    * sets new data sequences. The elements set here must support the service {@link DataSequence} .
    *
    * If the data consist only of floating point numbers (double values), the instances set here should also support the service NumericalDataSequence.
    *
    * If the data consist only of strings, the instances set here should also support the service TextualDataSequence.
    *
    * If one of the derived services is supported by one element of the sequence, it should be available for all elements in the sequence.
    */
  def setData(aData: SeqEquiv[XLabeledDataSequence]): Unit
}
object XDataSink {
  
  inline def apply(
    acquire: () => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    setData: SeqEquiv[XLabeledDataSequence] => Unit
  ): XDataSink = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setData = js.Any.fromFunction1(setData))
    __obj.asInstanceOf[XDataSink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDataSink] (val x: Self) extends AnyVal {
    
    inline def setSetData(value: SeqEquiv[XLabeledDataSequence] => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
  }
}
