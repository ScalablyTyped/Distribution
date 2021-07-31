package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XmlNamespaces extends StObject {
  
  def apply(Index: String): XmlNamespace = js.native
  def apply(Index: Double): XmlNamespace = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def InstallManifest(Path: String): Unit = js.native
  def InstallManifest(Path: String, InstallForAllUsers: Boolean): Unit = js.native
  
  def Item(Index: String): XmlNamespace = js.native
  def Item(Index: Double): XmlNamespace = js.native
  
  val Parent: js.Any = js.native
  
  val Value: String = js.native
  
  def _Default(Index: js.Any): XmlNamespace = js.native
}
