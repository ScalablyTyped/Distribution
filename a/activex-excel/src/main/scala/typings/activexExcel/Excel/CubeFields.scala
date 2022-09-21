package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CubeFields extends StObject {
  
  def apply(Index: String): CubeField = js.native
  def apply(Index: Double): CubeField = js.native
  
  def AddSet(Name: String, Caption: String): CubeField = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: XlCreator = js.native
  
  def Item(Index: String): CubeField = js.native
  def Item(Index: Double): CubeField = js.native
  
  val Parent: Any = js.native
  
  def _Default(Index: Any): CubeField = js.native
}
