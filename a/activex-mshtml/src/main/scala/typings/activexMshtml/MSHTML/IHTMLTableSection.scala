package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLTableSection extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLTableSection_typekey")
  var MSHTMLDotIHTMLTableSection_typekey: IHTMLTableSection = js.native
  
  var align: String = js.native
  
  var bgColor: Any = js.native
  
  /** @param index [index=-1] */
  def deleteRow(): Unit = js.native
  def deleteRow(index: Double): Unit = js.native
  
  /** @param index [index=-1] */
  def insertRow(): Any = js.native
  def insertRow(index: Double): Any = js.native
  
  def rows(): Any = js.native
  def rows(name: Any): Any = js.native
  def rows(name: Any, index: Any): Any = js.native
  def rows(name: Unit, index: Any): Any = js.native
  @JSName("rows")
  val rows_Original: IHTMLElementCollection = js.native
  
  var vAlign: String = js.native
}
