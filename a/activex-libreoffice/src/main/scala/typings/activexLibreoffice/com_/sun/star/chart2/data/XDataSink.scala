package typings.activexLibreoffice.com_.sun.star.chart2.data

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is a container for sequences of data. With this interface data can only be written to.
  *
  * If you want to be able to also read the data set here, your component must also implement {@link XDataSource} .
  */
@js.native
trait XDataSink extends XInterface {
  
  /**
    * sets new data sequences. The elements set here must support the service {@link DataSequence} .
    *
    * If the data consist only of floating point numbers (double values), the instances set here should also support the service NumericalDataSequence.
    *
    * If the data consist only of strings, the instances set here should also support the service TextualDataSequence.
    *
    * If one of the derived services is supported by one element of the sequence, it should be available for all elements in the sequence.
    */
  def setData(aData: SeqEquiv[XLabeledDataSequence]): Unit = js.native
}
object XDataSink {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setData: SeqEquiv[XLabeledDataSequence] => Unit
  ): XDataSink = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setData = js.Any.fromFunction1(setData))
    __obj.asInstanceOf[XDataSink]
  }
  
  @scala.inline
  implicit class XDataSinkOps[Self <: XDataSink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSetData(value: SeqEquiv[XLabeledDataSequence] => Unit): Self = this.set("setData", js.Any.fromFunction1(value))
  }
}
