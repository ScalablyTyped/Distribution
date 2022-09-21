package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * filter for imports
  *
  * Such filters can be used for importing a content. Of course it's possible to combine it with the service {@link ExportFilter} if export functionality
  * should be available at same implementation too.
  * @see ExportFilter
  */
trait ImportFilter
  extends StObject
     with XImporter
     with XFilter
     with XInitialization
     with XNamed
object ImportFilter {
  
  inline def apply(
    Name: String,
    acquire: () => Unit,
    cancel: () => Unit,
    filter: SeqEquiv[PropertyValue] => Boolean,
    getName: () => String,
    initialize: SeqEquiv[Any] => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    setName: String => Unit,
    setTargetDocument: XComponent => Unit
  ): ImportFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), filter = js.Any.fromFunction1(filter), getName = js.Any.fromFunction0(getName), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setName = js.Any.fromFunction1(setName), setTargetDocument = js.Any.fromFunction1(setTargetDocument))
    __obj.asInstanceOf[ImportFilter]
  }
}
