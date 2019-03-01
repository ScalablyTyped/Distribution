package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * filter for imports
  *
  * Such filters can be used for importing a content. Of course it's possible to combine it with the service {@link ExportFilter} if export functionality
  * should be available at same implementation too.
  * @see ExportFilter
  */
trait ImportFilter
  extends XImporter
     with XFilter
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed

object ImportFilter {
  @scala.inline
  def apply(
    Name: java.lang.String,
    acquire: js.Function0[scala.Unit],
    cancel: js.Function0[scala.Unit],
    filter: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Boolean
    ],
    getName: js.Function0[java.lang.String],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    setTargetDocument: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent, scala.Unit]
  ): ImportFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("filter")(filter)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("setTargetDocument")(setTargetDocument)
    __obj.asInstanceOf[ImportFilter]
  }
}

