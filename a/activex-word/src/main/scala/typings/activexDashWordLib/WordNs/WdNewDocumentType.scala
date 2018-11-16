package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdNewDocumentType extends js.Object

@JSGlobal("Word.WdNewDocumentType")
@js.native
object WdNewDocumentType extends js.Object {
  @js.native
  sealed trait wdNewBlankDocument
    extends activexDashWordLib.WordNs.WdNewDocumentType
  
  @js.native
  sealed trait wdNewEmailMessage
    extends activexDashWordLib.WordNs.WdNewDocumentType
  
  @js.native
  sealed trait wdNewFrameset
    extends activexDashWordLib.WordNs.WdNewDocumentType
  
  @js.native
  sealed trait wdNewWebPage
    extends activexDashWordLib.WordNs.WdNewDocumentType
  
  @js.native
  sealed trait wdNewXMLDocument
    extends activexDashWordLib.WordNs.WdNewDocumentType
  
  /* 0 */ val wdNewBlankDocument: wdNewBlankDocument with scala.Double = js.native
  /* 2 */ val wdNewEmailMessage: wdNewEmailMessage with scala.Double = js.native
  /* 3 */ val wdNewFrameset: wdNewFrameset with scala.Double = js.native
  /* 1 */ val wdNewWebPage: wdNewWebPage with scala.Double = js.native
  /* 4 */ val wdNewXMLDocument: wdNewXMLDocument with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdNewDocumentType with scala.Double] = js.native
}

