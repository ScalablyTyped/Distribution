package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait XFrame2
  extends XFramesSupplier
     with XDispatchProvider
     with XDispatchInformationProvider
     with XDispatchProviderInterception
     with activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XStatusIndicatorFactory {
  /**
    * provides access to the dispatch recorder of the frame
    *
    * Such recorder can be used to record dispatch requests. The supplier contains a dispatch recorder and provide the functionality to use it for any
    * dispatch object from outside which supports the interface {@link XDispatch} . A supplier is available only, if recording was enabled. That means: if
    * someone wishes to enable recoding on a frame he must set a supplier with a recorder object inside of it. Every user of dispatches has to check then if
    * such supplier is available at this frame property. If value of this property is `NULL` he must call {@link XDispatch.dispatch()} on the original
    * dispatch object. If it's a valid value he must use the supplier by calling his method {@link XDispatchRecorderSupplier.dispatchAndRecord()} with the
    * original dispatch object as argument.
    *
    * Note: ;  It's not recommended to cache an already gotten supplier. Because there exist no possibility to check for enabled/disabled recording then.
    * @since OOo 1.1.2
    */
  var DispatchRecorderSupplier: XDispatchRecorderSupplier
  /**
    * Provides access to the {@link LayoutManager} of the frame. This is actually of type {@link XLayoutManager} , but this API is still experimental
    * (unpublished).
    */
  var LayoutManager: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /**
    * if possible it sets/gets the UI title on/from the frame container window
    *
    * It depends from the type of the frame container window. If it is a system task window all will be OK. Otherwise the title can't be set.
    * Setting/getting of the pure value of this property must be possible in every case. Only showing on the UI can be fail.
    */
  var Title: java.lang.String
  /** contains user defined attributes. */
  var UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
}

