package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides a "deep" filter detection
  *
  * A "deep" filter detection means looking into the document stream to detect the format of it. Services of type {@link ExtendedTypeDetection} must
  * support this interface to be called from generic load mechanism of the office for that.
  * @see DetectService
  * @see TypeDetection
  * @see FilterFactory
  */
trait XExtendedFilterDetection
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * controls agreement of a "flat" {@link TypeDetection} with given URL or arguments
    *
    * Registered services in configuration, which support this interface for different mime types, will be called automatically to look into the document
    * stream and decide which format it represent. Add the collected information about detected documents in given {@link MediaDescriptor}**Descriptor** .
    * The decision must be returned as any valid type name (which specifies the detected format) or an empty value for unknown formats.
    * @param Descriptor represent a {@link MediaDescriptor} which can be used to get/set information about the detected document
    * @returns an internal type name if format was detected successfully ;  or an empty value for an unknown document format.
    */
  def detect(
    Descriptor: js.Array[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ]
  ): java.lang.String
}

object XExtendedFilterDetection {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    detect: js.Function1[
      js.Array[
        activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
      ], 
      java.lang.String
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XExtendedFilterDetection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("detect")(detect)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XExtendedFilterDetection]
  }
}

