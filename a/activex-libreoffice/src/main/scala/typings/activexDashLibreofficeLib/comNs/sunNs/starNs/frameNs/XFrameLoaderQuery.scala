package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * use service {@link FrameLoaderFactory} instead of this
  * @deprecated Deprecated
  */
trait XFrameLoaderQuery
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * use member {@link com.sun.star.container.XNameAccess.getElementNames()} provided by service {@link FrameLoaderFactory} instead of this
    * @deprecated Deprecated
    */
  val AvailableFilterNames: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * use member {@link com.sun.star.container.XNameAccess.getElementNames()} provided by service {@link FrameLoaderFactory} instead of this
    * @deprecated Deprecated
    */
  def getAvailableFilterNames(): activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * use member {@link com.sun.star.container.XNameAccess.getByName()} provided by service {@link FrameLoaderFactory} instead of this
    * @deprecated Deprecated
    */
  def getLoaderProperties(sFilterName: java.lang.String): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * use member {@link com.sun.star.container.XContainerQuery} provided by service {@link FrameLoaderFactory} instead of this
    * @deprecated Deprecated
    */
  def searchFilter(
    sURL: java.lang.String,
    seqArguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): java.lang.String
}

object XFrameLoaderQuery {
  @scala.inline
  def apply(
    AvailableFilterNames: activexDashInteropLib.SafeArray[java.lang.String],
    acquire: js.Function0[scala.Unit],
    getAvailableFilterNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getLoaderProperties: js.Function1[
      java.lang.String, 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    searchFilter: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      java.lang.String
    ]
  ): XFrameLoaderQuery = {
    val __obj = js.Dynamic.literal(AvailableFilterNames = AvailableFilterNames, acquire = acquire, getAvailableFilterNames = getAvailableFilterNames, getLoaderProperties = getLoaderProperties, queryInterface = queryInterface, release = release, searchFilter = searchFilter)
  
    __obj.asInstanceOf[XFrameLoaderQuery]
  }
}

