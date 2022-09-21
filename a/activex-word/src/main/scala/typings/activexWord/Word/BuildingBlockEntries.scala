package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingBlockEntries extends StObject {
  
  /** @param Word.WdDocPartInsertOptions [InsertOptions=0] */
  def Add(Name: String, Type: WdBuildingBlockTypes, Category: String, Range: Range, Description: Any): BuildingBlock = js.native
  def Add(
    Name: String,
    Type: WdBuildingBlockTypes,
    Category: String,
    Range: Range,
    Description: Any,
    InsertOptions: WdDocPartInsertOptions
  ): BuildingBlock = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Any): BuildingBlock = js.native
  
  val Parent: Any = js.native
  
  /* private */ @JSName("Word.BuildingBlockEntries_typekey")
  var WordDotBuildingBlockEntries_typekey: BuildingBlockEntries = js.native
}
