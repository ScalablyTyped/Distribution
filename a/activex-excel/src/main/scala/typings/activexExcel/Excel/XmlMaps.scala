package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlMaps extends StObject {
  
  def apply(Index: String): XmlMap = js.native
  def apply(Index: Double): XmlMap = js.native
  
  def Add(Schema: String): XmlMap = js.native
  def Add(Schema: String, RootElementName: String): XmlMap = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): XmlMap = js.native
  def Item(Index: Double): XmlMap = js.native
  
  val Parent: js.Any = js.native
  
  def _Default(Index: js.Any): XmlMap = js.native
}
