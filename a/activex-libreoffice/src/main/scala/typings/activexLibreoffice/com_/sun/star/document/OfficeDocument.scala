package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.frame.XModel
import typings.activexLibreoffice.com_.sun.star.frame.XStorable
import typings.activexLibreoffice.com_.sun.star.util.XModifiable
import typings.activexLibreoffice.com_.sun.star.view.XPrintJobBroadcaster
import typings.activexLibreoffice.com_.sun.star.view.XPrintable
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * abstract service which specifies a storable and printable document
  *
  * All major document-like components should support this service instead of simple components which supports a {@link com.sun.star.frame.Controller} or
  * pure {@link com.sun.star.awt.XWindow} only.
  * @see com.sun.star.frame.Controller
  */
@js.native
trait OfficeDocument
  extends XModel
     with XModifiable
     with XStorable
     with XPrintable
     with XEventBroadcaster
     with XDocumentEventBroadcaster
     with XEventsSupplier
     with XViewDataSupplier
     with XPrintJobBroadcaster
     with XEmbeddedScripts
     with XDocumentPropertiesSupplier
     with XUndoManagerSupplier {
  
  /**
    * controls the initial (on-load) behavior of the form controls in the document
    *
    * If set to `TRUE` , upon loading the document, the form controls will be in design mode. ;  If set to `FALSE` , they will be alive, i.e. operational. ;
    *  With this, you may control if your document works primarily as a form document.
    */
  var ApplyFormDesignMode: Boolean = js.native
  
  /**
    * controls the focus behavior of the form controls in the document
    *
    * If this flag is set to `TRUE` , any view belonging to the document should focus the first control in the document. With this, you may control if your
    * document works primarily as a form document.
    */
  var AutomaticControlFocus: Boolean = js.native
  
  /**
    * Grab bag of document properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.2  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var InteropGrabBag: SafeArray[PropertyValue] = js.native
  
  /**
    * contains a unique id for the document
    *
    * Once calculated, the id must not change until the document has been closed. Upon closing it will not be made persistent. Thus, the document may get a
    * different id every time it gets loaded.
    */
  var RuntimeUID: String = js.native
}
