package typings.activexLibreoffice.com_.sun.star.chart2.data

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows access to a one-dimensional sequence of data.
  *
  * The data that is stored in this container may contain different types.
  */
trait XLabeledDataSequence
  extends StObject
     with XInterface {
  
  /** returns an {@link XDataSequence} containing the label for the labeled sequence. */
  var Label: XDataSequence
  
  /** returns an {@link XDataSequence} containing the actual data. */
  var Values: XDataSequence
  
  /** returns an {@link XDataSequence} containing the label for the labeled sequence. */
  def getLabel(): XDataSequence
  
  /** returns an {@link XDataSequence} containing the actual data. */
  def getValues(): XDataSequence
  
  /** sets a new {@link XDataSequence} containing the label for the labeled sequence. */
  def setLabel(xSequence: XDataSequence): Unit
  
  /** sets a new {@link XDataSequence} containing the actual data. */
  def setValues(xSequence: XDataSequence): Unit
}
object XLabeledDataSequence {
  
  inline def apply(
    Label: XDataSequence,
    Values: XDataSequence,
    acquire: () => Unit,
    getLabel: () => XDataSequence,
    getValues: () => XDataSequence,
    queryInterface: `type` => Any,
    release: () => Unit,
    setLabel: XDataSequence => Unit,
    setValues: XDataSequence => Unit
  ): XLabeledDataSequence = {
    val __obj = js.Dynamic.literal(Label = Label.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLabel = js.Any.fromFunction0(getLabel), getValues = js.Any.fromFunction0(getValues), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLabel = js.Any.fromFunction1(setLabel), setValues = js.Any.fromFunction1(setValues))
    __obj.asInstanceOf[XLabeledDataSequence]
  }
  
  extension [Self <: XLabeledDataSequence](x: Self) {
    
    inline def setGetLabel(value: () => XDataSequence): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
    
    inline def setGetValues(value: () => XDataSequence): Self = StObject.set(x, "getValues", js.Any.fromFunction0(value))
    
    inline def setLabel(value: XDataSequence): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setSetLabel(value: XDataSequence => Unit): Self = StObject.set(x, "setLabel", js.Any.fromFunction1(value))
    
    inline def setSetValues(value: XDataSequence => Unit): Self = StObject.set(x, "setValues", js.Any.fromFunction1(value))
    
    inline def setValues(value: XDataSequence): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
  }
}
