package typings
package activexDashAccessLib.AccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AcOutputFormat extends js.Object

@JSGlobal("Access.AcOutputFormat")
@js.native
object AcOutputFormat extends js.Object {
  @js.native
  sealed trait acFormatASP
    extends activexDashAccessLib.AccessNs.AcOutputFormat
  
  @js.native
  sealed trait acFormatDAP
    extends activexDashAccessLib.AccessNs.AcOutputFormat
  
  @js.native
  sealed trait acFormatHTML
    extends activexDashAccessLib.AccessNs.AcOutputFormat
  
  @js.native
  sealed trait acFormatIIS
    extends activexDashAccessLib.AccessNs.AcOutputFormat
  
  @js.native
  sealed trait acFormatPDF
    extends activexDashAccessLib.AccessNs.AcOutputFormat
  
  @js.native
  sealed trait acFormatRTF
    extends activexDashAccessLib.AccessNs.AcOutputFormat
  
  @js.native
  sealed trait acFormatSNP
    extends activexDashAccessLib.AccessNs.AcOutputFormat
  
  @js.native
  sealed trait acFormatTXT
    extends activexDashAccessLib.AccessNs.AcOutputFormat
  
  @js.native
  sealed trait acFormatXLS
    extends activexDashAccessLib.AccessNs.AcOutputFormat
  
  @js.native
  sealed trait acFormatXLSB
    extends activexDashAccessLib.AccessNs.AcOutputFormat
  
  @js.native
  sealed trait acFormatXLSX
    extends activexDashAccessLib.AccessNs.AcOutputFormat
  
  @js.native
  sealed trait acFormatXPS
    extends activexDashAccessLib.AccessNs.AcOutputFormat
  
  /* "Microsoft Active Server Pages (*.asp)" */ val acFormatASP: acFormatASP with java.lang.String = js.native
  /* "Microsoft Access Data Access Page (*.htm; *.html)" */ val acFormatDAP: acFormatDAP with java.lang.String = js.native
  /* "HTML (*.html)" */ val acFormatHTML: acFormatHTML with java.lang.String = js.native
  /* "Microsoft IIS (*.htx; *.idc)" */ val acFormatIIS: acFormatIIS with java.lang.String = js.native
  /* "PDF Format (*.pdf)" */ val acFormatPDF: acFormatPDF with java.lang.String = js.native
  /* "Rich Text Format (*.rtf)" */ val acFormatRTF: acFormatRTF with java.lang.String = js.native
  /* "Snapshot Format (*.snp)" */ val acFormatSNP: acFormatSNP with java.lang.String = js.native
  /* "MS-DOS Text (*.txt)" */ val acFormatTXT: acFormatTXT with java.lang.String = js.native
  /* "Microsoft Excel (*.xls)" */ val acFormatXLS: acFormatXLS with java.lang.String = js.native
  /* "Microsoft Excel Binary Workbook (*.xlsb)" */ val acFormatXLSB: acFormatXLSB with java.lang.String = js.native
  /* "Microsoft Excel Workbook (*.xlsx)" */ val acFormatXLSX: acFormatXLSX with java.lang.String = js.native
  /* "XPS Format (*.xps)" */ val acFormatXPS: acFormatXPS with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[activexDashAccessLib.AccessNs.AcOutputFormat with java.lang.String] = js.native
}

