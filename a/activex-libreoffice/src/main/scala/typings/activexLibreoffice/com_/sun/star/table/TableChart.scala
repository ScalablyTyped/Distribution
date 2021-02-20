package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import typings.activexLibreoffice.com_.sun.star.document.XEmbeddedObjectSupplier
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a chart based on data in a table or spreadsheet.
  *
  * This service does not represent the chart document model itself, but the object in the table that contains this chart document.
  */
@js.native
trait TableChart
  extends XTableChart
     with XEmbeddedObjectSupplier
     with XNamed
object TableChart {
  
  @scala.inline
  def apply(
    EmbeddedObject: XComponent,
    HasColumnHeaders: Boolean,
    HasRowHeaders: Boolean,
    Name: String,
    Ranges: SafeArray[CellRangeAddress],
    acquire: () => Unit,
    getEmbeddedObject: () => XComponent,
    getHasColumnHeaders: () => Boolean,
    getHasRowHeaders: () => Boolean,
    getName: () => String,
    getRanges: () => SafeArray[CellRangeAddress],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setHasColumnHeaders: Boolean => Unit,
    setHasRowHeaders: Boolean => Unit,
    setName: String => Unit,
    setRanges: SeqEquiv[CellRangeAddress] => Unit
  ): TableChart = {
    val __obj = js.Dynamic.literal(EmbeddedObject = EmbeddedObject.asInstanceOf[js.Any], HasColumnHeaders = HasColumnHeaders.asInstanceOf[js.Any], HasRowHeaders = HasRowHeaders.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Ranges = Ranges.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEmbeddedObject = js.Any.fromFunction0(getEmbeddedObject), getHasColumnHeaders = js.Any.fromFunction0(getHasColumnHeaders), getHasRowHeaders = js.Any.fromFunction0(getHasRowHeaders), getName = js.Any.fromFunction0(getName), getRanges = js.Any.fromFunction0(getRanges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setHasColumnHeaders = js.Any.fromFunction1(setHasColumnHeaders), setHasRowHeaders = js.Any.fromFunction1(setHasRowHeaders), setName = js.Any.fromFunction1(setName), setRanges = js.Any.fromFunction1(setRanges))
    __obj.asInstanceOf[TableChart]
  }
}
