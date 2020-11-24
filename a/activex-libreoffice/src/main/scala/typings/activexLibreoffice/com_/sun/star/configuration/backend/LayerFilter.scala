package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides a filtered version of a configuration data {@link Layer} .
  *
  * A layer filter wraps a source {@link XLayer} object and provides access to a filtered version of its data. The data read from the filter usually is
  * produced from the source data by adding and removing elements or modifying values.
  * @see com.sun.star.configuration.backend.DataImporter Service that supports applying a LayerFilter to imported data.
  * @since OOo 2.0
  */
@js.native
trait LayerFilter
  extends XLayer
     with XInitialization
object LayerFilter {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    readData: XLayerHandler => Unit,
    release: () => Unit
  ): LayerFilter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), readData = js.Any.fromFunction1(readData), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[LayerFilter]
  }
}
