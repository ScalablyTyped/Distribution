package typings.activexLibreoffice.com_.sun.star.chart2.data

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.util.XCloneable
import typings.activexLibreoffice.com_.sun.star.util.XModifyBroadcaster
import typings.activexLibreoffice.com_.sun.star.util.XModifyListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @since LibreOffice 4.1 */
trait XLabeledDataSequence2
  extends StObject
     with XLabeledDataSequence
     with XModifyBroadcaster
     with XCloneable
object XLabeledDataSequence2 {
  
  inline def apply(
    Label: XDataSequence,
    Values: XDataSequence,
    acquire: () => Unit,
    addModifyListener: XModifyListener => Unit,
    createClone: () => XCloneable,
    getLabel: () => XDataSequence,
    getValues: () => XDataSequence,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeModifyListener: XModifyListener => Unit,
    setLabel: XDataSequence => Unit,
    setValues: XDataSequence => Unit
  ): XLabeledDataSequence2 = {
    val __obj = js.Dynamic.literal(Label = Label.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), createClone = js.Any.fromFunction0(createClone), getLabel = js.Any.fromFunction0(getLabel), getValues = js.Any.fromFunction0(getValues), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeModifyListener = js.Any.fromFunction1(removeModifyListener), setLabel = js.Any.fromFunction1(setLabel), setValues = js.Any.fromFunction1(setValues))
    __obj.asInstanceOf[XLabeledDataSequence2]
  }
}
