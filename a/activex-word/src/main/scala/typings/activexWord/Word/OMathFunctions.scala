package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMathFunctions extends StObject {
  
  def Add(Range: Range, Type: WdOMathFunctionType): OMathFunction = js.native
  def Add(Range: Range, Type: WdOMathFunctionType, NumArgs: js.Any): OMathFunction = js.native
  def Add(Range: Range, Type: WdOMathFunctionType, NumArgs: js.Any, NumCols: js.Any): OMathFunction = js.native
  def Add(Range: Range, Type: WdOMathFunctionType, NumArgs: Unit, NumCols: js.Any): OMathFunction = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): OMathFunction = js.native
  
  val Parent: js.Any = js.native
  
  /* private */ @JSName("Word.OMathFunctions_typekey")
  var WordDotOMathFunctions_typekey: OMathFunctions = js.native
}
