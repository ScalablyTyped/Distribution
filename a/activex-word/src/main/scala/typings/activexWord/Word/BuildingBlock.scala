package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingBlock extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Category: typings.activexWord.Word.Category = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  var Description: String = js.native
  
  val ID: String = js.native
  
  val Index: Double = js.native
  
  def Insert(Where: Range): Range = js.native
  def Insert(Where: Range, RichText: js.Any): Range = js.native
  
  var InsertOptions: Double = js.native
  
  var Name: String = js.native
  
  val Parent: js.Any = js.native
  
  val Type: BuildingBlockType = js.native
  
  var Value: String = js.native
  
  @JSName("Word.BuildingBlock_typekey")
  var WordDotBuildingBlock_typekey: BuildingBlock = js.native
}
