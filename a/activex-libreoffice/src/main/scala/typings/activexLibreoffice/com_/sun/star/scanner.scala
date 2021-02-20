package typings.activexLibreoffice.com_.sun.star

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import typings.activexLibreoffice.activexLibreofficeNumbers.`5`
import typings.activexLibreoffice.com_.sun.star.awt.XBitmap
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scanner {
  
  /** enum ScanError describes error codes of scanner component */
  /* Rewritten from type alias, can be one of: 
    - typings.activexLibreoffice.activexLibreofficeNumbers.`5`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
    - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  */
  trait ScanError extends StObject
  object ScanError {
    
    /** InvalidContext: a device was requested that does not exist */
    @scala.inline
    def InvalidContext: `5` = 5.asInstanceOf[`5`]
    
    /** ScanCanceled: the scan was canceled by the user */
    @scala.inline
    def ScanCanceled: `4` = 4.asInstanceOf[`4`]
    
    /** ScanErrorNone: no error occurred */
    @scala.inline
    def ScanErrorNone: `0` = 0.asInstanceOf[`0`]
    
    /** ScanFailed: an error occurred during scanning */
    @scala.inline
    def ScanFailed: `2` = 2.asInstanceOf[`2`]
    
    /** ScanInProgress: a scan is already in progress on this device that has to end before a new one can be started */
    @scala.inline
    def ScanInProgress: `3` = 3.asInstanceOf[`3`]
    
    /** ScannerNotAvailable: the requested device could not be opened */
    @scala.inline
    def ScannerNotAvailable: `1` = 1.asInstanceOf[`1`]
  }
  
  /** a scanner context is an identifier for a specific scanner device */
  @js.native
  trait ScannerContext extends StObject {
    
    /** InternalData contains service private data and must not be changed */
    var InternalData: Double = js.native
    
    /** ScannerName contains a user readable identification */
    var ScannerName: String = js.native
  }
  object ScannerContext {
    
    @scala.inline
    def apply(InternalData: Double, ScannerName: String): ScannerContext = {
      val __obj = js.Dynamic.literal(InternalData = InternalData.asInstanceOf[js.Any], ScannerName = ScannerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScannerContext]
    }
    
    @scala.inline
    implicit class ScannerContextMutableBuilder[Self <: ScannerContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInternalData(value: Double): Self = StObject.set(x, "InternalData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScannerName(value: String): Self = StObject.set(x, "ScannerName", value.asInstanceOf[js.Any])
    }
  }
  
  /** A {@link ScannerException} gets thrown if an object of type {@link XScannerManager} could not complete a specific action. */
  @js.native
  trait ScannerException extends Exception {
    
    /** Error: contains the specific reason for failure */
    var Error: ScanError = js.native
  }
  object ScannerException {
    
    @scala.inline
    def apply(Context: XInterface, Error: ScanError, Message: String): ScannerException = {
      val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScannerException]
    }
    
    @scala.inline
    implicit class ScannerExceptionMutableBuilder[Self <: ScannerException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: ScanError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    }
  }
  
  /** {@link ScannerManager} provides a simple method to access scanner devices (or other image producing devices) */
  type ScannerManager = XScannerManager2
  
  @js.native
  trait XScannerManager extends XInterface {
    
    /** returns all available scanner devices */
    val AvailableScanners: SafeArray[ScannerContext] = js.native
    
    /** produce some kind of User Interface to let the user have a preview, configure the scan area, etc., it returns FALSE if user cancelled this process */
    def configureScanner(scannerContext: js.Array[ScannerContext]): Boolean = js.native
    
    /** returns all available scanner devices */
    def getAvailableScanners(): SafeArray[ScannerContext] = js.native
    
    /** get the image after completion of scan */
    def getBitmap(scannerContext: ScannerContext): XBitmap = js.native
    
    /** get the state of scanning after completion of scan */
    def getError(scannerContext: ScannerContext): ScanError = js.native
    
    /**
      * start the scanning process listener will be called when scan is complete the EventObject of the disposing call will contain the {@link ScannerManager}
      * if the scan was successful, an empty interface otherwise
      */
    def startScan(scannerContext: ScannerContext, listener: XEventListener): Unit = js.native
  }
  object XScannerManager {
    
    @scala.inline
    def apply(
      AvailableScanners: SafeArray[ScannerContext],
      acquire: () => Unit,
      configureScanner: js.Array[ScannerContext] => Boolean,
      getAvailableScanners: () => SafeArray[ScannerContext],
      getBitmap: ScannerContext => XBitmap,
      getError: ScannerContext => ScanError,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      startScan: (ScannerContext, XEventListener) => Unit
    ): XScannerManager = {
      val __obj = js.Dynamic.literal(AvailableScanners = AvailableScanners.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), configureScanner = js.Any.fromFunction1(configureScanner), getAvailableScanners = js.Any.fromFunction0(getAvailableScanners), getBitmap = js.Any.fromFunction1(getBitmap), getError = js.Any.fromFunction1(getError), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), startScan = js.Any.fromFunction2(startScan))
      __obj.asInstanceOf[XScannerManager]
    }
    
    @scala.inline
    implicit class XScannerManagerMutableBuilder[Self <: XScannerManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailableScanners(value: SafeArray[ScannerContext]): Self = StObject.set(x, "AvailableScanners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigureScanner(value: js.Array[ScannerContext] => Boolean): Self = StObject.set(x, "configureScanner", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAvailableScanners(value: () => SafeArray[ScannerContext]): Self = StObject.set(x, "getAvailableScanners", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBitmap(value: ScannerContext => XBitmap): Self = StObject.set(x, "getBitmap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetError(value: ScannerContext => ScanError): Self = StObject.set(x, "getError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartScan(value: (ScannerContext, XEventListener) => Unit): Self = StObject.set(x, "startScan", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * Extension of {@link XScannerManager} .
    * @since LibreOffice 3.5
    */
  @js.native
  trait XScannerManager2 extends XScannerManager {
    
    /**
      * produce some kind of User Interface to let the user have a preview, configure the scan area, etc., it, and scan it returns FALSE if user cancelled
      * this process
      */
    def configureScannerAndScan(scannerContext: js.Array[ScannerContext], listener: XEventListener): Boolean = js.native
  }
  object XScannerManager2 {
    
    @scala.inline
    def apply(
      AvailableScanners: SafeArray[ScannerContext],
      acquire: () => Unit,
      configureScanner: js.Array[ScannerContext] => Boolean,
      configureScannerAndScan: (js.Array[ScannerContext], XEventListener) => Boolean,
      getAvailableScanners: () => SafeArray[ScannerContext],
      getBitmap: ScannerContext => XBitmap,
      getError: ScannerContext => ScanError,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      startScan: (ScannerContext, XEventListener) => Unit
    ): XScannerManager2 = {
      val __obj = js.Dynamic.literal(AvailableScanners = AvailableScanners.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), configureScanner = js.Any.fromFunction1(configureScanner), configureScannerAndScan = js.Any.fromFunction2(configureScannerAndScan), getAvailableScanners = js.Any.fromFunction0(getAvailableScanners), getBitmap = js.Any.fromFunction1(getBitmap), getError = js.Any.fromFunction1(getError), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), startScan = js.Any.fromFunction2(startScan))
      __obj.asInstanceOf[XScannerManager2]
    }
    
    @scala.inline
    implicit class XScannerManager2MutableBuilder[Self <: XScannerManager2] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigureScannerAndScan(value: (js.Array[ScannerContext], XEventListener) => Boolean): Self = StObject.set(x, "configureScannerAndScan", js.Any.fromFunction2(value))
    }
  }
}
