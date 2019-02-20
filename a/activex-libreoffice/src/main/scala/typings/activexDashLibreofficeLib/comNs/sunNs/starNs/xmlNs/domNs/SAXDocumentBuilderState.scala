package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SAXDocumentBuilderState extends js.Object

@JSGlobal("com.sun.star.xml.dom.SAXDocumentBuilderState")
@js.native
object SAXDocumentBuilderState extends js.Object {
  @js.native
  sealed trait BUILDING_DOCUMENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.SAXDocumentBuilderState
  
  @js.native
  sealed trait BUILDING_FRAGMENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.SAXDocumentBuilderState
  
  @js.native
  sealed trait DOCUMENT_FINISHED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.SAXDocumentBuilderState
  
  @js.native
  sealed trait FRAGMENT_FINISHED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.SAXDocumentBuilderState
  
  @js.native
  sealed trait READY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.SAXDocumentBuilderState
  
  /* 1 */ val BUILDING_DOCUMENT: BUILDING_DOCUMENT with scala.Double = js.native
  /* 2 */ val BUILDING_FRAGMENT: BUILDING_FRAGMENT with scala.Double = js.native
  /* 3 */ val DOCUMENT_FINISHED: DOCUMENT_FINISHED with scala.Double = js.native
  /* 4 */ val FRAGMENT_FINISHED: FRAGMENT_FINISHED with scala.Double = js.native
  /* 0 */ val READY: READY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.SAXDocumentBuilderState with scala.Double
  ] = js.native
}

